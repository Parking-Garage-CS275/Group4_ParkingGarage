

public class Main {
    public static void main(String[] args){
        
        String customer = "Example Name";
        double _RATE = 2; // 2 cents per minute at the parking garage
        int holderFromDavid = 40; //David wrote the hours and minutes as an Integer, will convert to double
        double minutesStayed = holderFromDavid; // this value should come from earlier in the code
        double chargeAmount = (minutesStayed * _RATE)/10; // this will calculate how many cents the customer is charged
    
        System.out.println("Total Charge for "+customer+" is: $"+String.format("%.2f",chargeAmount) + 
                "   Minutes Stayed: " + holderFromDavid);
    }
}
