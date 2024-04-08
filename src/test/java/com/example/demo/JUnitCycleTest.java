package com.example.demo;

import org.junit.jupiter.api.*;

public class JUnitCycleTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("@beforeAll");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("@beforeEach");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("@afterEach");
    }

    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

    @Test
    public void test3() {
        System.out.println("test3");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("@afterAll");
    }
}
