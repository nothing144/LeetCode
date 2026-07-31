class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start =0;
        int end = numbers.length-1;
        int[] sum = new int[2];
        while(start<end){
            if(numbers[start]+numbers[end]==target){
                sum[0]= start+1;
                sum[1]= end+1;
                return sum;
            }
            else if(numbers[start]+numbers[end]<target){
                start++;
            }
            else{end--;}
        
        }
        return sum;
    }
}