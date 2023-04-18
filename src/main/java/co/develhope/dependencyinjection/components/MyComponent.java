package co.develhope.dependencyinjection.components;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private String myComponentName;

    public MyComponent(){
        System.out.println("Chiamato il costruttore della classe MyComponent");
        this.myComponentName = "Capitan Jack Sparrow";
    }

    public String getMyComponentName(){
        System.out.println("Chiamato il metodo getMyComponentName() della classe MyComponent");
        return myComponentName;
    }
}
