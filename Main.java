package Zadanie;

public class Main {

    static public void main(String[] args) {

        System.out.println("LISTA WSYZSTKICH: ");
        Lista_Glowna lista = new Lista_Glowna();
        lista.pokaz_liste_glowna();
        System.out.println("\n");

        System.out.println("I");
        Lista_I lista_losowa = new Lista_I(lista.lista ,7);   //DWA ARGUMENTY LISTA I ILOSC MiESIECY
        lista_losowa.pokaz_liste_losowa();
        System.out.println("\n");

        System.out.println("II");
        Set_II unikalna_lista = new Set_II(lista.lista);
        unikalna_lista.wyswietl_unikalne_imiona();
        System.out.println("\n ");

        System.out.println("III");
        Map_III zlicz = new Map_III(lista.lista);
        zlicz.wyswietl_unikalne_prac();
        System.out.println("\n ");

        System.out.println("IV");
        Queue_IV kolejka = new Queue_IV(lista.lista);
        kolejka.Wyswietl_kolejke();
        System.out.println("\n ");

        System.out.println("NAMES");
        Names name = new Names();
        String nazwisko;
        nazwisko = name.chose();
        System.out.println("NAZWISKO USUNIETEGO KLIENTA " + nazwisko);

        nazwisko = name.chose();
        System.out.println("NAZWISKO USUNIETEGO KLIENTA " + nazwisko);

        String nameee;
        System.out.println("\nFREQUUEND NAMES");


        frequendNames namee = new frequendNames();

        namee.frequendNames.wyswietl_unikalne_prac();

        nameee = namee.choose();

        nameee = namee.choose();

        nameee = namee.choose();








    }
}




