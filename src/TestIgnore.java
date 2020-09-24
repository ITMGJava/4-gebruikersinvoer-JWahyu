import java.util.Scanner;

public class TestIgnore {
    public static void main(String[] args) {

        // Voer een woord in en tel het aantal letters.

        System.out.println("Voer a.u.b. een woord in:");

        var input = new Scanner(System.in);

        var inputWord = input.nextLine();

        System.out.println("Het woord " + inputWord + " bevat " + inputWord.length() + " letters.");

        System.out.println();
        System.out.println("―――――――――――――――――――――");
        System.out.println();

        // Voer een getal in en maak een tafel ervan.

        System.out.println("Voer nu a.u.b. een getal in:");

        var inputNumber = input.nextInt();

        System.out.println();

        System.out.println("Tafel van " + inputNumber + ":");

        for (int multiplicationNum = 1; multiplicationNum <= 10; multiplicationNum++){
            System.out.println(multiplicationNum + " x " + inputNumber + " = " + inputNumber * multiplicationNum);
        }
    }

}
