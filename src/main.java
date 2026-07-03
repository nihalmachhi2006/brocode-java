import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        guessNo();
    }

    static void guessNo() {
        Scanner sc = new Scanner(System.in);

        int num = 28;
        int guess;

        do {
            System.out.print("Enter Number between 1 to 100: ");
            guess = sc.nextInt();

            if (num > guess ) {
                System.out.println("its bigger than "+guess);
            } else if (num < guess) {
                System.out.println("its smaller than "+guess);
            } else {
                System.out.println("Your guess is right, number is "+guess);
            }

        } while (guess != num);

        sc.close();
    }


}