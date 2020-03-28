import javax.swing.*;
import java.util.Scanner;

public class Challenge {

    public static void main(String[] args) {
    /*
    How would you print "Hello World" in different ways?
    ----------------------------------------------------
    */
        firstMethod();
        secondMethod();
        thirdMethod();
    }

    public static void firstMethod(){

        //The Scanner class is used to get user input, and it is found in the java.util package.//
        Scanner scn = new Scanner(System.in);

        //'phrase' is a variable assigned with the correct value in this case.//
        String phrase = "Hello World";
        //'phraseInput' is another variable use for what are we going to type//
        String phraseInput;

        do {
            //Printing the output//
            System.out.println("--------------------------");
            System.out.println("¡Welcome to the challengeǃ");
            System.out.println("--------------------------");
            System.out.println("In order to succeed this challenge you will need to type the phrase: 'Hello World'");
            System.out.print("Enter phrase: ");
            phraseInput = scn.nextLine();
            //Comparing Strings//
            if (phrase.equals(phraseInput)) {
                System.out.println("Congrats! you have passed the challenge.");
                System.out.println("(っ ͡❛ ‿ ͡❛)っ\uD83C\uDF94");

            } else {
                System.out.println("Wrong answer mate!");
                System.out.println("(ಥ_ಥ) You introduce the phrase: " + phraseInput);
                System.out.println("Try again.");
            }
        }while (!phraseInput.equals(phrase)) ;
    }

    public static void secondMethod(){
        //Variables//
        String firstWord = "Hello";
        String secondWord = "World";

        System.out.println("--------------------------");
        System.out.println("¡Welcome to the challengeǃ");
        System.out.println("--------------------------");
        System.out.print("In this method we are using 'System.out.printf' to print the phrase: ");
        /*The printf() method of Java PrintStream class is a convenience method to write a String which is formatted to this output Stream.
        It uses the specified format string and arguments.*/
        System.out.printf("%s",firstWord  + " " + secondWord );
    }

    public static void thirdMethod(){
        //Variables//
        String phrase = "Hello World";
        String phraseInput;

        do {
            /*The JOptionPane class is used to provide standard dialog boxes such as message dialog box, confirm dialog box and input dialog box.
             These dialog boxes are used to display information or get input from the user. The JOptionPane class inherits JComponent class.*/
            JOptionPane.showMessageDialog(
                    null,
                        "---------------------------------------\n" +
                                 "¡Welcome to the challengeǃ\n" +
                                 "---------------------------------------\n" +
                                 "In order to succeed this challenge you will need to type the phrase: 'Hello World'\n"
            );

            phraseInput = JOptionPane.showInputDialog("Enter phrase: ");
            //Comparing Strings//
            if (phrase.equals(phraseInput)) {
                JOptionPane.showMessageDialog(null,"Congrats! you have passed the challenge.");
                JOptionPane.showMessageDialog(null,"(っ ͡❛ ‿ ͡❛)っ\uD83C\uDF94");

            } else {
                JOptionPane.showMessageDialog(null,"Wrong answer mate!");
                JOptionPane.showMessageDialog(null,"(ಥ_ಥ) You introduce the phrase: " + phraseInput);
                JOptionPane.showMessageDialog(null,"Try again.");
            }
        }while (!phraseInput.equals(phrase)) ;
    }

}

