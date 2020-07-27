package lt.vytautas.writter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class Greeting {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name,
                           Map<String,Object> model) {
        model.put("name", name);
        return "greeting";
    }
    @GetMapping("/main")
    public  String main(Map<String, Object> model){
        model.put("some","Hello, coding is very fun!!!!");
        return "main";
    }

}