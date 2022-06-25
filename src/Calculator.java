public class Calculator {
    public static class Divide {

        public static int divide(int a, int b) {
            return a/b;
        }
    }

    public static class Multiplication {

        public static int multiplication(int a, int b) {
            return a * b;
        }
    }

    public static class Substract {

        public static int substract(int a, int b) {
            return a - b;
        }
    }

    public static class Sum {
        public static int sum(int a, int b) {
            return a + b;
        }
    }

    public static class Rest {
        public static int Rest (int a, int b) {
            return  a%b ;
        }
    }

    public static class Media {
        public static int Media (int a, int b, int c) {
            return  (a + b + c)/3;
        }
    }
}
