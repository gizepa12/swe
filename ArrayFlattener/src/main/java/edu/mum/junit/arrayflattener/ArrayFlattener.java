package edu.mum.junit.arrayflattener;

import java.util.Arrays;

public class ArrayFlattener {

    public int[] ArrayFlattener(int[][] array) {
        if (array == null) {
            return null;
        }

        int[] flatten = Arrays.stream(array).flatMapToInt(Arrays::stream).toArray();
        return flatten;

    }

   /* public static void main(String[] args) {
        ArrayFlattener a_flattner = new ArrayFlattener();

        System.out.println(Arrays.toString(a_flattner.ArrayFlattener(new int[][]{{2, 3}, {20, 30, 40}})));
    }*/

}
