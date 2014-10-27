package com.amareshp.util;

public class BinarySearch {
    
    public char getSmallestCharGreaterThan(String inputStr, char c) {
        char[] inputChars = inputStr.toCharArray();
        //indexes - low, high, middle
        int low = 0, high = inputChars.length - 1;
        int middle;
        boolean found = false;
        printIndexes(inputChars, low, high);
        while(true) {
            printArray(inputChars, low, high);
            middle = (low + high) / 2 ;
            if(middle == low) {
                break;
            }
            
            if(inputChars[middle] == c) {
                found = true;
                break;
            } else if (inputChars[middle] > c) {
                high = middle;
            } else {
                low = middle;
            }
            middle = (low + high) / 2;
        }
        
        char result = inputChars[high];
        if(result <= c) {
            result = inputChars[0];
            System.out.println("The highest character in this array is smaller than input character. Returning first character.");
        } else {
            System.out.println("The smallest character that is greater than " + c + " is: " + result);
        }
        return result;
    }
    
    private void printArray(char[] chArr, int low, int high) {
        for(int i = 0; i < low; i++) {
            System.out.print("   ");
        }
        for(int i = low; i <= high; i++) {
            System.out.print(" " + chArr[i] + " ");
        }
        for(int i = high+1; i < chArr.length; i++) {
            System.out.print("   ");
        }
        System.out.println();
    }
    private void printIndexes(char[] chArr, int low, int high) {
        for(int i = low; i <= high; i++) {
            System.out.printf("%2d ", i);
        }
        System.out.println();
    }

}
