package com.mycompany.ejerciciotipoparcial.people.sportsman;

import com.mycompany.ejerciciotipoparcial.people.Person;
import com.mycompany.ejerciciotipoparcial.people.typePerson;
import com.mycompany.ejerciciotipoparcial.sportCenter.Sport;

public class Sportsman extends Person implements Doping, Feeding {
    
    private Sport sport;

    public Sportsman(Sport sport, String name, String lastname, int age, String Id, typePerson type) {
        super(name, lastname, age, Id, typePerson.SPORTSMAN);
        this.sport = sport;
    }

    @Override
    public void doTest() {
        System.out.println("Hacer pueba de sangre");
    }

    @Override
    public void diet() {
        if(this.sport == Sport.FOOTBALL){
            System.out.println("haciendo dieta futbolera");
        }
        else if( this.sport==Sport.BASKERBALL){
            System.out.println("Haciendo dieta Basquetbolera");
        }
        else if(this.sport == Sport.TENNIS){
            System.out.println("Haciendo dieta tenista");
        }
        
    }
        
}
