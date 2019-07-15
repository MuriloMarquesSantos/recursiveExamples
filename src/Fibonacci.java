public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(executeFibo(0));
    }

    static int executeFibo(int n) {
        if (n <= 2 && n > 0) {
            return 1;
        } else if (n > 2) {
            return  executeFibo(n -1) + executeFibo(n -2);
        }
            return 0;
    }
}
