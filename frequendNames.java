package Zadanie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;


public class frequendNames {
    Lista_Glowna lista = new Lista_Glowna();
    Map_III  frequendNames = new Map_III(lista.lista );
    List<String> lista_usunietych = new ArrayList<String>();




    String choose() {

        String zwroc;
         if (frequendNames.mapa.isEmpty() !=true){
             int maxValueInMap = (Collections.max(frequendNames.mapa.values()));

             for (Map.Entry<String, Integer> entry : frequendNames.mapa.entrySet()) {

                 if (entry.getValue() == maxValueInMap) {
                     System.out.println("USUWAM IMIE PRACOWNIKA "+ entry.getKey());
                     zwroc = entry.getKey();

                     frequendNames.mapa.remove(zwroc);
                     lista_usunietych.add(zwroc);
                     return zwroc;
                 }
         }


        }
        return "Tablica pusta";


    }

    void insert(String imie) {


        lista_usunietych.add(imie);

    }
    void wyswietl() {
        System.out.println("LISTA USUNIETYCH OSOB" );

        for (int i = 0; i < lista_usunietych.size(); i++) {
            System.out.print(lista_usunietych.get(i) + " ");
        }
    }

}
