package com.sss.suarlord;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloTest{
    @GetMapping("/")
    public String index(){
        return "Greeting from MIT";
    }
}
