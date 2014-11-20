package com.amareshp.util;

public class CollectionsUtil {
    
    public static void printArray(String[] array, String separator) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + separator);
        }
        System.out.println();
    }
}
