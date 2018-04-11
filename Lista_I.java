package Zadanie;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lista_I {

    public List<Osoba> lista_losowa = new ArrayList<Osoba>();


    Lista_I(List<Osoba>lista,int ilosc) {
       Random losowy = new Random();
        boolean k;
        for (int i = 0; i < ilosc; i++) {
            k = true;

            while (k) {

                int randomnumer = losowy.nextInt(lista.size());

                if (lista.get(randomnumer).status == 0) {

                    lista_losowa.add(lista.get(randomnumer));
                    k = false;
                }
            }
        }


    }



    void pokaz_liste_losowa(){
        System.out.println("LOSOWA LISTA(I):  ");
        for(int i=0; i<lista_losowa.size(); i++) {
            System.out.print(lista_losowa.get(i).imie+ " ");
        }

    }
}



