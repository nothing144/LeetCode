class Solution {
    public void sortColors(int[] arr) {
    //     for(int i=0; i<arr.length; i++){
    //         int min = Integer.MAX_VALUE;
    //         int ind =-1;
    //         for(int j=i; j<arr.length; j++){
    //             if(arr[j]<min){
    //                 min=arr[j];
    //                 ind=j;
    //             }
    //         }
    //         int temp = arr[i];
    //         arr[i]=arr[ind];
    //         arr[ind]=temp;
    //     }
    int x=0;
    int y=0;
    int z=0;
     for(int i=0; i<arr.length; i++){
        if(arr[i]==0){
            x++;
        }
        else if(arr[i]==1){
            y++;
        }
        else{
            z++;
        }
      }

    int j=0;
    for(int i=0; i<x; i++){
        arr[j]=0;
        j++;
    }
    for(int i=0; i<y; i++){
        arr[j]=1;
        j++;
    }
    for(int i=0; i<z; i++){
        arr[j]=2;
        j++;
    }
    
    





    }
           
}