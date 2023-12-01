package generate.stars;

import java.util.Scanner;

public class GenerateStars {

    public static void main(String[] args) {
        Input.run();
        Stars.star(0);
    }

}

class Stars {

    public static void star(int num) {

        int k = 0;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            for (k = 0; k <= i * 2; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = num - 1; i > 0; i--) {

            for (int j = 0; j < num - i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 2 * i - 1; j > 0; j--) {
                System.out.print("*");

            }
            System.out.println();
        }

    }

}

class Input {

    public static void run() {
        Scanner input = new Scanner(System.in);
        System.out.println("Give a value for number of line:");
        int num = input.nextInt();
        Stars.star(num);
    }
}
