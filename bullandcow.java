package bullscows;

import java.util.Scanner;

public class bullandcow {


    public void bullandcow1() {
        random ran = new random();

        var scanner = new Scanner(System.in);
        int codeLen = ran.random1();
        var arrCode = ran.sTime();
        String[] numCode;
        var turn = 1;
        var bulls = 0;
        var cows = 0;

        while (bulls < codeLen) {

            bulls = 0;
            cows = 0;
            System.out.println("Turn " + turn + ":");

            numCode = scanner.nextLine().split("");


            for (int x = 0; x < codeLen; x++) {
                    if (numCode[x].equals(arrCode.get(x))) {
                        bulls++;
                    }
                }

            for (int x = 0; x < codeLen; x++) {
                for (int y = 0; y < codeLen; y++) {
                    if(x != y) {
                        if (numCode[x].equals(arrCode.get(y))) {
                            cows++;
                        }
                    }
                }
            }
            turn++;

            System.out.println("Grade: " + bulls + " bull(s) and " + cows + " cow(s). ");
        }

        System.out.println("Congratulations! You guessed the secret code.");
    }
}
