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
public class Main {
    @Autowired
    private MessageRepo messageRepo;

    @GetMapping
    public  String main(Map<String, Object> model){
        Iterable<Message> messages= messageRepo.findAll();
        model.put("messages",messages);
        return "main";
    }
    @PostMapping
    public String add (@RequestParam String text, @RequestParam String tag, Map<String,Object> model){
        Message message = new Message(text,tag);
        messageRepo.save(message);
        Iterable<Message> messages= messageRepo.findAll();
        model.put("messages",messages);
        return "main";
    }
}
