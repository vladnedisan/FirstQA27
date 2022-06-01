public class Main {

    public static void main(String[] args) {
        // Ex 1 - Print Hello
        System.out.println('\n');
        System.out.println("Homework Lab9 - Java - Ex 1 - Print Hello");
        System.out.println('\n');
        System.out.println("Hello Q27 World");
        System.out.println("Vlad Nedisan");
        System.out.println('\n');
        // Ex 2 - sum of two numbers
        System.out.println("Homework Lab9 - Java - Ex 2 - Sum of 2 numbers ");
        System.out.println('\n');
        int number1 = 6;
        System.out.println("First number is : " + number1 );
        double number2 = 7.5;
        System.out.println("Second number is : " + number2 );
        double sum = number1 + number2;
        System.out.println("The sum of the numbers is: " + sum);
        System.out.println('\n');
        // Ex 3 - dividing two numbers
        System.out.println("Homework Lab9 - Java - Ex 3 - Result of dividing two numbers ");
        System.out.println('\n');
        int nr1 = 3;
        System.out.println("First number is :" + nr1 );
        double nr2 = 4.5;
        System.out.println("Second number is : " + nr2 );
        double divide = nr2 / nr1;
        System.out.println("The result of dividing nr2 by nr 1 is: " + divide);
        System.out.println('\n');

        // Ex 4 - Printing the results of some operations
        System.out.println("Homework Lab9 - Java - Ex 4 - Results of some operations ");
        System.out.println('\n');
        System.out.println("a. Result of : -5 + 8 * 6 ");

        // a. -5 + 8 * 6
        System.out.println('\n');
        double a1 = -5;
        System.out.println("First number is : " + a1 );
        double a2 = 8;
        System.out.println("Second number is : " +a2 );
        double a3 = 6;
        System.out.println("Third number is : " +a3 );
        double operationA = a1 + a2 * a3;
        System.out.println("The result of operation : -5 + 8 * 6 is: " + operationA);
        System.out.println('\n');

        // b. (55+9) % 9
        System.out.println("b. Result of : (55+9) % 9 ");
        System.out.println('\n');
        double b1 = 55;
        System.out.println("First number is : " + b1 );
        double b2 = 9;
        System.out.println("Second number is : " + b2 );
        double b3 = 9;
        System.out.println("Third number is : " + b3 );
        double operationB = (b1 + b2) % b3;
        System.out.println("The result of operation : (55+9) % 9 is: " + operationB);

        // c. 20 + -3*5 / 8
        System.out.println('\n');
        System.out.println("c. Result of : 20 + -3*5 / 8 ");
        System.out.println('\n');
        double c1 = 20;
        System.out.println("First number is : " +c1 );
        double c2 = -3;
        System.out.println("Second number is : " + c2 );
        double c3 = 5;
        System.out.println("Third number is : " + c3 );
        double c4 = 8;
        System.out.println("Forth number is : " + c4 );
        double operationC = c1 + c2 * c3 / c4;
        System.out.println("The result of operation : 20 + -3*5/8 is: " + operationC);
        System.out.println('\n');

        // d. 5 + 15 / 3 * 2 - 8 % 3
        System.out.println("d. Result of : 5 + 15 / 3 * 2 - 8 % 3 ");
        System.out.println('\n');
        double d1 = 5;
        System.out.println("First number is : " +d1 );
        double d2 = 15;
        System.out.println("Second number is : " + d2 );
        double d3 = 3;
        System.out.println("Third number is : " + d3 );
        double d4 = 2;
        System.out.println("Forth number is : " + d4 );
        double d5 = 8;
        System.out.println("Fifth number is : " + d5 );
        double d6 = 3;
        System.out.println("Sixth number is :" + d6 );
        double operationD = d1 + d2 / d3 * d4 - d5 % d6;
        System.out.println('\n');
        System.out.println("The result of operation : 5 + 15 / 3 * 2 - 8 % 3  is : " + operationD);
    }
}
