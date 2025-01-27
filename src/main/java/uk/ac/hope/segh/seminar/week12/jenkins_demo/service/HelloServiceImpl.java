package uk.ac.hope.segh.seminar.week12.jenkins_demo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello() {
        return "Hello, World!";
    }
}
