package com.mycompany.mavenproject1.personal;

import com.mycompany.mavenproject1.parqueadero.typeVehiculo;

public class Profesores extends PersonalU {

    private String area;
    private typeVehiculo tipoVehiculo; 
    private typePersonal tipoPersonal;

    public Profesores(String area, String name, String codigo, String horaLlegada, typePersonal tipo) {
        super(name, codigo, horaLlegada, typePersonal.PROFESORES);
        this.area = area;
        this.tipoPersonal = tipo;
    }

    public typeVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(typeVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public Profesores(typeVehiculo tipoVehiculo, String name, String codigo, String horaLlegada, typePersonal type) {
        super(name, codigo, horaLlegada, type);
        this.tipoVehiculo = tipoVehiculo;
    }

    public void clases() {
        System.out.println("Voy a dictar clases");
    }

}
