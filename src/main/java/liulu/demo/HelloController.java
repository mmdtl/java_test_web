package liulu.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String index(){
        String a = "aaaaaa";
        System.out.println(a);
        return "hello from spring boot!";
    }
}
