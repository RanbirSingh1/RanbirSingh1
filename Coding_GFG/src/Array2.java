public class Array2 {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,60,70,80,90};
        int l=0;
        int n=arr.length;
        int h=n-1;
        System.out.println(getMaxElement(arr,l,h));

    }
    public static int getMaxElement(int arr[],int l,int h){
        int mid=(l+h)/2;
        if(l>h)
            return -1;
        if(arr[mid]>arr[0] && (mid==arr.length-1 || arr[mid]>arr[mid+1]))
            return arr[mid];
        if(arr[mid] >arr[0])
            return getMaxElement(arr,mid+1,h);
        else
            return getMaxElement(arr,l,mid-1);

    }
}
