
package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.parqueadero.Parqueadero;
import com.mycompany.mavenproject1.parqueadero.typeVehiculo;
import com.mycompany.mavenproject1.personal.Profesores;
import com.mycompany.mavenproject1.personal.typePersonal;

public class Mavenproject1 {

    public static void main(String[] args) {
    Profesores profesor = new Profesores("programacion", "badwin", "1921c", "2:00", typePersonal.PROFESORES);
     Parqueadero parqueadero = new Parqueadero(typeVehiculo.MOTO);
    
    try{
        parqueadero.registrarVehiculo(profesor);
    }catch (Exception ex){
         System.out.println(ex.getMessage());
    }
    }
}
