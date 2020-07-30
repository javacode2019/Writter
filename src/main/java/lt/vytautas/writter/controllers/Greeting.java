package lt.vytautas.writter.controllers;

import lt.vytautas.writter.domain.Message;
import lt.vytautas.writter.repos.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class Greeting {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="Spring boot") String name,
                           Map<String,Object> model) {
        model.put("name", name);
        return "greeting";
    }




}