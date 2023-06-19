package br.com.springshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TesteResource {

    @GetMapping
    public String test() {
        return "<h1> Ola mundo </h1>";
    }
}
