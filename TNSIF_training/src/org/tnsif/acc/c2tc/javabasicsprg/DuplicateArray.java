package org.tnsif.acc.c2tc.javabasicsprg;

public class DuplicateArray {
    public static void main(String[] args) {

        int arr[] = {2, 4, 5, 7, 2, 5, 8};

        System.out.println("Duplicate Elements:");

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
