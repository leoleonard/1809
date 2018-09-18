package pl.javastart.sterowanie;

public class AgeSwitch {
    public static void main(String[] args) {
        int age = 10;
        // switch String && int only

        switch(age) {
            case 10:
                System.out.println("cześć mały");
                break;
            case 20: case 21:
                System.out.println("cześć chłopcze");
                break;
            default:
                System.out.println("Witaj");
        }
    }
}
