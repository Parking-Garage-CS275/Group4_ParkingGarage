/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Owner
 */
public class PGarage {
    private int _carcount = 0;
    private int _floors = 0;
    private int _spaces = 0;
    private int _totalSpaces = 0;
    private int _avaliableSpaces = 0;
    
    public PGarage(){
        int[][] garage = new int[5][];
        
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
         _avaliableSpaces = _totalSpaces;
    }
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
}
