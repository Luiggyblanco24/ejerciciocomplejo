package com.mycompany.ejerciciotipoparcial.document;

import com.mycompany.ejerciciotipoparcial.people.typePerson;
import com.mycompany.ejerciciotipoparcial.sportCenter.Scenary;
import com.mycompany.ejerciciotipoparcial.sportCenter.SportCenter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Document {

    public void guardarEscenary(SportCenter center, typePerson type) {
        File fichero = null;
        FileWriter writer = null;
        PrintWriter pw = null;

        try {
            fichero = new File("./guardarEscenary.txt");
            writer = new FileWriter(fichero);
            pw = new PrintWriter(writer);
            pw.println("Los escenarios disponibles son:");
         
            pw.println("La cancha " + center.getName() + " en la locación " + center.getLocation() + " con capacidad de " + center.getSchedule());
    
            pw.println("El que quiere apartar es: " + type);
            if (type == typePerson.COACH || type == typePerson.SPORTSMAN) {
                pw.println("Escenario reservado");
            } else if (type == typePerson.VISITANTE) {
                pw.println("No puede apartar el escenario");
            }
        } catch (IOException e) {
        }
        try {
            if (pw != null) {
                pw.close();
            }
            if (writer != null) {
                writer.close();
            }
        } catch (IOException e) {
        }
    }
}
