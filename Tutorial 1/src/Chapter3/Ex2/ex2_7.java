package Chapter3.Ex2;
import utils.TextIO_old;
public class ex2_7 {
    public static void main(String[] args){
        String name;
        int exam1, exam2, exam3;
        double average;

//        TextIO_old.put("What is your name? ");
//        name = TextIO_old.getln();
//        TextIO_old.put("What is exam 1 result? ");
//        exam1 = TextIO_old.getlnInt();
//        TextIO_old.put("What is exam 2 result? ");
//        exam2 = TextIO_old.getlnInt();
//        TextIO_old.put("What is exam 3 result? ");
//        exam3 = TextIO_old.getlnInt();
//
//        TextIO_old.writeFile("testdata.txt");  // subsequent output goes to file
//        TextIO_old.putln("Name: " + name);
//        TextIO_old.putln("Exam 1: " + exam1);
//        TextIO_old.putln("Exam 2: " + exam2);
//        TextIO_old.putln("Exam 3: " + exam3);


        TextIO_old.readFile("testdata.txt");  // Read from the file.

        name = TextIO_old.getln();  // Reads the entire first line of the file.
        exam1 = TextIO_old.getlnInt();
        exam2 = TextIO_old.getlnInt();
        exam3 = TextIO_old.getlnInt();

        average = ( exam1 + exam2 + exam3 ) / 3.0;
//        TextIO_old.writeStandardOutput();
        System.out.printf("The average grade for %s was %1.1f", name, average);
        System.out.println();

    }

}

