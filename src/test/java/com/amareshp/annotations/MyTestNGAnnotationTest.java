package com.amareshp.annotations;

import org.testng.annotations.Test;

public class MyTestNGAnnotationTest {

    @Test
    @MyTestNGAnnotation(name="Jack", city="San Francisco", state="California")
    public void testMyAnnotation() {
        System.out.println("The metadata from @MyTestNGAnnotation should have already been printed.");
        System.out.println("Starting my test method...");
    }

}
