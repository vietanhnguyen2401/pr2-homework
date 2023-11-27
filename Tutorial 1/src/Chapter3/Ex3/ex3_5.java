package Chapter3.Ex3;
import utils.TextIO_old;

public class ex3_5 {
    public static void main( String[] args ) {

        try {
            TextIO_old.readFile("sales.dat");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Can't open file \"sales.dat\" for reading!");
            System.out.println("Please make sure the file is present before");
            System.out.println("running the program.");
            System.exit(1);  // Terminates the program.
        }

        /* Read the file, keeping track of total sales and missing data. */

        double salesTotal;  // Total of all sales figures seen so far.
        int missingCount;   // Number of cities for which data is missing.

        salesTotal = 0;
        missingCount = 0;

        while ( ! TextIO_old.eof() ) {  // process one line of data.

            char ch;  // For reading past the name of the city.
            String dataString;  // Contents of line, after the city name.
            double sales;  // The sales figure for the city.

            do {  // Read past characters up to the ':'.
                ch = TextIO_old.getChar();
            } while (ch != ':');

            dataString = TextIO_old.getln();  // Get the rest of the line.

            try {
                sales = Double.parseDouble(dataString);
                salesTotal += sales;  // This is skipped if the conversion fails.
            }
            catch (NumberFormatException e) {
                // The dataString is not a number, so it counts as
                // missing data.  Add 1 to the missing data count.
                missingCount++;
            }

        } // end while

        /* Report the results. */

        System.out.printf("Total sales recorded from all cities: $%1.2f\n\n", salesTotal);
        if (missingCount == 0)
            System.out.println("Data was received from all cities.");
        else if (missingCount == 1)
            System.out.println("Data was missing from 1 city.");
        else
            System.out.printf("Data was missing from %d cities.\n", missingCount);

    }
}
