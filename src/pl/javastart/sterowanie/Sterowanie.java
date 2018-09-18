package pl.javastart.sterowanie;

public class Sterowanie {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        if ( x > y) {
            System.out.println("X jest wiekszy od Y");
        }

        if (x < y) {
            System.out.println("X jest mniejszy od Y");
        }

        // ==> else
        if ( x > y) {
            System.out.println("X jest wiekszy od Y");
        } else if (x == y) {
            System.out.println("X jest równy Y");
        } else {
            System.out.println("X jest mniejszy od Y");
        }


    }
}
