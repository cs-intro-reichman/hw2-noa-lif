public class Collatz {

    public static void main(String args[]) {
        int number = Integer.parseInt(args[0]);
        char cOrV = (args[1].charAt(0));
        
        boolean verbose = true;
        if (cOrV == 'c') {
            verbose = false;
        }

        for (int i = 1; i <= number; i++) {
            int collatz = i;
            if (verbose) {
                System.out.print(collatz + " ");
            }
            int counter = 1;
            while (collatz != 1 || counter == 1) {
                if (collatz % 2 == 0) {
                    collatz = collatz / 2;
                } else {
                    collatz = collatz * 3;
                    collatz++;
                }
                if (verbose) {
                    System.out.print(collatz + " ");
                }
                counter++;
            }
            if (verbose) {
                System.out.print("(" + counter + ")\n");
            }
        }
        System.out.println("Every one of the first " + number + " hailstone sequence reached 1.");
    }
}
