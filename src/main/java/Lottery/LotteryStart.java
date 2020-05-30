package Lottery;

import java.util.Scanner;

public class LotteryStart {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LotteryGame game = new LotteryGame(8, 1, 8);
        System.out.println(game.getExplanationString());
        boolean run = true;
        while (run) {
            game.play();
            System.out.print("Continue (Y / N): ");
            System.out.flush();
            run = scanner.nextLine().equalsIgnoreCase("Y");
            System.out.println();
        }
    }
}