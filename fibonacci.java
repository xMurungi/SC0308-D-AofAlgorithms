public class fibonacci {
    public static void main(String[] args) {
        int n = 50; // Number of Fibonacci numbers to generate
        int index = generateFibonacci(n);
    }

    private static int generateFibonacci(int n) {
        int[] fibArray = new int[n];
        fibArray[0] = 0;
        fibArray[1] = 1;

        for (int i = 2; i < n; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }

        System.out.println("First " + n + " Fibonacci numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibArray[i] + " ");
        }    
    }
}