package com.example.demo;


import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/books")

public class BooksController {
    String s = "Returning";
    @GetMapping("/")
    @Cacheable("books")
    public String createOrder(){

        try
        {
            Thread.sleep(4000);
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt(); // restore interrupted status
        }
    return s;
    }
    @Cacheable("books")
    @GetMapping("/edit")
    public String editString(){
        this.s="Returning Changed";
        return  s;
    }

}
