package com.mycompany.ejerciciotipoparcial.sportCenter;

import com.mycompany.ejerciciotipoparcial.people.typePerson;
import java.util.ArrayList;

public class SportCenter {

    private String name;
    private String location;
    private String schedule;

    private ArrayList<Scenary> scenaries = new ArrayList<>();

    public SportCenter(String name, String location, String schedule) {
        this.name = name;
        this.location = location;
        this.schedule = schedule;
    }

    public void addScenary(Scenary scenary) {
        this.scenaries.add(scenary);
    }

    public void reservScenary(typePerson type, Scenary scenary) throws Exception {

        if (type == typePerson.COACH || type == typePerson.SPORTSMAN) {
            int index = this.scenaries.indexOf(scenary);
            if (index != -1) {
                Scenary sc = this.scenaries.get(index);
                if (sc.isAvaible()) {
                    sc.setAvaible(false);
                } else {
                    throw new Exception("el escenario no esta disponible");

                }
            }

        }
    }
}
