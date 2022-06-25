import Lab10.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Tema Laborator 9 -  Ex 1 - Print Hello
     /*   System.out.println('\n');
        System.out.println("Homework Lab9 - Java - Ex 1 - Print Hello");
        System.out.println('\n');
        System.out.println("Hello Q27 World");
        System.out.println("Vlad Nedisan");
        System.out.println('\n');
        // Ex 2 - sum of two numbers
        System.out.println("Homework Lab9 - Java - Ex 2 - Calculator.Sum of 2 numbers ");
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
        System.out.println("First number is : " + nr1 );
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
        */
        // Tema Laborator 10
        System.out.println("Tema nr 2: \n");

        Calculator suma = new Calculator();
        System.out.println("Suma numerelor este: " + suma.sum(3, 4));
        Calculator substr = new Calculator();
        System.out.println("Scaderea numerelor este: " + substr.substract(9, 7));
        Calculator imp = new Calculator();
        System.out.println("Impartirea numerelor este: " + imp.divide(9, 2));
        Calculator inm = new Calculator();
        System.out.println("Inmultirea numerelor este: " + inm.multiplication(4, 5) + "\n");

        System.out.println("Tema nr 3: \n");
        PrintJ print = new PrintJ();
        System.out.println(print.PrintJava() + '\n');

        System.out.println("Tema nr 4: \n");
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti primul numar: ");
        int firstNumber = scan.nextInt();
        System.out.println("Introduceti al doilea numar: ");
        int secondNumber = scan.nextInt();
        System.out.println("Introduceti al treilea numar: ");
        int thirdNumber = scan.nextInt();
        System.out.println("Media numerelor introduse este: ");
        Calculator med = new Calculator();
        System.out.println(med.media(firstNumber, secondNumber, thirdNumber));
        System.out.println("\n");

        System.out.println("Tema nr 5: \n");
        System.out.println(print.PrintJava2());

        System.out.println("Tema nr 6: \n");
        System.out.println("Introduceti primul numar: ");
        int firstNr = scan.nextInt();
        System.out.println("Introduceti al doilea numar : ");
        int secondNr = scan.nextInt();
        Calculator rst = new Calculator();
        System.out.println("Restul impartirii este: " + rst.rest(firstNr, secondNr) + "\n");

        System.out.println("Tema nr 7: \n");
        System.out.println("Introduceti temperatura in Fahrenheit : ");
        float temp = scan.nextInt();
        TempF tempF = new TempF();
        System.out.println("Temperatura in grade Celsius este: " + tempF.fahrenheitToCelsius(temp) + "\n");

        System.out.println("Tema nr 8 : \n");
        System.out.println("Introduceti distanta in inch: ");
        double inch = scan.nextInt();
        Distance meter = new Distance();
        System.out.println("Distanta in metri este: " + meter.distanceCalculation(inch) + "\n");

        System.out.println("Tema nr 9: \n");
        System.out.println("Introduceti distanta in metri: ");
        double metru = scan.nextInt();
        System.out.println("Introduceti ora: ");
        double ora = scan.nextInt();
        System.out.println("Introduceti minutele: ");
        double minute = scan.nextInt();
        System.out.println("Introduceti secundele: ");
        double secunde = scan.nextInt();
        TempF.Viteza speed = new TempF.Viteza();
        System.out.println("Viteza in metri pe secunda este: " + speed.Viteza(metru, ora, minute, secunde) + "\n");
        Viteza1 speedkm = new Viteza1();
        System.out.println("Viteza in km pe ora este: " + speedkm.Speed(metru, ora, minute, secunde) + "\n");
        Viteza3 speedmph = new Viteza3();
        System.out.println("Viteza in mph pe ora este: " + speedmph.Viteza3(metru, ora, minute, secunde) + "\n");
    }
}





