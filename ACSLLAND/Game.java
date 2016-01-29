import java.util.*;
/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game
{
    public static void main (String args[]) {
        System.out.println("         ");
        Scanner input = new Scanner(System.in);
        Marker a = new Marker();
        Marker b = new Marker();
        int 1pTurn = a.getTurn();
        int 2pTurn = b.getTurn();
        int rolls = input.nextInt();
        while ( rolls !=0) {
            1pTurn = a.getTurn();
            2pTurn = b.getTurn();
            if ( 1pTurn == 2pTurn) {
                a.changeposition(rolls);
            }
            else {
                b.changeposition(rolls);
            }

            rolls = input.nextInt();
        }
    }
    
}
class Marker {
    private int position = 0;
    private int turnNumber = 0;
    private int boardLength = 441;
    
    int getTurn() {
     return this.turnNumber;   
    }
    void changePosition(int roll) {
        if (roll ==4 || roll ==6) {
            this.position -= roll;
        }
        else {
            this.position += roll;
        }
        if (this.position < 0) {
            this.position =0;
        }
        if (this.position > (boardLength -1)) {
            this.position = (boardLength - 1);
        }
        this.turnNumber++;
    }

}