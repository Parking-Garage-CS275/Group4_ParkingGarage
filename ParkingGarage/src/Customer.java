public class Customer {
    private static String NAME;
    private static int ID;
    private static int PARKING_SPOT;
    private static boolean PAID;
    private static String CHECK_IN;
    
    
    /*
    Constructor for customer, takes in the line of data to split it up and put
    said data into variables
    Param: String of the line of data
    */
    public Customer(String Data){
        System.out.println("NEW CUSTOMER");
        String[] tokens = Data.split(",");
        ID = Integer.parseInt(tokens[0]);
        NAME = tokens[1] + " " + tokens[2];
        PARKING_SPOT = Integer.parseInt(tokens[3]);
        CHECK_IN = tokens[4];
        PAID = Boolean.getBoolean(tokens[5]);
        //System.out.println(Data);
    }
    
    /*
    Constructor which doesnt take in any data and is just a empty object
    DO NOT USE AT THE MOMENT (SPRINT 1)
    */
    public Customer(){
    }
    
    /*
    Change Paid variable to the opposite of the current state
    True would then be false;
    False would then be true;
    */
    public static void changePAID(){
        if(PAID){
            PAID = false;
        }
        else{
            PAID = true;
        }
    }
    
    /*
    Change the check in Time/Date
    Param: String of the Time/Date
    */
    public static void changeCheckIn(String _NewDate){
        CHECK_IN = _NewDate;
    }
    
    public static String getNAME(){
        return NAME;
    }
    
    public static int getID(){
        return ID;
    }
    
    public static int getParkingSpot(){
        return PARKING_SPOT;
    }
    
    public static boolean getPAID(){
        return PAID;
    }
    
    public static String getCheckIn(){
        return CHECK_IN;
    }
    
    
    /*
    To String method
    */
    public String toString(){
        String[] NAMES = NAME.split(" ");
        return ID + "," + NAMES[0] + "," + NAMES[1] + "," + PARKING_SPOT + "," + CHECK_IN + "," + PAID;
    }
}
