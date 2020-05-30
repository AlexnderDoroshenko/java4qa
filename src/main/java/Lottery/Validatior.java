package Lottery;

import java.util.Scanner;

public class Validatior {

    private static Scanner scanner = new Scanner(System.in);

    public static int saveIntInput(String message, int maxlength) {
        while (true) {
            try {
                System.out.print(message);
                System.out.flush();
                String input = String.valueOf(Integer.valueOf(scanner.nextLine()));
                int valueLength = input.length();
                int maxLengthStr = String.valueOf(maxlength).length();
                if(valueLength>maxLengthStr){
                    System.out.println("\nInvalid number.");
                    return Integer.valueOf(null);
                }else {
                    System.out.println("\nEntered Number is :" + input);
                    return Integer.valueOf(input);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number.");
            } catch (NullPointerException e){
                System.out.println("Invalid number.");
            }

        }
    }
}
