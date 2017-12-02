//This class does most the work of the program for the dice program.
import java.util.*;
import java.util.Random;
public class die {

    public int die;
    
    public die(){
        int die = -1;
    }
    public int CreatePairOfDice(int die){
        die = (int)(Math.random() * 6) + 1;
        return die;
    }
    public void printLine(){
        int number;
        number = CreatePairOfDice(die);
        
        switch (number) {
            case 1:
                System.out.println( "     ");
                System.out.println( "  *  ");
                System.out.println( "     ");
                System.out.println( "_____");
                break;
            case 2:
                System.out.println( "*    ");
                System.out.println( "     ");
                System.out.println( "    *");
                System.out.println( "_____");
                break;
            case 3:
                System.out.println( "*    ");
                System.out.println( "  *  ");
                System.out.println( "    *");
                System.out.println( "_____");
                break;
            case 4:
                System.out.println( "*   *");
                System.out.println( "     ");
                System.out.println( "*   *");
                System.out.println( "_____");
                break;
            case 5:
                System.out.println("*   *");
                System.out.println("  *  ");
                System.out.println("*   *");
                System.out.println("_____");
                break;
            case 6:
                System.out.println("*   *");
                System.out.println("*   *");
                System.out.println("*   *");
                System.out.println("_____");
                break;
                default:
                break;
        }
    }
}
