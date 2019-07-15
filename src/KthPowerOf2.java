public class KthPowerOf2 {

    public static void main(String[] args) {

        System.out.println(calculateKthPowerOf2(5));
    }

    /* TO-DO improve validation of positive integer*/
    static int calculateKthPowerOf2(int powerNumber) {
        if (powerNumber > 0) {
            return 2 * calculateKthPowerOf2(powerNumber - 1);
        }
        return 1;
    }
}
