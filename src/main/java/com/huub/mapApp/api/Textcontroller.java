package com.huub.mapApp.api;

import com.huub.mapApp.model.Document;
import com.huub.mapApp.service.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class Textcontroller {

    @Autowired
    private transient final TextService textService;

    @Autowired
    public Textcontroller(TextService textService){
        this.textService = textService;
    }

    @PostMapping("/add")
    public void addDoc(@RequestBody Document doc){
        textService.addDoc(doc);
    }

    @GetMapping("/getAll")
    public List<Document> getAllDoc(){
        return textService.getAll();
    }

    @GetMapping("/get/{title}")
    public Document getDoc(@PathVariable("title") String title){
        return textService.getDoc(title);
    }
}
