package com.amareshp.collections;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.apache.commons.lang3.RandomStringUtils;

import org.testng.annotations.Test;

import com.amareshp.util.CollectionsUtil;

public class SortAlgorithmsTest {
    SecureRandom random = new SecureRandom();
    
    @Test
    public void bubbleSortTest(){
        String[] unsortedArray = new String[10];
        for(int i = 0; i < unsortedArray.length; i++) {
            unsortedArray[i] = randomString();
        }
        System.out.println("********** Unsorted Array **********");
        CollectionsUtil.printArray(unsortedArray, "\n");
        
        SortAlgorithms.bubbleSort(unsortedArray);
        System.out.println("********** Sorted Array   **********");
        CollectionsUtil.printArray(unsortedArray, "\n");
    }
    
    public String randomString() {
        return RandomStringUtils.random(5, "abcdefghijklmnopqrstuvwxyz");
    }

}
