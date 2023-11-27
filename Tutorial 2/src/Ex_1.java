import utils.TextIO;
public class Ex_1 {
    public static void main(String[] args) {
        String line;
        TextIO.putln("Enter a line of text: ");
        line = TextIO.getln();
        TextIO.putln();
        TextIO.putln("Capitalized version: ");
        printCapitalized( line );
    }


    static void printCapitalized( String str ) {
        char ch;
        char prevCh;
        int i;
        prevCh = '.';
        for ( i = 0;  i < str.length();  i++ ) {
            ch = str.charAt(i);
            if ( Character.isLetter(ch)  &&  ! Character.isLetter(prevCh) )
                System.out.print( Character.toUpperCase(ch) );
            else
                System.out.print( ch );
            prevCh = ch;
        }
        System.out.println();
    }
}
