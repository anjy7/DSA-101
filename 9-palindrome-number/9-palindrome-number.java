class Solution {
    public boolean isPalindrome(int x) {
         if (x<0){
            return false;
        }

        int temp = x;
        int n=0, m = 0;
        
        while (temp != 0) {
            n = temp % 10;
            temp = temp /10;
            m = m * 10 + n;
        }
    
        return x==m;
        
    }
}