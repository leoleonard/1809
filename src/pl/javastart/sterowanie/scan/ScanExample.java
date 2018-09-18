package pl.javastart.sterowanie.scan;

import java.util.Locale;
import java.util.Scanner;

public class ScanExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // kropka nad przecinkiem w liczbach (formatowanie)
        System.out.println("Podaj wiek");
        int age = scanner.nextInt();
        //miejsce stop programu
        scanner.nextLine(); // konsola uznaje enter za znak
        System.out.println("Podaj imię");
        String name = scanner.nextLine();
        //stop

        System.out.println("Witaj " + name + ", " + "masz " + age + " lat");

        System.out.println("Podaj liczbę zmiennoprzecinkową");
        double number = scanner.nextDouble();
        System.out.println("Twoja liczba to " + number);
    }

}
