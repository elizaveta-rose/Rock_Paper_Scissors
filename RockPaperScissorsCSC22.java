import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random randGen = new Random();
        String userName;                         
        int userChoice; 
        int userScore = 0;                                        // Initialize userScore to 0
        int computerScore = 0;                                    // Initialize computerScore to 0
        int computerChoice;                         

        System.out.print("Enter your name: ");                    // Prompt user to enter their name
        userName = scnr.next();                                   // Get user's name from input
        System.out.println();
        System.out.println("1) Rock");                            // Print 1) Rock
        System.out.println("2) Paper");                           // Print 2) Paper
        System.out.println("3) Scissors");                        // Print 3) Scissors
        System.out.println("0) End game");                        // Print 0) End Game
        System.out.print("Enter a choice: ");                     // Prompt user to enter their choice
        userChoice = scnr.nextInt();                              // Get first user choice from input

        computerChoice = randGen.nextInt(3 - 1 + 1) + 1;          // Generate computer's choice at random
        while (userChoice != 0) {                                 // Loops until 0 is entered by user
            if ((userChoice == 1) && (computerChoice == 1)) {     // If userChoice and computerChoice are both 1
                System.out.println("Computer picks Rock!");        // Print Computer picks Rock!
                System.out.println("A tie!");                      // Print A tie!
            }
            else if ((userChoice == 1) && (computerChoice == 2)) {  // If userChoice is 1 and computerChoice is 2
                System.out.println("Computer picks Paper!");         // Print Computer picks Paper!
                System.out.println("Paper covers Rock! Computer wins!");  // Paper covers Rock! Computer wins!
                computerScore += 1;                                    // Add 1 to computerScore
            }
            else if ((userChoice == 1) && (computerChoice == 3)) {      // If userChoice is 1 and ComputerChoice is 3
                System.out.println("Computer picks Scissors!");         // Print Computer picks Scissors!
                System.out.println("Rock crushes Scissors! You win!");  // Print Rock crushes Scissors! You win!
                userScore += 1;                                         // Add 1 to userScore
            }
            else if ((userChoice == 2) && (computerChoice == 1)) {     // If userChoice is 2 sand compjuterChoice is 1
                System.out.println("Computer picks Rock!");            // Print Computer picks Rock!
                System.out.println("Paper covers Rock! You win!");     // Paper covers Rock! You win!
                userScore += 1;                                        // Add 1 to userScore
            }
            else if ((userChoice == 2) && (computerChoice == 2)) {     // If userChoice and computerChoice are both 2
                System.out.println("Computer picks Paper!");           // Print Computer picks Paper!
                System.out.println("A tie!");                          // Print A tie!
            }
            else if ((userChoice == 2) && (computerChoice == 3)) {         // If userChoice is 2 and computerCHoice is 3
                System.out.println("Computer picks Scissors!");            // Print Computer picks Scissors!
                System.out.println("Scissors cut Paper! Computer wins!");  // Print Scissors cut Paper! Computer wins!
                computerScore += 1;                                        // Add 1 to computerScore
            }
            else if ((userChoice == 3) && (computerChoice == 1)) {            // If userChoice is 3 and computerChoice is 1
                System.out.println("Computer picks Rock!");                   // Print Computer picks Rock!
                System.out.println("Rock crushes Scissors! Computer wins!");  // Rock crushes Scissors! Computer wins!
                computerScore += 1;                                           // Add 1 to computerScore
            }
            else if ((userChoice == 3) && (computerChoice == 2)) {            // If userChoice is 3 and computerChoice is 2
                System.out.println("Computer picks Paper!");                  // Print COmputer picks Paper!
                System.out.println("Scissors cut paper! You win!");           // Print Scissors cut Paper! You win!
                userScore += 1;                                               // Add 1 to userScore
            }
            else if ((userChoice == 3) && (computerChoice == 3)) {            // If userChoice and computerChoice are both 3
                System.out.println("Computer picks Scissors!");               // Print Computer picks Scissors!
                System.out.println("It's a tie!");                            // Print It's a tie!
            }
            System.out.println("1) Rock");                                    // Print 1) Rock
            System.out.println("2) Paper");                                   // Print 2) Paper
            System.out.println("3) Scissors");                                // Print 3) Scissors
            System.out.println("0) End game");                                // Print 0) End game
            System.out.print("Enter a choice: ");                             // Prompt user to enter another choice
            userChoice = scnr.nextInt();                                      // Get user's choice from input
            computerChoice = randGen.nextInt(3 - 1 + 1) + 1;                  // Generate new computer choice
        }
        System.out.println("Final score-- " + userName + ": " + userScore + ", Computer: " + computerScore);  // Output user's name and score, Computer: comoputer's score
        if (userScore > computerScore) {                                                                      // If userScore > computerScore
            System.out.println("You won!");                                                                   // Print You won!
        }
        else if (userScore < computerScore) {                                                                 // If userScore < computerScore
            System.out.println("Computer won!");                                                              // Computer won!
        }
        else {                                                                                               // If userScore is equivalent to computerScore
            System.out.println("It's a tie!");                                                               // Print It's a tie!
        }
        System.out.println("Come back and play again!");                                                    // Print Come back and play again!
    }

}
