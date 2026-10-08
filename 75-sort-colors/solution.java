class Solution {
    public void sortColors(int[] arr) {
        for(int i=0; i<arr.length; i++){
            int min = Integer.MAX_VALUE;
            int ind =-1;
            for(int j=i; j<arr.length; j++){
                if(arr[j]<min){
                    min=arr[j];
                    ind=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[ind];
            arr[ind]=temp;
        }
    }
}