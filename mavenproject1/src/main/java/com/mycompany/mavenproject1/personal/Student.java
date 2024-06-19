
package com.mycompany.mavenproject1.personal;

import com.mycompany.mavenproject1.parqueadero.typeVehiculo;

public class Student extends PersonalU {
    private String clase;
    private typePersonal type;
    private typeVehiculo tipe;
    

    public Student(String clase, String name, String codigo, String horaLlegada, typePersonal type) {
        super(name, codigo, horaLlegada, typePersonal.STUDIANTES);
        this.clase = clase;
        this.type =type;
    }

    public typeVehiculo getTipe() {
        return tipe;
    }

    public void setTipe(typeVehiculo tipe) {
        this.tipe = tipe.MOTO;
    }
    

    
    
    public void clases(){
        System.out.println("voy a aprender");
    }
}
