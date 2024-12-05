package GuessingGame;
import java.util.Scanner;
import java.util.Random;


public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        int numberRand = random.nextInt(100);

        Scanner scanner = new Scanner(System.in);

        boolean isGameWin = false;

        for (int i = 5; i > 0; i--) {
            System.out.println("Você tem "+i+ " tentativa. "+"Qual numero estou pensando? ");
            int palpite = scanner.nextInt();

            if (palpite > numberRand) {
                if (i > 1) {
                    System.out.println("O seu palpite é maior que o numero que estou pensando, tente novamente.");
                }
            } else if (palpite < numberRand) {
                if (i > 1) {
                    System.out.println("O seu palpite é menor que o numero que estou pensando, tente novamente.");
                }
            } else{
                System.out.println("Você acertou o numero que eu estava pensando. Era: "+numberRand);
                isGameWin = true;
                break;
            }

        }
        if (!isGameWin){
            System.out.println("Você não conseguiu acertar o numero que eu estava pensando. O numero era: "+ numberRand);

        }



    }

}
