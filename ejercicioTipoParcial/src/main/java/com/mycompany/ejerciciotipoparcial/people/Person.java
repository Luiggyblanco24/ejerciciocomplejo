
package com.mycompany.ejerciciotipoparcial.people;

public class Person {
    private String name;
    private String lastname;
    private int age;
    private String Id;
    private typePerson type;

    public Person(String name, String lastname, int age, String Id, typePerson type) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.Id = Id;
        this.type = type;
    }

    public Person(typePerson type) {
        this.type = type;
    }
    

    

  
    
}
