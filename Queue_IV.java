package Zadanie;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Queue_IV {


    Queue<Osoba> kolejka = new LinkedList<>();

    Queue_IV(List<Osoba> lista){

        for(int i=0 ; i<lista.size();i++) {

            kolejka.offer(lista.get(i));


        }


    }

    void Wyswietl_kolejke(){
        System.out.println("KOLEJKA PO BILETY");

        int size = kolejka.size();
        for(int i=0 ; i<size;i++) {


            System.out.println(kolejka.peek().imie +" "+ kolejka.poll().nazwisko+" numer w kolejce:"+(i+1));

        }
    }


}
