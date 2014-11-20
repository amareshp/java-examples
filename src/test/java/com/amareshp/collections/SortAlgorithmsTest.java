package com.amareshp.collections;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.apache.commons.lang3.RandomStringUtils;

import org.testng.annotations.Test;

import com.amareshp.util.CollectionsUtil;

public class SortAlgorithmsTest {
    SecureRandom random = new SecureRandom();
    
    //@Test
    public void bubbleSortTest(){
        String[] unsortedArray = new String[99999];
        for(int i = 0; i < unsortedArray.length; i++) {
            unsortedArray[i] = randomString();
        }
        //System.out.println("********** Unsorted Array **********");
        //CollectionsUtil.printArray(unsortedArray, "\n");
        
        SortAlgorithms.bubbleSort(unsortedArray);
        System.out.println("********** Sorted Array   **********");
        CollectionsUtil.printArray(unsortedArray, "\n");
    }

    @Test
    public void binarySearchTest(){
        int eleCount = 9;
        String[] unsortedArray = new String[eleCount];
        for(int i = 0; i < unsortedArray.length; i++) {
            unsortedArray[i] = randomString();
        }
        String stringToFind = unsortedArray[eleCount/2];
        
        SortAlgorithms.bubbleSort(unsortedArray);
        System.out.println("********** Sorted Array   **********");
        CollectionsUtil.printArray(unsortedArray, "\n");
        int resultIndex = SortAlgorithms.binarySearch(unsortedArray, stringToFind);
        if(resultIndex == -1) {
            System.out.println("String " + stringToFind + " NOT FOUND.");
        } else {
            System.out.println("FOUND String " + stringToFind + " at index " + resultIndex);
        }
    }
    
    public String randomString() {
        return RandomStringUtils.random(5, "abcdefghijklmnopqrstuvwxyz");
    }

}
