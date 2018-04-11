package Zadanie;



public class Names {

   Lista_Glowna names = new Lista_Glowna();



    String chose() {
        int los = names.los();
        String zwroc_nazw;
        zwroc_nazw = names.lista.get(los).nazwisko;
        names.lista.remove(los);
        System.out.println("Lista po usunieciu klienta: ");
        names.pokaz_liste_glowna_klient();

        return zwroc_nazw;
    }

}
