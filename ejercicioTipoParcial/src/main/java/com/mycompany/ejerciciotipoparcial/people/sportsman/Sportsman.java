package com.mycompany.ejerciciotipoparcial.people.sportsman;

import com.mycompany.ejerciciotipoparcial.people.Person;
import com.mycompany.ejerciciotipoparcial.people.typePerson;
import com.mycompany.ejerciciotipoparcial.sportCenter.Sport;

public class Sportsman extends Person implements Doping, Feeding {
    
    private typePerson type;
    private Sport sport;

    public Sportsman(Sport sport, String name, String lastname, int age, String Id) {
        super(name, lastname, age, Id, typePerson.SPORTSMAN);
        this.type = typePerson.SPORTSMAN;
        this.sport = sport;
    }

    public typePerson getType() {
        return type;
    }

    public void setType(typePerson type) {
        this.type = type;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    @Override
    public void doTest() {
        System.out.println("Hacer prueba de sangre");
    }

    @Override
    public void diet() {
        System.out.println("Seguir una dieta balanceada");
    }
}
