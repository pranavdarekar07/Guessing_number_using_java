import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(1,10);
        int userNumber;
        int chance = 0;

        System.out.println("Number guessing game\nThe rules are simple.\n1.Number are between (1 - 10).\n2.Alphabet is not allowed.\n3.You have 5 chances.");
        while (chance < 5) {
            System.out.print("Enter your number : ");
            if (scanner.hasNextInt()) {
                userNumber = scanner.nextInt();
                if (userNumber == 0 || userNumber < 0){
                    System.out.println("Invalid NUmber");
                } else if (userNumber > randomNumber) {
                    System.out.println("Guess Low");
                } else if (userNumber < randomNumber) {
                    System.out.println("Guess High");
                }else{
                    System.out.println("You win!!!");
                    break;
                }
                chance++;
            } else {
                System.out.println("only integer...");
                scanner.next();
                chance++;
            }
            System.out.printf("You have %d chances\n",5 - chance);


        }
        if (chance == 5){
            System.out.println("You lose");
            System.out.println("The Number is " + randomNumber);
        }else {
            System.out.printf("you win with in %d chance",chance);
        }
        scanner.close();
    }
}