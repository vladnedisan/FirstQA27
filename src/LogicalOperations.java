import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class LogicalOperations {

    public int getGreaterNumber(int first, int second) {
        if (first < second) {
            return second;
        } else {
            return first;
        }
    }

    public String verifyTextAndNumber(String textInput, int number) {
        if (textInput.equals(" FastTrackIT ") && number <= 3) {
            return (textInput + number);
        } else if (!textInput.equals(" FastTrackIT ") && number >= 4) {
            return (number + textInput);
        }
        return "Number or text is not in range";
    }

    public String TextComparison(String textInput) {
        if (textInput.equals(" FastTrackIT ")) {
            return ("Learning text comparison");
        } else return "Got to try some more";
    }

    public String BiggerSnow(int number2) {
        if (number2 > 8 || number2 == 6) {
            return ("The amount of snow this winter was(cm):" + number2);
        } else return ("The forecast snow is(cm)" + number2);
    }

    public String BiggerNumber(int number3) {
        if (number3 > 3 && number3 != 4) {
            return ("The number is greater than 3 and not equal to 4");
        } else if (number3 == 4) {
            return ("The number is equal to 4");
        } else if (number3 < 3) {
        }
        return ("The number is lower than 3");
    }

    public String ReturnNumber(int returnNr) {
        switch (returnNr) {
            case 1:
                return "The number is 1";
            case 2:
                return "The number is 2";
            case 3:
                return "The number is 3";
            case 4:
                return "The number is 4";
            case 5:
                return "The number is 5";
            case 6:
                return "The number is 6";
            case 7:
                return "The number is 7";
            case 8:
                return "The number is 8";
            case 9:
                return "The number is 9";
            case 10:
                return "The number is 10";
            default:
                return "The number is not in the required range";
        }
    }

    public boolean isNumberEven(int num) {

        if (num % 2 == 0) {
            return true;
        } else return false;
    }

    public boolean isEligibleToVote(int age) {
        if (age > 18) {
            return true;
        } else return false;
    }

    public int maxNumber(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }

    public void printToHundred(int x) {
        for (int i = x; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public double sumAndAverage() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            System.out.println(sum);
        }
        return sum / 100d;
    }

    public double getAverageInInterval(int start, int finish) {

        int sum = 0;
        double count = 0;
        while (start <= finish) {
            sum = sum + start;
            start++;
            count++;
        }

        return (sum / count);
    }

    public double getAverageForEvenInInterval(int start1, int finish1) {
        int sum = 0;
        double count = 0;
        while (start1 <= finish1) {
            if (start1 % 2 == 0) {
                sum = sum + start1;
                count++;
            }
            start1++;
        }
        System.out.println(sum);
        return (sum / count);
    }

    // For loops
//Tema 1
    public static void countTo100(int param) {
        for (int start = param; start <= 100; start++) {
            System.out.println(start);
        }
    }

    //Tema 2
    public static void countToMinus100(int param) {
        for (int start = param; start >= -100; start--) {
            System.out.println(start);
        }
    }

    //Tema 3
    public static void countBetweenTwoNr(int x, int y) {
        for (int i = x; i <= y; i++) {
            System.out.println(i);
        }
    }

    //Tema  4
    public static void countToBiggestNr(int x, int y) {
        if (x <= y) {
            for (int i = x; i <= y; i++) {
                System.out.println(i);
            }

        } else {
            for (int j = y; j <= x; j++) {
                System.out.println(j);
            }
        }
    }

    //Tema 5
    public static void evenNrTo100() {
        // int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) System.out.println(i);
        }
    }

    //Tema 6
    public static void notEvemNrTo100() {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) System.out.println(i);
        }
    }

    //Tema 7
    public static void sumTo100(int param) {
        int sum = 0;
        for (int i = param; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    //Tema 8
    public static void sumAndAverageTema(int param) {
        int sum = 0;
        int count = 0;
        for (int i = param; i <= 100; i++) {
            sum += i;
            count++;
        }
        System.out.println(sum / count);
    }

    //Tema 9
    public static void printAsterisk() {
        for (int i = 7; i >= 0; i--) {
            for (int j = i; j >= 0; j--)
                System.out.print("*");
            System.out.println();
        }
    }

    // While Loops
// Tema 1
    public static void countTo100WL(int start) {
        while (start <= 100) {
            System.out.println(start);
            start++;
        }
    }

    //Tema 2
    public static void countToMinus100WL(int startw) {
        while (startw >= -100) {
            System.out.println(startw);
            startw--;
        }
    }

    //Tema 3
    public static void countBetweenTwoNrWL(int x, int y) {
        while (x <= y) {
            System.out.println(x);
            x++;
        }
    }

    //Tema 4
    public static void countToBiggestNrWL(int x, int y) {
        if (x <= y) {
            while (x <= y) {
                System.out.println(x);
                x++;
            }
        } else {
            while (y <= x) {
                System.out.println(y);
                y++;
            }
        }

    }

    //Tema 5
    public static void evenNrTo100WL() {
        int x = 1;
        while (x <= 100) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
            x++;
        }
    }

    //Tema 6
    public static void notEvemNrTo100WL() {
        int x = 1;
        while (x <= 100) {
            if (x % 2 != 0) {
                System.out.println(x);
            }
            x++;
        }
    }

    //Tema 7
    public static double getAverageInIntervalWL() {
        int sum = 0;
        double count = 0;
        int start = 111;
        int finish = 8899;
        while (start <= finish) {
            sum = sum + start;
            start++;
            count++;
        }
        return (sum / count);
    }

    //Tema 8
    public double divideWith7WL(double x, double y) {
        int count = 0;
        double sum = 0;
        while (x <= y) {
            if (x % 7 == 0) {
                System.out.println(x);
                sum = sum + x;
                count++;
            }
            x++;
        }
        return (sum / count);
    }

    //Tema 9
    public static void nrFibonacci() {
        int num1 = 0, num2 = 1;
        int i = 1;
        while (i <= 20) {
            System.out.print(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            i++;
        }
    }

    // Tema 10
    public static void cozaLozaWoza() {
        int i = 1;
        while (i <= 110) {
            boolean test = false;
            if (i % 3 == 0) {
                System.out.print("coza");
                test = true;
            }
            if (i % 5 == 0) {
                System.out.print("loza");
                test = true;
            }
            if (i % 7 == 0) {
                System.out.print("woza");
                test = true;
            }
            if (!test) {
                System.out.print(i);
            }
            System.out.print(" ");
            if (i % 11 == 0) {
                System.out.println();
            }
            i++;
        }
    }

    public int[] populateArrayUpToNumber(int number) {
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public double getAverageFromArray(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

//public int getPossitionOfValueFromArray(){

    //Tema Array
    //Tema 2
    public int[] populateArrayUpTo100(int number) {
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    //Tema 3
    public int[] populateArrayUpToEven100(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] += i;
                System.out.print(array[i] + " ");
            }
        }
        return array;
    }

    //Tema 4
    public double getAverageFromArrayT(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    //Tema 5
    public boolean isValueInArray(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    //Tema6

    public boolean isNumberInArrayNr(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                System.out.println("Numarul se afla la pozitia: " + i);
                return true;
            }
        }
        return false;
    }

    public void printSymbols(int[] array) {
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }
        for (int i = 1; i <= 100; i++) {
            if (i % 10 != 0) {
                System.out.print("_");
            } else {
                System.out.println("_");
            }
        }
    }

    //Tema 8

    public void  isValueInArrayNr2(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
            }
        }

        System.out.println("Unique elements: ");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //Tema 9
    public int populateArrayToNr3(int[] array) {
        int lowestNR = 2147483647;
        int secondLowestNr = 2147483647;
        for (int i = 0; i < array.length; i++) {
            if (lowestNR > array[i]) {
                secondLowestNr = lowestNR;
                lowestNR = array[i];
            } else if (array[i] < secondLowestNr) {
                secondLowestNr = array[i];
            }
        }
        return secondLowestNr;
    }
    //Tema 10
    public int[] copyArray(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
            System.out.print(array2[i] + " ");
        }
        return array2;
    }
}





