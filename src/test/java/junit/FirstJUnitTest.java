package junit;

import org.junit.jupiter.api.*;

public class FirstJUnitTest {

    @BeforeAll
    static  void beforeAll(){
        System.out.println("This is a test @BeforeAll");
    }

    @AfterAll
    static  void afterAll(){
        System.out.println("This is a test @AfterAll");
    }


    @BeforeEach
    void beforeEach(){
        System.out.println("This is a test @BeforeEach");
    }


    @AfterEach
    void afterEach(){
        System.out.println("This is a test @AfterEach");
    }


    @Test
    void firstTest(){
        System.out.println("This is a first test");
        Assertions.assertTrue(3 > 2);
    }

    @Test
    void secondTest(){
        System.out.println("This is a second test");
        Assertions.assertTrue(3 > 2);
    }




}
