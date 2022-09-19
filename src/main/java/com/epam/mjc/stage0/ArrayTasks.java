package com.epam.mjc.stage0;


/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {

        String[] session= {"Winter","Spring","Summer","Autumn"};

        return session;
    }

    /**
     * Generate an int[] array of consecutive positive integers
     * starting at 1 of the given length (length parameter > 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1]
     * length = 3  -> [1, 2, 3]
     * length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int[] arr;
        arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i]=i+1;
        }
        return arr;

    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9
     * arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int s=0;
        for (int i = 0; i < arr.length; i++) {
            s+= arr[i];
        }

        return s;
    }

    /**
     * Return the index of the first occurrence of number in the arr array.
     * If there is no such element in the array, return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2
     * arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        int index =-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]== number){
                index =i;
                break;
            }
        }

        return index;
    }

    /**
     * Return the new String[] array obtained from the arr array
     * by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"]
     * arr = ["pineapple", "apple", "pen"] -> ["pen", "apple", "pineapple"]
     */
    public String[] reverseArray(String[] arr) {

        String[] n;
        n = new String[arr.length];
        int j=0;
        for (int i = arr.length-1; i >=0 ; i--) {
            n[j]=arr[i];
            j++;
        }

        return n;
    }

    /**
     * Return new int[] array obtained from arr int[] array
     * by choosing positive numbers only.
     * P.S. 0 is not a positive number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3]
     * arr = [-1, -2, -3]   -> []
     * arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {

        int[] pos;
        pos =new int[arr.length];
        int j=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                pos[j] = arr[i];
                j++;
            }
        }

        return arr;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules:
     * Incoming one-dimensional arrays must be arranged in ascending order of their length;
     * numbers in all one-dimensional arrays must be in ascending order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]]
     * arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {

        int[] temp;
        boolean sorted = false;
        boolean s = false;
        int t;

        while(!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length; i++) {
                
                if(i+1<=arr.length-1){
                    if(arr[i].length>=arr[i+1].length){
                        temp = arr[i];
                        arr[i] =arr[i+1];
                        arr[i+1] = temp;
                        sorted = false;
                    }
                    
                }
                // while (!s) {
                    //     // s=true;
                    for (int j = 0; j < arr[i].length-1; j++) {
                            
                        if(arr[i][j] >=arr[i][j+1]){
                            t = arr[i][j];
                            arr[i][j] =arr[i][j+1];
                            arr[i][j+1] = t;
                            s=false;
                        }
                    }
                // }
            }
    }
        
        return arr;
    }


    public static void main(String[] args){

        int[][] k={
            {3,6, 5, 2,4},
            {3, 1, 2}, 
            {6, 5, 2,4},
            {3,2}
        };

        int[] s={
            486, -858, -156, -463, 520, -155, -306, -622, -469, -857, -589, 536, 406, -381, -857, -369, 862, -828, 746, 65, -520, -316, -362, -323, 620, 356, -40, -877, -907, -971, -324, -961, 548, -74, 434, -928, 501, -534, 797, 452, -775, -891, -871, -654, 
            466, -925, -404, -829, -291, -123, 853, 781, 506, -439, 385, -66, -25, 388, -115, -543, 826, -241, 102, -128, 989, -468, 540, 71, -796, -557, -315, -287, -966, -291, 526, -943, 201, 844, -181, -450, -487, 453, -688, 268, -769, 587, -968, -941, 199, -103, -8,
            486, 520, 536, 406, 862, 746, 65, 620, 356, 548, 434, 501, 797, 452, 466, 853, 
            781, 506, 385, 388, 826, 102, 989, 540, 71, 526, 201, 844, 453, 268, 587, 199, 958, 189, 636, 867, 248, 857, 868, 635, 104, 432, 802, 490, 276, 788, 398, 799, 927, 416, 844, 417, 800, 473, 604, 362, 787, 621, 157, 795, 618, 189, 217, 457, 96, 532
                    };


        String[] kk={"pen", "apple", "pineapple"};
        ArrayTasks aaa = new ArrayTasks();
        aaa.sortRaggedArray(k);
        // aaa.getOnlyPositiveNumbers(s);
        // aaa.reverseArray(kk);
    }
}
