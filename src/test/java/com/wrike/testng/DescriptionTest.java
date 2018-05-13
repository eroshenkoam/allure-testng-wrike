package com.wrike.testng;

import io.qameta.allure.Description;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DescriptionTest {

    /**
     * beforeTestThird
     */
    @BeforeTest
    @Description(useJavaDoc = true)
    public void beforeTestThird() {

    }

    /**
     * beforeTestSecond
     */
    @BeforeTest
    @Description(useJavaDoc = true)
    public void beforeTestSecond() {

    }

    /**
     * beforeTestFirst
     */
    @BeforeTest
    @Description(useJavaDoc = true)
    public void beforeTestFirst() {

    }

    /**
     * beforeClassThird
     */
    @BeforeClass
    @Description(useJavaDoc = true)
    public void beforeClassThird() {
        throw new RuntimeException();
    }

    /**
     * beforeClassSecond
     */
    @BeforeClass
    @Description(useJavaDoc = true)
    public void beforeClassSecond() {

    }

    /**
     * beforeClassFirst
     */
    @BeforeClass
    @Description(useJavaDoc = true)
    public void beforeClassFirst() {

    }

    /**
     * beforeMethodThird
     */
    @BeforeMethod
    @Description(useJavaDoc = true)
    public void beforeMethodThird() {

    }

    /**
     * beforeMethodSecond
     */
    @BeforeMethod
    @Description(useJavaDoc = true)
    public void beforeMethodSecond() {

    }

    /**
     * beforeMethodFirst
     */
    @BeforeMethod
    @Description(useJavaDoc = true)
    public void beforeMethodFirst() {

    }

    /**
     * test
     */
    @Test
    public void testOutput() {

    }

}
