package com.mycompany.ejerciciotipoparcial;

import com.mycompany.ejerciciotipoparcial.people.coach.Coach;
import com.mycompany.ejerciciotipoparcial.sportCenter.Scenary;
import static com.mycompany.ejerciciotipoparcial.sportCenter.Sport.FOOTBALL;
import com.mycompany.ejerciciotipoparcial.sportCenter.SportCenter;

public class EjercicioTipoParcial {

    public static void main(String[] args) {
    
        SportCenter center = new SportCenter("El maracana","parque","Todo el dia");
        
        Scenary escenario = new Scenary ("cancha de futbol",FOOTBALL,200);
        center.addScenary(escenario);
        
        Coach coach = new Coach ("pepe","perez",16,"dedd");
        try{
            center.reservScenary(coach.getType(),escenario);
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
    }
}
