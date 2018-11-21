package com.esme.spring.faircorp;

import com.esme.spring.faircorp.hello.ConsoleGreetingService;
import org.hamcrest.Matchers;
import org.junit.Rule;
import org.junit.Test;

import org.springframework.boot.test.rule.OutputCapture;

public class ConsoleGreetingServiceTests {

    @Rule
    public OutputCapture outputCapture = new OutputCapture();

    @Test
    public void testGreeting() {
        ConsoleGreetingService greetingService = new ConsoleGreetingService(); // (1)
        greetingService.greet("Hello, Spring!");
        outputCapture.expect(Matchers.startsWith("Hello, Spring!"));

    }
}
