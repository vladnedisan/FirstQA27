import java.sql.SQLOutput;

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
        } else
            return "Got to try some more";
    }

    public String BiggerSnow(int number2) {
        if (number2 > 8 || number2 == 6) {
            return ("The amount of snow this winter was(cm):" + number2);
        } else
            return ("The forecast snow is(cm)" + number2);
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
        } else
            return false;
    }

    public boolean isEligibleToVote(int age) {
        if (age > 18) {
            return true;
        } else
            return false;
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

//Tema 1
    public int countTo100() {
        int count = 0;
        for (int start = 21; start <= 100; start++) {
            count++;
        }
        return count;
    }
//Tema 2
    public int countToMinus100() {
        int count = 0;
        for (int start = 2; start >= -100; start--) {
            count++;
        }
        return count;
    }
//Tema 3
    public int countBetweenTwoNr(){
        int count = 0;
        int y = 9;
        for( int x =3; x<=y; x++) {
            count++;
        }
        return count;
           }
//Tema  4
public int countToBiggestNr(){
        int count = 0;
        int x = 10;
        int y = 7;
        if (x<y)
            for (int i=x;i<y;i++){
                count++;}
            else
                for ( int j=y; j<x; j++){
                    count++;}
                return count;
    }
//Tema 5
    public int evenNrTo100(){
        int count =0;
        for (int i = 1; i <=100; i++) {
           if (i % 2 == 0)
               count++;

        }
        return count;
    }
//Tema 6
    public int notEvemNrTo100(){
        int count = 0;
        for (int i = 1; i <=100; i++) {
            if (i % 2 != 0)
                count++;

        }
        return count;
    }
//Tema 7
    public int sumTo100(){
        int sum = 0;
        for (int i=1;i<=100; i++) {
            sum=sum+i;
        }
    return sum;
    }
//Tema 8
    public double sumAndAverageTema() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum / 100d;
    }
//Tema 9
 public static void printAsterisk(){
        for (int i=7;i>=0; i--){
            for (int j=i;j>=0; j--)
            System.out.print("*");
            System.out.println();
        }
            }
    }



