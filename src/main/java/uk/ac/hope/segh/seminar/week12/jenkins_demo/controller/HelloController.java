package uk.ac.hope.segh.seminar.week12.jenkins_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.ac.hope.segh.seminar.week12.jenkins_demo.service.HelloService;

@RestController
public class HelloController {
    private final HelloService helloService;

    @Autowired
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello")
    public String hello() {
        return helloService.hello();
    }

    @GetMapping("/bye")
    public String bye() {
        return "Goodbye!";
    }
}
