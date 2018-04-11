package Zadanie;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lista_Glowna {

   public  List<Osoba> lista = new ArrayList<Osoba>();




    Lista_Glowna(){
        Osoba os1= new Osoba("Tomek","Bonko",0);
        Osoba os2= new Osoba("Bartek","Nowak",1);
        Osoba os3= new Osoba("Piotr","Nowakowski",0);
        Osoba os4= new Osoba("Pawel","Baranowski",0);
        Osoba os5= new Osoba("Alicja","Mlot",0);
        Osoba os6= new Osoba("Karol","Bank",1);
        Osoba os7= new Osoba("Tomek","Bob",1);
        Osoba os8= new Osoba("Tomek","Bankowiec",1);
        Osoba os9= new Osoba("Bartek","Nowakow",1);
        Osoba os10= new Osoba("Bartek","Nowakowowi",1);
        Osoba os11 = new Osoba("Hubert","Czarnowski",0);
        this.lista.add(os1);
        this.lista.add(os2);
        this.lista.add(os3);
        this.lista.add(os4);
        this.lista.add(os5);
        this.lista.add(os6);
        this.lista.add(os7);
        this.lista.add(os8);
        this.lista.add(os9);
        this.lista.add(os10);
        this.lista.add(os11);

    }

    void pokaz_liste_glowna() {

        for(Osoba os : lista) {
            System.out.print(os.imie+" ");
            System.out.print(os.nazwisko+" ");
            System.out.println( "Status: "+os.status);
        }
    }
    void pokaz_liste_glowna_klient() {

        for(Osoba os : lista) {

            if(os.status == 0) {


                System.out.print(os.imie + " ");
                System.out.println(os.nazwisko + " ");
            }
        }
    }


    int los() {
        Random losowy = new Random();
        while(true) {
            int randomnumer = losowy.nextInt(lista.size());
            if (lista.get(randomnumer).status == 0)
                return randomnumer;
        }


    }



}
