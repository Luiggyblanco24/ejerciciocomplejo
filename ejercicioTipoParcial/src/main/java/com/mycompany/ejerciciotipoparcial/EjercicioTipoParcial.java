package com.mycompany.ejerciciotipoparcial;

import com.mycompany.ejerciciotipoparcial.document.Document;
import com.mycompany.ejerciciotipoparcial.people.coach.Coach;
import com.mycompany.ejerciciotipoparcial.people.sportsman.Sportsman;
import com.mycompany.ejerciciotipoparcial.people.typePerson;
import com.mycompany.ejerciciotipoparcial.people.visitante.Visitante;
import com.mycompany.ejerciciotipoparcial.sportCenter.Scenary;
import static com.mycompany.ejerciciotipoparcial.sportCenter.Sport.FOOTBALL;
import com.mycompany.ejerciciotipoparcial.sportCenter.SportCenter;

public class EjercicioTipoParcial {

    public static void main(String[] args) {

        SportCenter center = new SportCenter("El Maracana", "parque", "Todo el día");

        Scenary escenario = new Scenary("cancha de fútbol", FOOTBALL, 200);
        center.addScenary(escenario);

        //Coach coach = new Coach("Pepe", "Perez", 16, "dedd");
        Sportsman sportsman = new Sportsman(FOOTBALL,"luiggy", "vega", 22, "sasas");
        Visitante visitante = new Visitante("Juan", "Lopez", 55, "sadas");
        
        Document document = new Document();

        try {
            //center.reservScenary(coach.getType(), escenario);
            center.reservScenary(sportsman.getType(), escenario);
            //center.reservScenary(visitante.getType(), escenario);
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        document.guardarEscenary(center, typePerson.SPORTSMAN);
    
    }}

