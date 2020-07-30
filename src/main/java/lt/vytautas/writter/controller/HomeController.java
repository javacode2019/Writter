package lt.vytautas.writter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class HomeController {

    @GetMapping("/")
    public String greeting(Map<String,Object> model) {

        return "home";
    }




}