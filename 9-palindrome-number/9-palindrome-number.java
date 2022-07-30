class Solution {
    public int numLength(int num){
        int count = 0;
        while(num > 0){
            num=num/10;
            count++;
        }
        return count;
    }
    public int reverse(int num,int length) {
        int n = 0;
        int m = 0;
        while (length > 0) {
            n = num % 10;
            num = num / 10;
            m = m * 10 + n;
            length--;

            }
        return m;
        }
    public boolean isPalindrome(int x) {
        int length = numLength(x);
        int ans = reverse(x,length);
        return x == ans;
        
    }

    }