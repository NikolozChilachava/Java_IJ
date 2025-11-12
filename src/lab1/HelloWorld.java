package lab1;

class Main {
    public static void main(String[] args) {
        int n = 6;  // you can change this to any number
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        // base cases
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        // recursive call
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
