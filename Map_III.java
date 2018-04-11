package Zadanie;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Map_III {
     Map<String, Integer> mapa = new TreeMap<>();


    Map_III(List<Osoba> lista) {

        for (int i = 0; i < lista.size(); i++) {

            if (lista.get(i).status == 1) {


                if (mapa.get(lista.get(i).imie) == null)
                    mapa.put(lista.get(i).imie, 1);
                else
                    mapa.put(lista.get(i).imie, mapa.get(lista.get(i).imie) + 1);


            }

        }
    }
     void wyswietl_unikalne_prac(){

        Set<Map.Entry<String, Integer>> entrySet = mapa.entrySet();
        System.out.println("\nLISTA WYSTEPOWANIA IMION PRACOWNIKOW:");
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    int zwroc_najwieksza_liczbe() {

        int max = mapa.values().stream().max(Integer::compare).get();
        return max;

    }

}
