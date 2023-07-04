package exceptions1;

public class threeExcep {

    public static int devideByZero(int a){
        return a/0;
    }

    public static void outOfBounds(int[] arr){
        int size = arr.length;
        arr[size+1] = 10;
    }
    
    public static int uninitialized(int a){
        int z = a+ y;
        return z;
    }
}
