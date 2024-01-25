package org.example23;

import com.google.gson.Gson;

public class PersonProcess {
    public void process () {
        Person person = new Person("Oleksandr", "Kharchuk");
        String json = new Gson().toJson(person);
        System.out.println(json);
    }
}
