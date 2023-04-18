package co.develhope.dependencyinjection.components;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    /*private String myComponentName;

    public MyComponent(){
        System.out.println("MyComponent constructor has been called");
        this.myComponentName = "Karl Leeds";
    }

    public String getMyComponentName(){
        System.out.println("MyComponent.getMyComponentName() has been called");
        return myComponentName;
    }*/

    public String myComponentName;

    public MyComponent(){
        System.out.println("Chiamato il costruttore di MyComponent");
        this.myComponentName = "Renato Zero";
    }

    public String getMyComponentName(){
        System.out.println("Chiamato il metodo MyComponent.getMyComponentName");
        return myComponentName;
    }
}
