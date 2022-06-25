package Lab10;

public class Viteza1 {
    public static double Speed(double a, double b, double c, double d) {
        double speed = 3.6 * (a / ((b * 3600) + (c * 60) + d));
        return speed;
    }
}

