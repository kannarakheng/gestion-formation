package Pratique;

import java.util.Scanner;
import java.util.Random;
  
class Game {
  
    static Scanner input;
    public static void hangman()
    {
        input = new Scanner(System.in);
        
        /*
        // array of strings containing words
        String[] company = { "Maruti", "Tata", "Suzuki",
                             "Ducati", "Toyota" };
        System.out.println(
            "    Welcome to HANGMAN GAME    ");
  
        Random obj = new Random();
        int Ran_num = obj.nextInt(5);
        */
  
        // takes input of the word
        //String word = (company[Ran_num]);

        System.out.println("Entrer un mot :");
        String motRecherche = input.nextLine();

        motRecherche = motRecherche.toUpperCase();
        //System.out.println("word=" + word);
  
        // To show the word in underscores
        String motActuelDevine = motRecherche.replaceAll("[A-Z]", "_ ");
        //System.out.println("word1=" + word1);
  
        // play the game
        System.out.println();
        System.out.println("Jouons ensemble");
        startGame(motRecherche, motActuelDevine);
    }

    public static void startGame(String motRecherche, String motActuelDevine)
    {
        // total guesses
        //int guess_ = 0;
  
        // number of wrong guesses
        int wrong = 0;
  
        // for each guess
        String guess;
  
        // stores the guessed letter
        char letter;
  
        // stores if the letter was
        // already guessed
        boolean guessescontainsguess;
        String guesses = "";
        boolean guessinword;
  
        // while loop starts here
        while (wrong < 5 && motActuelDevine.contains("_")) {
  
            System.out.println(motActuelDevine + "\n");
            int temp = 5 - wrong;
            if (wrong != 0) {
  
                // for picture 1
                System.out.println("Il te reste " + temp
                                   + " tentatives.");
            }
  
            System.out.print("Ta réponse:");
  
            // takes guess input
            guess = input.nextLine();
  
            // converts to uppercase
            // for comparison
            guess = guess.toUpperCase();
  
            // gets the first letter
            // as guessed letter
            // on convertit une chaine de caractères en un caractère char
            letter = guess.charAt(0);
            System.out.println(letter);
            
            // si l'utilisateur a deja deviné la lettre 
            guessescontainsguess
            //    = (guesses.indexOf(guess)) != -1;
  
                = (guesses.indexOf(letter)) != -1;
            // stores every letter
            // guessed in guesses
            guesses += letter;
  
            // converts to uppercase for
            // comparison
            letter = Character.toUpperCase(letter);
            System.out.println();
  
            // if letter already guessed
            if (guessescontainsguess == true) {
  
                // already guessed letter
                System.out.println("Tu as DEJA trouvé la lettre "
                                   + letter + ". \n");
            }
  
            // guessed letter is in the word
            guessinword = (motRecherche.indexOf(letter)) != -1;
  
            // if statement begins
            if (guessinword == true) {
  
                // print the letter
                System.out.println(
                    letter + " est présent dans le mot.");
                System.out.print("\n");
  
                // find the letter positions
                // replace dashes with those
                // letter at valid positions
                for (int position = 0;
                     position < motRecherche.length(); position++) {
  
                    // guessed letter is equal to
                    // letter at position in word
                    // and word1 has previously does not
                    // have that letter
                    if (motRecherche.charAt(position) == letter
                        && motActuelDevine.charAt(position)
                               != letter) {
  
                        motActuelDevine = motActuelDevine.replaceAll("_ ", "_");
                        String word2;
                        word2 = motActuelDevine.substring(0, position)
                                + letter
                                + motActuelDevine.substring(position
                                                  + 1);
                        word2 = word2.replaceAll("_", "_ ");
                        motActuelDevine = word2;
                    }
                }
            }
  
            // if statement ends, else if begins
            else {
  
                // prints
                // wrong = wrong + 1, after every
                // wrong answer
                System.out.println(
                    letter
                    + " n'est pas present dans le mot.");
                wrong++;
            }
  
            // guess_ = guess_ + 1, after every
            // attempt
            //guess_++;
  
        } // while loop ends
  
        // if the lifelines finishes
        if (wrong == 5) {
            System.out.println(
                "TU AS PERDU!, le nombre maximum de tentatives incorrectes est atteint.");
        }
        else {
  
            // when solved
            System.out.print(
                "Le mot est: " + motActuelDevine
                + "\n Bien joué, tu as trouvé le bon mot!!!");
        }
    }
    public static void main(String[] args)
    {
        // play hangman game
        hangman();
    }
}
    

