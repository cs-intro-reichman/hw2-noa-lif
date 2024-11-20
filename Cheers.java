// Prints a crowd cheering output.

public class Cheers {

    public static void main(String[] args) {
         String word = "" + args[0].toUpperCase();
         int times = Integer.parseInt(args[1]);

        String anLetters = "AEFHILMNORSX";

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            String aOrAn = "a  ";

            for (int j = 0; j < anLetters.length(); j++) {
                if (c == anLetters.charAt(j)) {
                    aOrAn = "an ";
                }
            }
            System.out.println("Give me " + aOrAn + c + ": " + c + "!");

        }
        System.out.println("What does that spell?");
        while (times > 0) {
            System.out.println(word + "!!!");
            times--;
        }

    }
}
