import java.util.Scanner;

public class Challenge {

    public static void main(String[] args) {
    /*
    How would you print "Hello World" in different ways?
    ----------------------------------------------------
    */
        firstMethod();
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
}
