class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int result [] = new int[n1 + n2 ];

        for(int i = 0; i < n1 ; i++){
            result[i] = nums1[i];
        
        }
        

        int r = result.length;
        int j = 0;

        for(int i = n1; i < result.length ; i++){
            result[i] = nums2[j];
            j++;
           
        }
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));

        
        int evenOdd = r/2;

        if(r < 1){
            return (double)result[0];
        }

        else if(r % 2 == 0){
           
            return (double)(result[evenOdd] + result[evenOdd-1])/2;
        }
        else{
             System.out.println("Done this");
            return result[evenOdd];
        }
        
    }
}