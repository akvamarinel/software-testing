package functions;

public class MyFunctions {
    public double myCos(double x) {
        if (x == Double.NaN || x == Double.NEGATIVE_INFINITY || x == Double.POSITIVE_INFINITY) {
            return Double.NaN;
        }
        double ans = 1;
        for (int i = 1; i < 7; i++) {
            ans = ans + Math.pow((-1), i) * ((Math.pow(x, (i) * 2)) / UsefulMethods.fact((i) * 2));
        }
        return ans;
    }

}
