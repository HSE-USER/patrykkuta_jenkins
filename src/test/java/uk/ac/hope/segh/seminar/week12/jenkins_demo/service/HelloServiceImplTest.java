package uk.ac.hope.segh.seminar.week12.jenkins_demo.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloServiceImplTest {
    @Test
    void hello() {
        HelloService helloService = new HelloServiceImpl();
        String result = helloService.hello();
        assertEquals("Hello, World!", result);
    }
}