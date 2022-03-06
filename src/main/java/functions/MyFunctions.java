package functions;

public class MyFunctions {
    public double myCos(double x) {
        double ans = 1;
        for (int i = 0; i < 7 ; i ++) {
            ans = ans + Math.pow((-1), i+1) * (Math.pow(x, (i+1)*2)/ UsefulMethods.fact((i+1)*2));
        }
        return ans;
    }

    public void myHeapSort() {

    }
}
