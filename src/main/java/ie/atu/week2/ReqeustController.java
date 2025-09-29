package ie.atu.week2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping

public class ReqeustController {
    @GetMapping("/hello")
    public String hello() {
        return "hello ";
    }

    @GetMapping("/greet/{matt}")
    public String greet(@PathVariable("matt") String matt) {
        return "hello " + matt;
    }

    @GetMapping("/details")
    public String details(@RequestParam String name, @RequestParam int Age) {
        return "details " + name + " " + Age;
    }

    @GetMapping("/Person")
    public Person getPerson() {
        return new Person("matt", 21);
    }

    @GetMapping("/calculator")
    public Calculator getCalculator() {
        return new Calculator(10, 20, 12, 3);
    }

    @GetMapping("/calculate")
    public String calculate(
            @RequestParam double num1,
            @RequestParam double num2,
            @RequestParam String operation) {

        switch (operation.toLowerCase()) {
            case "add":
                return "Result: " + (num1 + num2);
            case "subtract":
                return "Result: " + (num1 - num2);
            case "multiply":
                return "Result: " + (num1 * num2);
            case "divide":
                if (num2 == 0) {
                    return "cannot divide by zero.";
                }
                return "Result: " + (num1 / num2);
            default:
                return "Unknown operation. Use add, subtract, multiply or divide.";
        }
}}


