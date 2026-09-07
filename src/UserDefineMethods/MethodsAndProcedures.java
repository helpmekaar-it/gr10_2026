/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UserDefineMethods;

/**
 *
 * @author Sean.Barber
 */
public class MethodsAndProcedures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(displayHeader());
        //for (int i = 0; i < 10; i++) {
        //    int ran = (int) (Math.random() * 1000);
        //    System.out.println((i + 1) + "\t" + ran);
        //}
        //System.out.println("0 is even ? " + isEven(0));
        int number1 = 50;
        int number2 = 60;
        int highest = getHighest(number1, number2);
        System.out.println("The highest number between "
                + number1 + " and " + number2 + " is "
        + highest);
    }
    //public static void displayHeader(){
    public static int displayHeader(){
        //System.out.println("#\tNumber");        
        return (int) (Math.random() * 1000);
    }
        
    public static int getHighest(int inNum1, int inNum2) {
        if (inNum1 > inNum2) {
            return inNum1;
        } else {
            return inNum2;
        }
    }
    
    public static boolean isEven(int inNum){
        if (inNum % 2 == 0) {
            return true;
        } else {
            return false;
        }        
    }
    
}
