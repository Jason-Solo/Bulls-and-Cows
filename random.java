package bullscows;
import java.util.*;
import java.util.Scanner;


public class random {

    int sLength;
    String abc = "abcdefghijklmnopqrstuvwxyz";
    String abc1 = "0abcdefghijklmnopqrstuvwxyz";
        public ArrayList<String> sTime() {

            ArrayList<String> list = new ArrayList<>();
            for (int i=0; i<10; i++) {
                list.add(String.valueOf(i));
            }


            ArrayList<String> alphabet = new ArrayList<>();

            for (int x = 0; x < sLength - list.size(); x++ ) {
                alphabet.add(String.valueOf(abc.charAt(x)));
            }

            ArrayList<String>comboNum = new ArrayList<>(alphabet);
            comboNum.addAll(list);

            Collections.shuffle(comboNum);

            return comboNum;
        }

    public int random1() {

            String stars = "*************************************************";

            Scanner scanner = new Scanner(System.in);
            System.out.println("please, enter the secret code's length:");
            String tLength = scanner.nextLine();

            try {
                int numb = Integer.parseInt(tLength);
            } catch (NumberFormatException e) {
                System.out.println("Error: " + tLength + "isn't a valid number.");
                System.exit(0);
            }


        System.out.println("Input the number of possible symbols in the code:");
        this.sLength = scanner.nextInt();

        if(sLength < Integer.parseInt(tLength)) {
            System.out.println("Error: it's not possible to generate a code with a length of " + tLength + " with " + sLength + " unique symbols.");
        System.exit(0);
        }
        if (Integer.parseInt(tLength) <= 0) {
            System.out.println("Error: Length can't be less then 0");
            System.exit(0);
        }
        if (sLength > 36) {
            System.out.println("Error: maximum number of possible symbols in the code is 36 (0-9, a-z).");
            System.exit(0);
        }

        System.out.println("Okay, let's start a game!");
        System.out.println("The secret is prepared: " + stars.substring(0,Integer.parseInt(tLength)) + " (0-9, "+ abc.charAt(0) + "-" +abc1.charAt(sLength-10) + ").");
        return Integer.parseInt(tLength);
        }

    }
