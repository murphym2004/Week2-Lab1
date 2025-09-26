package ie.atu.week2;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
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
        return new Person("matt", "21");
    }}



