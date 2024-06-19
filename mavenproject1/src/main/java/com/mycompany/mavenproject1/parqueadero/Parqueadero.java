package com.mycompany.mavenproject1.parqueadero;

import com.mycompany.mavenproject1.personal.Profesores;
import java.util.Random;

public class Parqueadero {

    private typeVehiculo tipoVehiculo;

    public Parqueadero(typeVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public void registrarVehiculo(Profesores profesor) throws Exception {
        profesor.setTipoVehiculo(this.tipoVehiculo);
        System.out.println("Se ha registrado el vehículo tipo " + this.tipoVehiculo + " para el profesor " + profesor.getName());

        if (tipoVehiculo == tipoVehiculo.CARRO) {
            Random random = new Random();
            int randomNumber = random.nextInt(100);
            String spaceType;
            for (int i = 1; i < randomNumber; i++) {
                spaceType = "cr" + randomNumber; 
                System.out.println("el espacio asignado: " + spaceType);
                throw new Exception("espacio reservado para un carro");
            }
        } else {
            Random random = new Random();
            int randomNumber = random.nextInt(500);
            String spaceType;
            for (int i = 1; i < randomNumber; i++) {
                spaceType = "MT" + randomNumber; 
                System.out.println("el espacio asignado: " + spaceType);
                throw new Exception("espacio reservado para una moto");
            }
        }}}
    
