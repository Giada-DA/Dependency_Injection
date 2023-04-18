package co.develhope.dependencyinjection.services;

import co.develhope.dependencyinjection.components.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private MyComponent component;

    @Autowired
    public MyService(MyComponent component){
        System.out.println("Chiamato il costruttore della classe MyService");
        this.component = component;
    }

    public String getName(){
        System.out.println("Chiamato il metodo getName() della classe MyService");
        return component.getMyComponentName();
    }
}
