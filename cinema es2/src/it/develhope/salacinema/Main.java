package it.develhope.salacinema;

import java.util.Arrays;
import java.util.Scanner;

/*Realizzare un programma in Java che gestisca le prenotazioni di un cinema monosala.
La sala può contenere massimo 10 posti per ogni evento.
Realizzare quattro funzionalità mostrando un menù all'avvio del programma che mostrerà:

1) Elenco lista dei posti disponibili;
2) Prenota posto a sedere:
3) Cancella prenotazione:
4) Uscire dal programma*/
public class Main {
    public static void main(String[] args) {

        Cinema cinema = new Cinema();

        Scanner scanner = new Scanner(System.in);

        boolean condizione = true;
        while(condizione){
            System.out.println("----------------------------------------------------------");
            System.out.println("Seleziona 1 per Elenco lista dei posti disponibili");
            System.out.println("Seleziona 2 per prenotare posto a sedere");
            System.out.println("Seleziona 3 per cancellare prenotazione");
            System.out.println("Seleziona 4 per uscire dal programma");
            System.out.println("----------------------------------------------------------");

            switch (scanner.nextInt()){
            case 1:
                cinema.postiLiberi(cinema.sala);
                break;
            case 2:
                cinema.prenotaPosto(cinema.sala);
                break;
            case 3:
                cinema.cancellaPrenotazione(cinema.sala);
                break;
            case 4:
                condizione = false;
                break;
                default:
                    System.out.println("Inserisci un numero compreso tra 1 e 4");
        }
        }
        System.out.println("Persone prenotate: "+Arrays.toString(cinema.sala));
    }
}
