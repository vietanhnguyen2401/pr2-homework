package Chapter3.Ex3;
import utils.TextIO_old;

public class ex3_4 {
    public static void main(String[] args) {
        String line;
        int i;
        char ch;
        boolean didCR;

        System.out.println("Enter a line of text.");
        System.out.print("");
        line = TextIO_old.getln();
        System.out.println();
        didCR = true;

        for ( i = 0;  i < line.length();  i++ ) {
            ch = line.charAt(i);
            if ( Character.isLetter(ch) ) {
                System.out.print(ch);
                didCR = false;
            }
            else {
                if ( didCR == false ) {
                    System.out.println();
                    didCR = true;
                }
            }
        }
        System.out.println();
    }
}
