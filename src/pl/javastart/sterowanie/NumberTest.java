package pl.javastart.sterowanie;

public class NumberTest {
    public static void main(String[] args) {
        int a = 5;

        if ( a%2 == 0) {
            System.out.println("Liczba jest parzysta");
        } else {
            System.out.println("Liczba jest nieparzysta");
        }

        if (a > 0) {
            System.out.println("Liczba jest dodatnia");
        } else if (a < 0) {
            System.out.println("Liczba jest ujemna");
        } else {
            System.out.println("liczba jest 0");
        }

        if (a * 9 / 6 == 0) {
            System.out.println("Podzielna przez 6");
        } else if (a * a < 100)  {
            System.out.println(a + " jest mniejsza od 100");
        }
    }
}
