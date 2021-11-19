/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Matthew Wallace
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalculateTime {
    // Function to print difference in
    // time start_date and end_date
    
    
    
    
    public long findDifference(String start_date,String end_date){
  
        long timeDifference = 0;
        // SimpleDateFormat converts the
        // string format to date object
        SimpleDateFormat sdf
            = new SimpleDateFormat(
                "dd-MM-yyyy HH:mm");
  
        // Try Block
        try {
  
            // parse method is used to parse
            // the text from a string to
            // produce the date
            Date d1 = sdf.parse(start_date);
            Date d2 = sdf.parse(end_date);
  
            
            long difference_In_Time = d2.getTime() - d1.getTime();
  
            // Calucalte time difference in
            // seconds, minutes, hours, years,
            // and days
  
            long difference_In_Minutes
                = (difference_In_Time / (1000 * 60)) % 60;
  
            long difference_In_Hours
                = (difference_In_Time / (1000 * 60 * 60)) % 24;
  
            long difference_In_Years
                = (difference_In_Time / (1000l * 60 * 60 * 24 * 365));
  
            long difference_In_Days
                = (difference_In_Time / (1000 * 60 * 60 * 24)) % 365;
  
            // Print the date difference in
            // years, in days, in hours, in
            // minutes, and in seconds
  
            System.out.print(
                "Difference "
                + "between two dates is: ");
  /*
            System.out.println(
                difference_In_Years
                + " years, "
                + difference_In_Days
                + " days, "
                + difference_In_Hours
                + " hours, "
                + difference_In_Minutes
                + " minutes");
            */
            timeDifference = difference_In_Years + difference_In_Days + difference_In_Hours + difference_In_Minutes;
        }
  
        // Catch the Exception
        catch (ParseException e) {
            e.printStackTrace();
        }
        
        return timeDifference;
    }
}