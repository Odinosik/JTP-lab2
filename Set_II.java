package Zadanie;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Set_II {

    static Set<String> setunikalny = new TreeSet<String>();


   public Set_II(List<Osoba> lista) {

       for (int i = 0; i < lista.size(); i++) {

            if(lista.get(i).status ==1)
                setunikalny.add(lista.get(i).imie);


       }
   }


   static void wyswietl_unikalne_imiona() {

       System.out.println("\nLISTA UNIKALNYCH IMION PRACOWNIKOW: ");
       for (String name : setunikalny) {
           System.out.print(name+ " ");
       }
   }





}
