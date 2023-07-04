package exceptions1;

public class arrayExcep {


    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3, 5, 6};
        int [] arr2 = {1, 5, 9};

        int [] arr3 = arrayConcat(arr1, arr2);
    }
    
    
    public static int[] arrayConcat(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length){
            throw new RuntimeException("Длины не равны");
        }
        int size = arr1.length;
        int [] newArr = new int [size];
        for (int i = 0; i < size; i ++){
            newArr[i] = arr1[i]/arr2[i];
        }
        return newArr;

    }
}