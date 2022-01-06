class Fibonacci {

    // Printing function N fibonnacci number
    static void Fibonacci(int N) {
        int num1 = 0, num2 = 1, counter = 0;

        // Iterate till counter is N
        while (counter < N) {

            System.out.println(num1 + " ");

            // The swap method
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }

    public static void main(String args[]) {
        // Initializing number N
        int N = 10;

        // The call function
        Fibonacci(N);
    }
}
