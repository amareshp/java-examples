package com.amareshp.collections;

public class SortAlgorithms {
    
    public static String[] bubbleSort(String[] unsortedArray) {
        String temp = null;
        for(int i = unsortedArray.length; i > 0; i--) {
            for(int j = 0; j < i-1; j++) {
                if(unsortedArray[j].compareTo(unsortedArray[j+1]) > 0) {
                    temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j+1];
                    unsortedArray[j+1] = temp;
                }
            }
        }
        return unsortedArray;
    }

}
