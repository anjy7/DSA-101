class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] wealth = new int[accounts.length];
        for(int i = 0 ; i< accounts.length ; i++)
        {
            for(int j = 0 ; j < accounts[i].length ; j++){
                 wealth[i] = wealth[i] + accounts[i][j];
            }
        }
        int max = wealth[0];

        for (int i = 1; i < wealth.length; i++){
            if (wealth[i] > max){
                max = wealth[i];
            }
        }
         
        return max;
    }
}