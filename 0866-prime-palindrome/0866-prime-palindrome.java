import java.util.*;

class Solution {
    private static final int MAX_PRIME = 20000;
    private static final List<Integer> primes = new ArrayList<>();

    static {
        boolean[] isPrimeArr = new boolean[MAX_PRIME + 1];
        Arrays.fill(isPrimeArr, true);
        isPrimeArr[0] = false;
        isPrimeArr[1] = false;

        for (int p = 2; p * p <= MAX_PRIME; p++) {
            if (isPrimeArr[p]) {
                for (int i = p * p; i <= MAX_PRIME; i += p) {
                    isPrimeArr[i] = false;
                }
            }
        }

        for (int i = 2; i <= MAX_PRIME; i++) {
            if (isPrimeArr[i]) {
                primes.add(i);
            }
        }
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int p : primes) {
            if ((long) p * p > n) break;
            if (n % p == 0) return false;
        }
        return true;
    }

    private boolean isPalin(int n) {
        int t = n, p = 0;
        while (t > 0) {
            p = p * 10 + (t % 10);
            t /= 10;
        }
        return n == p;
    }

    public int primePalindrome(int n) {
        while (true) {
            if (isPalin(n) && isPrime(n)) {
                return n;
            }

            n++;
            if (n > 1000 && n < 10000) {
                n = 10000;
            } 
            else if (n > 100000 && n < 1000000) {
                n = 1000000;
            } 
            else if (n > 10000000 && n < 100000000) {
                n = 100000000;
            }
        }
    }
}