import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;




public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        
        //array of months according to how many days
        ArrayList<Integer> months = new ArrayList<Integer>(12); // Create an ArrayList object
        months.add(31);
        months.add(28);
        months.add(31);
        months.add(30);
        months.add(31);
        months.add(30);
        months.add(31);
        months.add(31);
        months.add(30);
        months.add(31);
        months.add(31);
        months.add(31);
        

        //read from a file
        
        File testfile = new File("testfile.txt");  //open file from file path
        Scanner scanner = new Scanner(testfile);  //create scanner
        while (scanner.hasNextLine()){ 
            
            //break into substrings
            
            String line = scanner.nextLine();  //text file line to be split
            
            System.out.println(line);       //test print
            
            String hour = line.substring(0,2);
            String minute = line.substring(2,4);
            String day = line.substring(4,6);
            String month = line.substring(6,8);
            String year = line.substring(8,12);
            
            String hour2 = line.substring(12,14);
            String minute2 = line.substring(14,16);
            String day2 = line.substring(16,18);
            String month2 = line.substring(18,20);
            String year2 = line.substring(20,24);
            
            //change to ints
            int ihour = Integer.parseInt(hour);
            int iminute = Integer.parseInt(minute);
            int iday = Integer.parseInt(day);
            int imonth = Integer.parseInt(month);
            int iyear = Integer.parseInt(year);
            
            int ihour2 = Integer.parseInt(hour2);
            int iminute2 = Integer.parseInt(minute2);
            int iday2 = Integer.parseInt(day2);
            int imonth2 = Integer.parseInt(month2);
            int iyear2 = Integer.parseInt(year2);
            
            
            //total minutes counter for arrival and departure
            
            
            int checkinCount = (iyear*365)+iday;   //gets it to day
            
            for (int i = 0; i < imonth; i++){
                
                checkinCount += months.get(i);
                
                
            }
            checkinCount = (checkinCount*24)+ihour;    //gets to hours
            checkinCount = (checkinCount*60)+iminute; //gets to minutes
            
            
            
            
            int checkoutCount = (iyear2*365)+iday2;   //gets it to days
            
            for (int i = 0; i < imonth2; i++){
                
                checkoutCount += months.get(i);
                
                
            }
            
            checkoutCount = (checkoutCount*24)+ihour2;  //gets to hours
            checkoutCount = (checkoutCount*60)+iminute2;    //gets to minutes
            
            
            int totalStay = checkoutCount - checkinCount;
            
            System.out.println(totalStay + " minutes");
            
            
            double RATE = 2; // 2 cents per minute at the parking garage
            double minutesStayed = totalStay;
            double chargeAmount = (minutesStayed * RATE)/10; // 10 is to make the monetary value in cents
            
            System.out.println("Total Charge for CUSTOMER: $" + String.format("%.2f",chargeAmount) + "    Minutes Stayed: " + totalStay);
        }
        
        
        

    
   
        PGarage g1 = new PGarage();
        g1.getCCOunt();
        g1.countUp();
        g1.getCCOunt();
        g1.countUp();
        g1.getCCOunt();
        g1.countDown();
        g1.getCCOunt();
        g1.getTSpaces();
                

    }
}
