package io.ninjava;

import io.ninjava.service.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @Autowired
    private CalcService calc;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/add/{i1}/{i2}")
    public int add(@PathVariable int i1, @PathVariable int i2) {
        return calc.add(i1, i2);
    }

    @RequestMapping("/sub/{i1}/{i2}")
    public int sub(@PathVariable int i1, @PathVariable int i2) {
        return calc.sub(i1, i2);
    }

}
