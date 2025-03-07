import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[]array= {5,9,9,21,3,0};
       int result= binarySearch(array,9);
       if(result!= -1){
           System.out.println("The value "+result +" found in the array");
       }
       else{
           System.out.println("The value is not found in the array.");
       }




    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }

    public static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return 1;

            }
        }
        return -1;
    }

    public static int binarySearch(int[]array, int target) {
        int low = 0;
        int high = array.length - 1;
        while(low<=high){
            int mid=(high+low)/2;
            if(array[mid]==target){
                return array[mid];
            }
            else if(array[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }





}



