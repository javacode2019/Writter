package lt.vytautas.writter.controllers;

import lt.vytautas.writter.domain.Message;
import lt.vytautas.writter.repos.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Map;

@Controller
public class FilterByTag {
    @Autowired
    private MessageRepo messageRepo;

    @PostMapping("/filterByTag")
    public String filterByTag (@RequestParam String filterByTag, Map<String,Object> model){
        Iterable<Message> messages;
        if( filterByTag!=null && !filterByTag.isEmpty()){
            messages= messageRepo.findByTag(filterByTag);
        }else{
            messages= messageRepo.findAll();
        }
        model.put("messages",messages);
        return "filterByTag";
    }
}
