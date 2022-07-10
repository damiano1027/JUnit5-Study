package com.kimjuwon.junit5study;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StudyTest {
    @Test
    @DisplayName("테스트1")
    void test1() {
        System.out.println("test1");
    }

    @Test
    @DisplayName("테스트2")
    void test2() {
        System.out.println("test2");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("------------------");
        System.out.println("before all");
        System.out.println("------------------");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("------------------");
        System.out.println("after all");
        System.out.println("------------------");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("before each");
    }

    @AfterEach
    void afterEach() {
        System.out.println("after Each");
    }
}