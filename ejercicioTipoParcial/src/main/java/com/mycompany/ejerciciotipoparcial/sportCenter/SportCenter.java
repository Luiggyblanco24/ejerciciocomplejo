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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public ArrayList<Scenary> getScenaries() {
        return scenaries;
    }

    public void setScenaries(ArrayList<Scenary> scenaries) {
        this.scenaries = scenaries;
    }

    public void reservScenary(typePerson type, Scenary scenary) throws Exception {
        if (type == typePerson.COACH || type == typePerson.SPORTSMAN) {

            int index = this.scenaries.indexOf(scenary);
            if (index != -1) {
                Scenary sc = this.scenaries.get(index);
                if (sc.isAvaible()) {
                    sc.setAvaible(false);
                    throw new Exception("los coach pueden reservar escenario");

                } else {
                    throw new Exception("El escenario no está disponible");
                }
            }
        } else if (type == typePerson.VISITANTE) {
            throw new Exception("Los visitantes no pueden apartar el escenario");
        }
    }
}
