package com.mycompany.ejerciciotipoparcial.sportCenter;

import com.mycompany.ejerciciotipoparcial.people.typePerson;

public class Scenary {
    
    private String name;
    private Sport sport;
    private int size;
    private boolean avaible=true;

    public Scenary(String name, Sport sport, int size) {
        this.name = name;
        this.sport = sport;
        this.size = size;
    }

    public boolean isAvaible() {
        return avaible;
    }

    public void setAvaible(boolean avaible) {
        this.avaible = avaible;
    }

    

    
   
    
    
}
