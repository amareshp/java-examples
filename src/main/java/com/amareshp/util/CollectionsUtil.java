package com.amareshp.util;

public class CollectionsUtil {
    
    public static void printArray(String[] array, String separator) {
        int digits = CollectionsUtil.numberOfDigitsIn(array.length);
        for(int i = 0; i < array.length; i++) {
            System.out.printf("[%" + digits + "d] " + array[i] + separator, i);
        }
        System.out.println();
    }
    
    public static int numberOfDigitsIn(int number) {
        int i = 1;
        while( (number - 10^i) >= 0) {
            i++;
        }
        return i;
    }
}
