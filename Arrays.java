public class Arrays{

    // function that gives out the index 
    public static int linear(int arr[], int key){
        //to loop through the whole array
        for(int i=0; i<arr.length; i++){
            if (arr[i] == key) {
                System.out.println(i);
            }
        }
        return -1; 
    }

    public static void main(String args[]){
        int arr[] = {27, 56, 2, 20}; 
        int key = 2; 

        linear(arr, key);
    }
}