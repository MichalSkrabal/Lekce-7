import java.util.Random;
import java.util.Arrays;

public class PoleDeklarace {
    public static void main(String[] args) {
        Random r = new Random();

        int[] pole = new int[11];

        // Přiřazení prvků na indexy
        pole[0] = 15;
        pole[10] = 33547;
        System.out.println("Prvni prvek pole: " + pole[0]);
        printIndex(pole, 0);

        // Naplnění pole náhodnými hodnotami
        for (int i = 0; i < pole.length; i++) {
            pole[i] = r.nextInt(1000); // Hodnoty mezi 0 a 999
        }

        // Tisk celého pole
        tiskniCelePole(pole);
        tiskniCelePoleForEach(pole);

        // Řazení a tisk pole
        Arrays.sort(pole);
        System.out.println("Serazene pole: " + Arrays.toString(pole));

        // Práce s dvourozměrným polem
        System.out.println("Nize pracujeme s dvourozmernym polem:");
        int[][] pole2 = {
                {1, 2, 3},
                {2, 3, 4, 5},
                {4}
        };

        for (int i = 0; i < pole2.length; i++) {
            System.out.println(Arrays.toString(pole2[i]));
            for (int j = 0; j < pole2[i].length; j++) {
                System.out.print(pole2[i][j] + ",");
            }
            System.out.println();
        }

        // Volání vararg metody
        varargMetoda('c', 10, 42, 123, 11);
        varargMetoda('z', pole);
    }

    // Metoda pro vararg
    static void varargMetoda(char c, int... argument) {
        System.out.println("\nZavolana metoda s vararg:");
        System.out.println("Predan znak: " + c);
        System.out.println("Delka pole: " + argument.length);
        System.out.println("Hodnoty: " + Arrays.toString(argument));
    }

    // Tisk celého pole pomocí for-each
    static void tiskniCelePoleForEach(int[] pole) {
        System.out.println("Tiskneme cele pole pomoci for-each:");
        for (int hodnota : pole) {
            System.out.print(hodnota + ",");
        }
        System.out.println();
    }

    // Tisk celého pole pomocí for
    static void tiskniCelePole(int[] pole) {
        System.out.println("Tiskneme cele pole:");
        for (int i = 0; i < pole.length; i++) {
            System.out.print(pole[i] + ",");
        }
        System.out.println();
    }

    // Výpis hodnot na zadaném indexu
    static void printIndex(int[] pole, int index) {
        if (pole != null && index < pole.length) {
            System.out.println("Hodnota na indexu " + index + ": " + pole[index]);
        }

        if (pole.length > 10) {
            System.out.println("Hodnota na indexu 10: " + pole[10]);
        }

        System.out.print("Posledni index pole: " + (pole.length - 1) + ", hodnota posledniho prvku: ");
        System.out.println(pole[pole.length - 1]);
    }
}
