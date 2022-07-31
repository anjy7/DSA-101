class Solution {
    public int reverse(int x) {
        long temp = (long)x;
        long n=0;
        long m=0;
        while(temp != 0){
            n = temp%10;
            temp=temp/10;
            m = m*10 + n;
        }
        return (((long)Integer.MIN_VALUE> m || m>(long)Integer.MAX_VALUE) ? 0 : (int)m);
    }
}