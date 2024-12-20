// Computes an approximation of PI.

public class CalcPi {

    public static void main(String[] args) {
        int numOfItems = Integer.parseInt(args[0]);

        double sum = 0;
        for (int i = 1; i < numOfItems * 2; i = i + 2) {
            if ((i + 1) % 4 == 0) {
                sum = sum - (1.0 / i);
            } else {
                sum = sum + (1.0 / i);
            }
        }

        System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated:     " + sum * 4);
    }
}
