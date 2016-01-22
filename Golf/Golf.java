import java.util*;
/**
 * Write a description of class Golf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Golf
{
    public static void main(String [] args) {
        System.out.println(" Input par and score (input stop to stop)");
        Scanner scan = new Scanner();
        
    }
}
class Player {
    int cumPar = 0;
    int cumScore = 0;
    void addHole(int newPar, int newScore) {
        cumPar = cumPar + newPar
        cumScore = cumScore + newScore
    }
    void results() {
         int compare = cumScore - cumPar;
    }
    
    
    
}