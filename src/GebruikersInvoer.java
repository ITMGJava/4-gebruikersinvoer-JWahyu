import java.util.Scanner;

public class GebruikersInvoer {
    public static void main(String[] args) {

        // Voer een woord in en tel het aantal letters.

        System.out.println("Voer a.u.b. een woord in:");

        var scanWord = new Scanner(System.in);

        var inputWord = scanWord.nextLine();

        System.out.println("Het woord " + inputWord + " bevat " + inputWord.length() + " letters.");

        System.out.println();
        System.out.println("―――――――――――――――――――――");
        System.out.println();

        // Voer een getal in en maak een tafel ervan.

        System.out.println("Voer nu a.u.b. een getal in:");

        var scanNumber = new Scanner(System.in);

        var inputNumber = scanNumber.nextInt();

        System.out.println();

        System.out.println("Tafel van " + inputNumber + ":");

        for (int multiplicationNum = 1; multiplicationNum <= 10; multiplicationNum++){
            System.out.println(inputNumber + " x " + multiplicationNum + " = " + inputNumber * multiplicationNum);
        }
    }
}
