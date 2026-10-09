class Solution {
    public int maxSubArray(int[] arr) {
        // int sum =0;
        // int left =0;
        // for(int right= 0; rightnums.length; right++){
            

        // }
        if(arr.length==1){
            return arr[0];
        }
        int sum =Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int newsum=0;
            for(int j=i; j<arr.length; j++){
                newsum += arr[j];
                if(newsum>sum){
                    sum= newsum;
                }
            }
        }
        return sum;
    }
}