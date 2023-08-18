public class Main {
    public static long expo(long a, long b, long mod) {
        if (a == 0 && b == 0) return 1;
        long result = 1;
        while (b > 0) {
            if (b % 2 == 1) result = (result * a) % mod;
            a = (a * a) % mod;
            b >>= 1;
        }
        return result;
        
    }

    public static void main(String[] args) {
        int mod = (int) 1e9 + 7, n = 38;
        long ans = 1, p = 2;
        System.out.print(ans + " ");
        while (p < n) {
            ans = ans + expo(ans, p, mod);
            ans %= mod;
            p++;
            System.out.print(ans + " ");
        }
        System.out.println(2e2);
    }
}