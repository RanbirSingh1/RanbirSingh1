public class Array1 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,3,3,3,3,3,5};
        int n=arr.length;
        int l=0;
        int h=n-1;
        int x=3;

        int left=countLeftMost(arr,l,h,x);
        System.out.println(left);
        int right=countRightMost(arr,l,h,x,n);
        System.out.println(right);
    }
    static int countLeftMost(int arr[], int l, int h, int x){
        int mid = l+(h-l)/2;

        if(arr[mid]  == x && (mid ==0 || arr[mid-1] != x)){
            return mid;
        }
        else if(arr[mid] >= x){
            return countLeftMost(arr,l,mid-1,x);
        }
        else {
            return countLeftMost(arr,mid+1,h,x);
        }

    }
    static int countRightMost(int arr[], int l, int h, int x, int n){
        int mid = l+(h-l)/2;

        if(arr[mid]  == x && (mid == n-1|| arr[mid+1] != x)){
            return mid;
        }
        else if(arr[mid] > x){
            return countRightMost(arr,l,mid-1,x,n);
        }
        else {
            return countRightMost(arr,mid+1,h,x,n);
        }

    }
}
