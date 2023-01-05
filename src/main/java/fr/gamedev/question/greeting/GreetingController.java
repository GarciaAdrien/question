package fr.gamedev.question.greeting;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author djer1
 */
@RestController
public class GreetingController {
    /**
     * Greeting Controller template.
     */
    private static final String TEMPLATE = "Hello, %s!";
    /**
     * Greeting Controller counter.
     */
    private final AtomicLong counter = new AtomicLong();

    /**
     * @param name request parameter
     * @return new greeting based on request parameter
     */
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") final String name) {
        return new Greeting(counter.incrementAndGet(), String.format(TEMPLATE, name));
    }
}
