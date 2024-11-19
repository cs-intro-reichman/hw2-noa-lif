// Demonstrates the Collatz conjecture.

public class Collatz {

    public static void main(String args[]) {
        int number = Integer.parseInt(args[0]);
        int counter = 1;

        System.out.print(number + " ");
        while (number != 1 || counter == 1) {
            if (number % 2 == 0) {
                number = number / 2;
            } else {
                number = number * 3;
                number++;
            }
            System.out.print(number + " ");
            counter++;
        }
        System.out.print("(" + counter + ")");
        System.out.println("Every one of the first " + number +" hailstone sequence reached 1.");
    }
}
