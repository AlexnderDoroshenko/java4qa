package Lottery;

import java.util.Scanner;

public class LotteryGame {
    private Scanner scanner = new Scanner(System.in);

    private final int drawSize;
    private final int drawLowerLimit;
    private final int drawUpperLimit;

    public LotteryGame(int drawSize, int drawLowerLimit, int drawUpperLimit) {
        this.drawSize = drawSize;
        this.drawLowerLimit = drawLowerLimit;
        this.drawUpperLimit = drawUpperLimit;
    }

    public void play() {
        // generate new random draw
        Draw draw = Draw.generateRandomDraw(drawSize, drawLowerLimit, drawUpperLimit);

        // let the user guess
        Draw userDraw = guess();

        // compare the draws and print result
        int rightNumbers = draw.compare(userDraw);
        int rightnumbersInRow = draw.getMatchesInRow(userDraw);
        System.out.println("Your guess numbers is: " + userDraw.getStringRepresentation());
        System.out.println("Lottery numbers is :   " + draw.getStringRepresentation());
        if(rightNumbers == 0){
            System.out.println("You guessed nothing.\n\rLOOSER !!!\n" +
                    "\n(_0_)");
            System.out.println();
        }
        else if(rightNumbers <3){
            System.out.println("You guessed not enough.\n\rLOOSER !!!\n" +
                    "\n⊂( ・ ̫・)⊃");
            System.out.println();
        }
        else if (rightNumbers == 3) {
            System.out.println("You guessed the " + rightNumbers + " numbers, your reward is $ 200!\n\rLUCKY YOU !!!\n" +
                    "\n( ‾ʖ̫‾)");
            System.out.println();
        }
        else if (rightNumbers > 3 && rightNumbers != drawSize) {
            System.out.println("You guessed the " + rightNumbers + " numbers, your reward is $ 500!\n\rLUCKY YOU !!!\n" +
                    "\n(☆▽☆)");
            System.out.println();
        } else {
            if (rightNumbers == drawSize && rightNumbers != rightnumbersInRow){
                System.out.println("You guessed the " + rightNumbers + " numbers, your reward is $ 500 000!\n\rOMG !!!\n" +
                        "\n(・∀・)");
                System.out.println();
            }else if (rightNumbers == drawSize && rightnumbersInRow == rightnumbersInRow) {
                System.out.println("You guessed " + rightNumbers + " numbers in a row, your reward is $ 1 000 000!" +
                        "\n\rWTF !!!\n\r(.)(.)");
                System.out.println();
            }
        }

        System.out.println("You have " + rightNumbers + " right matches!");
        String str1 = "jopa novyi god";
        System.out.println();
    }

    public Draw guess() {

        int[] numbers = new int[drawSize];
        while (true) {
            try {
                for (int i = 0; i < drawSize; i++) {
                    numbers[i] = Validatior.saveIntInput("Please enter the number " + (i+1) + ", and press ENTER: ", drawUpperLimit);
                }
                System.out.println();
                return new Draw(numbers);
            } catch (IllegalArgumentException e) {
                System.out.println("Numbers should to be unique\n");
            }
        }
    }

    public String getExplanationString() {
        StringBuilder sb = new StringBuilder();
        sb.append("You have to guess the numbers of a lottery draw.\n");
        sb.append("A draw consists of 8 different numbers.\n");
        sb.append("Each number in a range between 1 and 99.\n");
        sb.append("Then more numbers you guess right, then luckier you can be!\n");
        sb.append("Then more numbers you guess in a row, then richer you can be!\n");
        return sb.toString();
    }
}
