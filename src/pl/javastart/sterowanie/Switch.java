package pl.javastart.sterowanie;

public class Switch {
    public static void main(String[] args) {
        int number = 9;
        int result = number % 2;

        switch(result) {
            case 0:
                System.out.println("Liczba jest parzysta");
                break;
            case 1:
                System.out.println("Liczba jest nieparzysta");
                break;
            case -1:
                 System.out.println("Liczba jest ujemna i nieparzysta");
                 break;
            default:
                System.out.println("żadna z powyższych");
        }
    }
}
