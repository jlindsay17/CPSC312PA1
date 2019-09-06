//CPSC 312, Fall 2019
//PA1
//Jackson Lindsay
//no sources to cite
//This program is supposed to run hangman but I had issues learning java syntax
//So it mostly just lets you play a 1-sided game of hangman
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
while not out of incorrect guesses or while word not complete... run the program
Random function selects a word from array of possible words
Prompts user to guess
First checks if guess is in the list of available guesses... else let the user know it is
1. not a valid guess if it isnt in either array or
2. already been guessed if its in the array of used guesses
If correct then replace elements in arrays(swap)
if incorrect, number incorrect increases by 1 (up to 7)
*/



public class Main {
    public static void main(String[] args) {
        //Array of words available to play with
        String[] myWords = {"persist", "single", "fitness", "attract", "prey", "bishop", "quantity", "instruction", "seize", "island"};
        //Array of characters still available to be guessed
        char[] availableLetters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
                'r', 's', 't', 'u', 'v', 'w', 'h', 'y', 'z'};
        //Array of characters that have already been guessed
        char[] visibleLetters = {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'};
        System.out.println("Letters guessed: " + Arrays.toString(visibleLetters)); //Prints out guessed letters
        System.out.println("Letters not yet guessed: " + Arrays.toString(availableLetters)); //Prints out available letters
        System.out.println("Would you like to play Hangman? ( Enter yes/no)"); //Asks user whether or not they would like to play
        int incorrectGuesses = 0;

        //User chooses to play
        Scanner choiceObj = new Scanner(System.in);
        String playChoice = choiceObj.nextLine();
        if (playChoice.toString() == "yes"){
            System.out.println("you chose yes");
        }
        if (playChoice.toString() == "no"){
            System.out.println("you chose no");
        }


        System.out.println("playChoice is: " + playChoice);

        //Uses a random integer to determine which of the 10 words will be guessed
        Random random = new Random();
        int randInt = random.nextInt(10); // [0, 10)
        System.out.println(randInt);

        //Determines the random word to be guessed
        String wordToGuess = myWords[randInt];
        System.out.println("The word to guess is: " + wordToGuess);

        //delete later
        System.out.println("They only see: ");

        //Shows the guesser how long the word is without revealing
        int wordLength = wordToGuess.length();
        System.out.println("The word you are guessing is: ");

        //Prints out the censored version of the word being guessed
        for (int i = 0; i < wordLength; i++){
            System.out.print('*');
        }

        //Prompts the user to guess a letter
        Scanner guessObj = new Scanner(System.in);
        System.out.println("Guess a letter.");
        String playerGuess = guessObj.next();

        //If the letter is in the word --> will appear in the solution
        //If not in word, incorrect guesses will increment
        //Not working
       /*
        for (int k = 0; k < wordLength; k++){
            if (playerGuess == wordToGuess.charAt(k)){
                System.out.println(playerGuess + " is in the word!");
            }
            else{
                incorrectGuesses +=1;
            }

        */
        }





    }
}