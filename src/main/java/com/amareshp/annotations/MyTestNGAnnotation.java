package com.amareshp.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * A Custom Annotation to inject additional information into a TestNG Test
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyTestNGAnnotation {
    
    /**
     * Service.
     *
     * @return the string
     */
    String name() default "";
    
    String city() default "";

    String state() default "";
    
}
