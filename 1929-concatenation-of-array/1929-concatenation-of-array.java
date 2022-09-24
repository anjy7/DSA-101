class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] array = new int[2*n];
        for(int i = 0 ; i<n ; i++){
            array[i] = nums[i];
            array[i+n] = nums[i];
        }

        return array;
    }
}