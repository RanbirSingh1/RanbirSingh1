public class MaxContinousArray {
    public static void main(String[] args) {

        int arr[] = {1, 8, 30, -5, 20, 7};
        int k = 3;
        int maxSum=0;

        for (int i = 0; i < k; i++) {
            maxSum+=arr[i];

         }
        int sum=maxSum;
        for (int i = 0; i < arr.length-k; i++) {

            sum=sum-arr[i]+arr[i+k];

            if(maxSum<sum)
                maxSum=sum;

        }
        System.out.println(maxSum);
    }
}
