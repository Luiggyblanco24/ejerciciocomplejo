package com.mycompany.ejerciciotipoparcial.people.coach;

import com.mycompany.ejerciciotipoparcial.people.Person;
import com.mycompany.ejerciciotipoparcial.people.typePerson;
import com.mycompany.ejerciciotipoparcial.sportCenter.Sport;

public class Coach extends Person {
    
    private Sport sport;
    private boolean avaible= true;
    private typePerson type;

   

    public Coach( String name, String lastname, int age, String Id) {
        super(name, lastname, age, Id, typePerson.COACH);
       
    }

    public typePerson getType() {
        return type;
    }

    
    public boolean isAvaible() {
        return avaible;
    }

    public void setAvaible(boolean avaible) {
        this.avaible = avaible;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

 
    
    
}
