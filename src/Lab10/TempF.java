package Lab10;

public class TempF {
    public static float TempF(float fahrenheit) {
        System.out.println(fahrenheit);
        //float Celsius =  ((fahrenheit-32)*5)/9;
        float Celsius;
        Celsius = (fahrenheit - 32) * 5 / 9;
        return Celsius;
    }

    public static class Viteza {
               public static double Viteza (double a, double b, double c, double d) {
                double viteza = a/((b*3600)+(c*60)+d);
                return  viteza;
               }
        }
}