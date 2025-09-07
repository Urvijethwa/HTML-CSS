public class Arrays{

    //linear search - return the index
    public static int linear(int arr[], int key){
        for(int i=0; i<=arr.length; i++){
            if (arr[i] == key) {
                return i; 
            }
        }
        return -1; //if does not exist 
    }

    public static void main(String args[]){
        int arr[] = {2, 5, 8, 2, 4}; 
        int key = 8; 

       System.out.println(linear(arr, key));
    }
}