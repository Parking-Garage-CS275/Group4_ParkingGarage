import java.sql.*;


public class Connect {
    
    public Connection connect() {
        String url = "jdbc:sqlite:main.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch(SQLException e){
            System.out.println("Connection ERROR: " + e.getMessage());
        }
        return conn;
    }
    
    public void createNewDatabase(){
        try(Connection conn = this.connect()){
            if(conn != null){
                DatabaseMetaData meta = conn.getMetaData();
                //System.out.println("The driver name is " + meta.getDriverName());
                //System.out.println("A new database has been created");
            }
        } catch(SQLException e){
            System.out.println("Database: " + e.getMessage());
        }
    }
    
    public void createAccountTable(){
        String sql = "CREATE TABLE IF NOT EXISTS ACCOUNTS (\n"
                + "     ID  INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n"
                + "     FirstName TEXT NOT NULL,\n"
                + "     LastName TEXT NOT NULL,\n"
                + "     Username TEXT,\n"
                + "     Password TEXT,\n"
                + "     Subscriber INTEGER NOT NULL\n"
                + ");";
        try(Connection conn = this.connect(); Statement stmt = conn.createStatement()){
            stmt.execute(sql);
        } catch(SQLException e){
            System.out.println("Accounts Table: " + e.getMessage());
        }
    }
    
    // subscriber true is 1 and subscriber false is 0
    public void insertAccount(String name, int subscriber){
        String sql = "INSERT INTO ACCOUNTS(FirstName, LastName, Subscriber) VALUES (?,?,?)";
        try (Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name.substring(0, name.indexOf(" ")).strip());
            pstmt.setString(2, name.substring(name.indexOf(" ")).strip());
            pstmt.setInt(3, subscriber);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    // subscriber true is 1 and subscriber false is 0
    public void insertAccount(String name, String username, String password, int subscriber){
        String sql = "INSERT INTO ACCOUNTS(FirstName, LastName, Username, Password, Subscriber) VALUES (?,?,?,?,?)";
        try (Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name.substring(0, name.indexOf(" ")).strip());
            pstmt.setString(2, name.substring(name.indexOf(" ")).strip());
            pstmt.setString(3, username.strip());
            pstmt.setString(4, password.strip());
            pstmt.setInt(5, subscriber);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void selectAllAccounts(){
        String sql = "SELECT * FROM ACCOUNTS";
        try (Connection conn = this.connect(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)){
            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t" + 
                                   rs.getString("FirstName") + " " + rs.getString("LastName") + "\t" +
                                   rs.getString("Username") + "\t" +
                                   rs.getString("Password") + "\t" +
                                   rs.getInt("Subscriber"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void createSpotsTable(){
        String sql = "CREATE TABLE IF NOT EXISTS SPOTS (\n"
                + "     ID  INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n"
                + "     SpotNumber TEXT, \n"
                + "     CheckInTime TEXT\n"
                + ");";
        try(Connection conn = this.connect(); Statement stmt = conn.createStatement()){
            stmt.execute(sql);
        } catch(SQLException e){
            System.out.println("Spots Table: " + e.getMessage());
        }
    }
    
    public void insertSpot(String SpotNumber){
        String sql = "INSERT INTO SPOTS(SpotNumber) VALUES (?)";
        try (Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, SpotNumber);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void selectAllSpots(){
        String sql = "SELECT * FROM SPOTS";
        try (Connection conn = this.connect(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)){
            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t" + 
                                   rs.getString("SpotNumber") + "\t" +
                                   rs.getString("CheckInTime"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void createTakenSpotTable(){
        String sql = "CREATE TABLE IF NOT EXISTS TAKENSPOTS (\n"
                + "     ID  INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n"
                + "     SpotID TEXT NOT NULL,\n"
                + "     AccountID TEXT NOT NULL,\n"
                + "     FOREIGN KEY (SpotID) REFERENCES SPOT(ID),\n"
                + "     FOREIGN KEY (AccountID) REFERENCES ACCOUNT(ID)\n"
                + ");";
        try(Connection conn = this.connect(); Statement stmt = conn.createStatement()){
            stmt.execute(sql);
        } catch(SQLException e){
            System.out.println("Taken Table: " + e.getMessage());
        }
    }
    
    public void insertTakenSpot(String SpotID, String AccountID){
        String sql = "INSERT INTO TAKENSPOTS(SpotID,AccountID) VALUES (?,?)";
        try (Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, SpotID);
            pstmt.setString(2, AccountID);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void selectAllTakenSpots(){
        String sql = "SELECT TAKENSPOTS.id, SpotId, SpotNumber, AccountID, FirstName, LastName, Subscriber FROM TAKENSPOTS INNER JOIN SPOTS ON SPOTS.ID = TAKENSPOTS.SpotID INNER JOIN ACCOUNTS ON ACCOUNTS.ID = TAKENSPOTS.AccountID";
        try (Connection conn = this.connect(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)){
            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t" + 
                                   rs.getString("SpotID") + "\t" +
                                   rs.getString("SpotNumber") + "\t" +
                                   rs.getString("AccountID") + "\t" + 
                                   rs.getString("FirstName") + " " + rs.getString("LastName") + "\t" + 
                                   rs.getInt("Subscriber"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    
    
    
    public static void main(String[] args) {
        //connect();
        Connect db = new Connect();
        
        db.createNewDatabase();
        db.createAccountTable();
        db.createSpotsTable();
        db.createTakenSpotTable();
        
        db.insertAccount("Henry Wilt", 0);
        db.insertAccount("Steve Wilkins", 1);
        db.insertAccount("Dylan Simms", "username", "password", 1);
        
        db.selectAllAccounts();
        
        for(int i = 1; i <= 10; i++){
            db.insertSpot("A" + i);
        }
        db.selectAllSpots();
        
        db.insertTakenSpot("1", "2");
        db.insertTakenSpot("5", "1");
        
        db.selectAllTakenSpots();
        
        
    }
    
    
}
