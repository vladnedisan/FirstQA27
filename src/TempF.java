public class TempF {
    public static float TempF(float fahrenheit) {
        System.out.println(fahrenheit);
        //float Celsius =  ((fahrenheit-32)*5)/9;
        float Celsius;
        Celsius = (fahrenheit - 32) * 5 / 9;
        return Celsius;
    }
}