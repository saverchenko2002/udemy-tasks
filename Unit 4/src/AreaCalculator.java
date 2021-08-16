public class AreaCalculator {
    public static double area(double radius) {
        return radius < 0 ? -1 : Math.pow(radius, 2) * Math.PI;
    }

    public static double area(double x, double y) {
        return (x < 0 || y < 0) ? -1 : x * y;
    }
}