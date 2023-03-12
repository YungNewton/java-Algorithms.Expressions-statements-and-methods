public class AreaCalculator {
    public static double area(double radius) {
        if (radius < 0)
            return -1d;
        else
            return (Math.PI * (Math.pow(radius, 2)));

    }

    public static double area(double firstSide, double secondSide) {
        if (firstSide < 0 || secondSide < 0)
            return -1d;
        else
            return (firstSide * secondSide);
    }
}