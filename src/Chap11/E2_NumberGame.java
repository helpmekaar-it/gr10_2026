package Chap11;

import javax.swing.JOptionPane;

public class E2_NumberGame {

    public static void main(String[] args) {
        // TODO code application logic here
        int randomTwentyToThirty;
        int guessedNumber;
        int counter = 0;
        do {  
            counter++;
            randomTwentyToThirty = (int) ( (Math.random() * 10 + 20) ); 
            guessedNumber = Integer.parseInt(JOptionPane.showInputDialog(
                    "Guess nr OR type -1 to end"));
            System.out.println("rand nr is: " + randomTwentyToThirty + 
                    "\nguessed nr is: " + guessedNumber);
            if (randomTwentyToThirty == guessedNumber) {
                System.out.println("Match! " + guessedNumber +
                        " Number of tries: " + counter);
            }            
        } while (guessedNumber != -1 );
    }
    
}
