public class Main {
    public static int fib_notOptimized(int n) // time complexity O(2^n) space complexity O(n);
    {
        if (n <= 2) return 1;
        return fib_notOptimized(n-1)+fib_notOptimized(n-2);
    }
    public static long  fib_Optimized(int n) // time complexity O(2^n) space complexity O(n);
    {
        int f[] = new int[n+2]; // 1 extra to handle case, n = 0
        int i;

        f[0] = 0;
        f[1] = 1;

        for (i = 2; i <= n; i++)
        {
            f[i] = f[i-1] + f[i-2];
        }

        return f[n];
    }
    public static void main(String[] args)
    {

        long startTime = System.nanoTime();
        System.out.println(fib_Optimized(5));
        long endTime = System.nanoTime();
        System.out.println((endTime - startTime));

        long startTime2 = System.nanoTime();
        System.out.println(fib_notOptimized(0));
        long endTime2 = System.nanoTime();
        System.out.println((endTime2 - startTime2));

    }
}