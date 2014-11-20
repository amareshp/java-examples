package com.amareshp.collections;

public class SortAlgorithms {
    
    public static String[] bubbleSort(String[] unsortedArray) {
        String temp = null;
        for(int i = unsortedArray.length; i > 1; i--) {
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
    
    public static int binarySearch(String[] array, String searchFor) {
        int foundIndex = -1;
        int start = 0, end = array.length - 1;
        while(start < end) {
            int mid = (start + end) / 2;
            if(searchFor.compareTo(array[mid]) == 0) {
                foundIndex = mid;
                break;
            } else if(searchFor.compareTo(array[mid]) > 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return foundIndex;
    }

}
