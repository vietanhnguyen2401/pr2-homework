package Chapter3.Ex2;
import utils.TextIO;
public class ex2_5 {
    public static void main(String[] args) {

        int eggs;
        int gross;
        int aboveGross;
        int dozens;
        int extras;

        System.out.print("How many eggs do you have?  ");
        eggs = TextIO.getlnInt();
        gross=eggs/144;
        aboveGross=eggs%144;
        dozens = aboveGross / 12;
        extras = aboveGross % 12;

        System.out.print("Your number of eggs is "+gross+" gross, "+ dozens+" dozen and "+extras+" extras");
        System.out.println();
    }
}
//


