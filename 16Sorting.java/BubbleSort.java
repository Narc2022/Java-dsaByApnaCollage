public class BubbleSort {
    public static void buble(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
    int arr[] = {12,36,5,8,5,64,4,245,454};

    //time complexity O(n^2)
    //bubble sort
    System.out.println(arr.length-1);
    for(int i=0;i<arr.length-1;i++){
        for(int j = 0; j < arr.length-i-1; j++) {
            if(arr[j] > arr[j+1]){  //> Ascending //< descending
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    buble(arr);
   }
}
