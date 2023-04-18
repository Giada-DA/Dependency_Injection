package co.develhope.dependencyinjection.controllers;

import co.develhope.dependencyinjection.services.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private MyService service;

    public MyController(MyService service) {
        System.out.println("Chiamato il costruttore della classe MyController");
        this.service = service;
    }

    @GetMapping
    public String helloMsg(){
        return "Bienvenido...alla spagnola";
    }

    @GetMapping("/getName")
    public String getName(){
        return service.getName();
    }
}
