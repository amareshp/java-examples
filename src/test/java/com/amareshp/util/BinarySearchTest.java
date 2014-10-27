package com.amareshp.util;

import org.testng.Assert;
import org.testng.annotations.Test;


public class BinarySearchTest {
    
    BinarySearch bSearch = new BinarySearch();

    @Test
    public void happyPath1(){
        String testName = new Exception().getStackTrace()[0].getMethodName();
        System.out.println("Starting test: " + testName);
        System.out.println("----------------------------------------------------------------------------");
        
        String inputStr = "abdefg";
        int result = bSearch.getSmallestCharGreaterThan(inputStr, 'c');
        Assert.assertEquals(result, 'd');
    }

    @Test
    public void happyPath2(){
        String testName = new Exception().getStackTrace()[0].getMethodName();
        System.out.println("Starting test: " + testName);
        System.out.println("----------------------------------------------------------------------------");
        
        String inputStr = "abdefgh";
        int result = bSearch.getSmallestCharGreaterThan(inputStr, 'c');
        Assert.assertEquals(result, 'd');
    }

    @Test
    public void happyPath3(){
        String testName = new Exception().getStackTrace()[0].getMethodName();
        System.out.println("Starting test: " + testName);
        System.out.println("----------------------------------------------------------------------------");
        
        String inputStr = "abcdefgh";
        int result = bSearch.getSmallestCharGreaterThan(inputStr, 'c');
        Assert.assertEquals(result, 'd');
    }

    @Test
    public void happyPath4(){
        String testName = new Exception().getStackTrace()[0].getMethodName();
        System.out.println("Starting test: " + testName);
        System.out.println("----------------------------------------------------------------------------");
        
        String inputStr = "abcdefgh";
        int result = bSearch.getSmallestCharGreaterThan(inputStr, 'z');
        Assert.assertEquals(result, 'a');
    }

    @Test(expectedExceptions= {ArrayIndexOutOfBoundsException.class})
    public void negativeTest1(){
        String testName = new Exception().getStackTrace()[0].getMethodName();
        System.out.println("Starting test: " + testName);
        System.out.println("----------------------------------------------------------------------------");
        
        String inputStr = "";
        int result = bSearch.getSmallestCharGreaterThan(inputStr, 'z');
        Assert.assertEquals(result, 'a');
    }

    @Test(expectedExceptions= {NullPointerException.class})
    public void negativeTest2(){
        String testName = new Exception().getStackTrace()[0].getMethodName();
        System.out.println("Starting test: " + testName);
        System.out.println("----------------------------------------------------------------------------");
        
        String inputStr = null;
        int result = bSearch.getSmallestCharGreaterThan(inputStr, 'z');
        Assert.assertEquals(result, 'a');
    }
    
}
