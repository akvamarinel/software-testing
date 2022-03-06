package functions;

public class UsefulMethods {
    public static int fact(int x) {
        int res = 1;
        for (int i = 0; i <=x; i++) {
            res = res*(i+1);
        }
        return res;
    }
}
