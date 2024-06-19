
package com.mycompany.ejerciciotipoparcial.people.visitante;

import com.mycompany.ejerciciotipoparcial.people.Person;
import com.mycompany.ejerciciotipoparcial.people.typePerson;
import com.mycompany.ejerciciotipoparcial.sportCenter.Sport;

public class Visitante extends Person {
    
   private typePerson type;

    public Visitante(String name, String lastname, int age, String Id) {
        super(name, lastname, age, Id, typePerson.VISITANTE);
        this.type = typePerson.VISITANTE;
    }

    public typePerson getType() {
        return type;
    }

    public void setType(typePerson type) {
        this.type = type;
    }
}

    
    
    
    
    

