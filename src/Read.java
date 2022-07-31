
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Read {
    //1. In clasa Read, din programul vostru, creati o metoda tratat, care sa returneze un numar de la tastatura.
    public int getInt() {
        int number = 0;
        boolean repeat;
        Scanner scan = new Scanner(System.in);
        do {
            try {
                System.out.println("Please enter a number: ");
                number = scan.nextInt();
                repeat = false;
            } catch (InputMismatchException exception) {
                System.err.println("Please enter a valid number! Given value: " + scan.next());
                repeat = true;
            }
        } while (repeat);
        return number;
    }

    public int readInt() {
        boolean repeat = true;
        int number = 0;
        while (repeat) {
            try {
                System.out.print("Enter a number: ");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid value, please enter a number: ");
            } finally {
                System.out.println("Thank you for asking for help!");
            }
        }
        return number;
    }

    //2.In clasa Read, duplicati metoda de la punctul 1, astfel incat sa aveti mai multe metode, care sa citeasca si sa
    // returneze si alte tipuri de numere (float, int, double, long, etc)

    public double readDouble() {
        boolean repeat = true;
        double number = 0;
        while (repeat) {
            try {
                System.out.print("Please enter a number of double type: ");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextDouble();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid value, please enter a number of double type: ");
            } finally {
                System.out.println("Thank you for asking for help!");
            }
        }
        return number;
    }

    public float readFloat() {
        boolean repeat = true;
        float number = 0;
        while (repeat) {
            try {
                System.out.print("Please enter a number of float type: ");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextFloat();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid value, please enter a number of float type: ");
            } finally {
                System.out.println("Thank you for asking for help!");
            }
        }
        return number;
    }
    //3.In clasa Read, creati o metoda care sa returneze un array de numere populat de la tastatura.
    // Metoda sa primeasca ca si parametru un numar, care reprezinta cate pozitii are.

    public int[] getPopulatedArray(int size) {
        int[] popArray = new int[size];
        System.out.println("Populating the array with values.");
        for (int i = 0; i < size; i++) {
            popArray[i] = readInt();
        }
        System.out.println("Array populated is");
        for (int i = 0; i < size; i++) {
            System.out.println(popArray[i]);
        }
        return popArray;
    }

    //4. In clasa Read, creati o metoda care sa returneze o lista de numere populate de la tastatura.
    // Metoda nu v-a primii parametru lungimea. In rezolvarea ei trebuie folosit try-catch.
    // (Hint: a se citi de la tastatura atata timp cat valoarea primita e numar, cand nu mai e numar, sa se intrerupa citirea)
    public List<Integer> getPopulatedList() {
        List<Integer> list = new ArrayList<>();
        while (true) {
            try {
                System.out.print("Please enter a number: ");
                Scanner scanner = new Scanner(System.in);
                int number = scanner.nextInt();
                list.add(number);
            } catch (InputMismatchException e) {
                System.out.println("Invalid value  entered.");
                break;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println("Tema nr 1: ");
        Read read = new Read();
        int x = read.readInt();
        System.out.println(x);
        System.out.println("Tema nr 2: ");
        double y = read.readDouble();
        System.out.println(y);

        float z = read.readFloat();
        System.out.println(z);

        System.out.println("Tema nr 3: ");
        int[] t = read.getPopulatedArray(3);
        System.out.println("Tema nr 4: ");
        List<Integer> u = read.getPopulatedList();
        System.out.println(u);

    }

}
