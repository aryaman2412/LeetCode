class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int maxValue=0;


       for(int i=0;i<n-1;i++){
            int j=i+1;
            while(j<n){
                maxValue=Math.max(maxValue,arr[j]);
                j++;
            }
            arr[i]=maxValue;
            maxValue=0;

       } 
       arr[n-1]=-1;
       return arr;
    }
}