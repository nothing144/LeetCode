class Solution {
    public int maxSubArray(int[] arr) {
       
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            currsum+=arr[i];
            if(currsum<0){
                if(i==arr.length){
                    return currsum;
                }
                currsum=0;
            }
            if(currsum>maxsum){
                maxsum=currsum;
            }
        }
        return maxsum;
    }
}