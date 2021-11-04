
import static java.lang.Integer.parseInt;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Owner
 */
public class PGarage {
    //private int _carcount = 0;
    //private int _floors = 0;
    //private int _spaces = 0;
    //private int _totalSpaces = 0;
    //private int _avaliableSpaces = 0;

    //this array is meant to start empty
    public int[][] _parkingSpots = new int[5][20];
    
    //ADD METHOD TO COUNT PARKING SPOTS FILLED PER FLOOR
    
    public PGarage(){
        /*int[][] garage = new int[5][];
        
        garage[0] = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        garage[1] = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        garage[2] = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        garage[3] = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        garage[4] = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};  

        for(int[] arr: garage) {
            for(int n: arr) {
               _totalSpaces ++;
                System.out.print(n+" ");
            }
            System.out.println();
    }
         _avaliableSpaces = _totalSpaces;*/
    }
    
    public int[][] fillParkingSpot(String parkingSpot){
        //for every floor, if there is a car in a certain spot, then put a 1 in the filledSpots array in the same place as the car
        //add 1 to index spotNum-1 because there is no spot number 0
        if("A".equals(parkingSpot.substring(0,1))){
            int spotNum = parseInt(parkingSpot.substring(1,3));
            _parkingSpots[0][spotNum-1] = 1;
        }else if("B".equals(parkingSpot.substring(0,1))){
            int spotNum = parseInt(parkingSpot.substring(1,3));
            _parkingSpots[1][spotNum-1] = 1;
        }else if("C".equals(parkingSpot.substring(0,1))){
            int spotNum = parseInt(parkingSpot.substring(1,3));
            _parkingSpots[2][spotNum-1] = 1;
        }else if("D".equals(parkingSpot.substring(0,1))){
            int spotNum = parseInt(parkingSpot.substring(1,3));
            _parkingSpots[3][spotNum-1] = 1;
        }else if("E".equals(parkingSpot.substring(0,1))){
            int spotNum = parseInt(parkingSpot.substring(1,3));
            _parkingSpots[4][spotNum-1] = 1;
        }
        return _parkingSpots;
    }
    
    public int getCountFilledSpots(){
        int filledSpots = 0;
        
        for(int i = 0 ; i < _parkingSpots.length ; i++){
            for(int j = 0 ; j < _parkingSpots[i].length ; j++){
                if(_parkingSpots[i][j] == 1){
                    filledSpots ++;
                }
            }
        }
                    
        return filledSpots;
    }
    
    public boolean isSpotFilled(String parkingSpot){
        String floorLetter = parkingSpot.substring(0,1);
        int spotNum = parseInt(parkingSpot.substring(1,3));
        boolean isFilled = false;
        int floorIndex = -1;
        
        //convert floor letter to the proper index of the parking spot array
        if(floorLetter == "A"){
            floorIndex = 0;
        }else if(floorLetter == "B"){
            floorIndex = 1;
        }else if(floorLetter == "C"){
            floorIndex = 2;
        }else if(floorLetter == "D"){
            floorIndex = 3;
        }else if(floorLetter == "E"){
            floorIndex = 4;
        }
        
        if(_parkingSpots[floorIndex][spotNum] == 1){
            isFilled = true;
        }
        return isFilled;
    }
    
    public void showFilledSpots(){
        for(int i = 0 ; i <_parkingSpots.length ; i++){
            for(int j = 0 ; j < _parkingSpots[i].length ; j++){
                System.out.println(_parkingSpots[i][j]);
            }
        }
        
    }
    
   /*  
    public int countUp (){
        _carcount ++;
        _avaliableSpaces --;
        return _carcount;
    }
    public int countDown (){
        _carcount --;
        _avaliableSpaces ++;
        return _carcount;
    }
    public int getCCOunt(){
        System.out.println("Cars in Garage:" +_carcount);
        return _carcount;
    }
    public int getTSpaces(){
        System.out.println("Total Spaces:" + _totalSpaces);
        System.out.println(_avaliableSpaces);
        return _totalSpaces;
    }
    
    */
}
