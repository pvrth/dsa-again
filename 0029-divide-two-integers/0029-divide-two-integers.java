class Solution {
        public int divide(int A, int B) {
        if (A == 1 << 31 && B == -1) return (1 << 31) - 1;
        int a = Math.abs(A);
        int b = Math.abs(B);
        int res = 0;
        int x = 0;

        while (a - b >= 0) {
            for (x = 0; a - (b << x << 1) >= 0; x++);
            res += 1 << x;
            a -= b << x;
        }

        return (A > 0) == (B > 0) ? res : -res;
    }
}