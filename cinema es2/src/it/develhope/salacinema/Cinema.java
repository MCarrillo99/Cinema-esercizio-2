package it.develhope.salacinema;

import java.util.Scanner;

public class Cinema {

    public Persona[] sala = new Persona[10];
    public Scanner scanner = new Scanner(System.in);

    public int postiLiberiStatic;
    public int numeroPostiLiberi = 0;
    public void postiLiberi(Persona[] sala){
        this.sala = sala;
        for (int i = 0; i < sala.length; i++){

            if (sala[i] == null){
                numeroPostiLiberi++;

            } else continue;
        }
        System.out.println("I posti disponibili sono: " + numeroPostiLiberi);
        postiLiberiStatic = numeroPostiLiberi;
        numeroPostiLiberi = 0;
    }

    public void prenotaPosto(Persona[] sala){
        postiLiberi(sala);
        this.sala = sala;
        System.out.println("Inserisci il numero di posti che desideri prenotare : ");
        try {
            int numeroPostiDaPrenotare = scanner.nextInt();

        if (numeroPostiDaPrenotare >= 1 && numeroPostiDaPrenotare <= postiLiberiStatic) {

            for (int i = 0; i < numeroPostiDaPrenotare; i++) {

                if (sala[i] == null) {
                    Persona persona = new Persona();
                    System.out.println("Inserisci il nome della persona numero : " + i + " che desideri prenotare : ");
                    persona.name = scanner.next();
                    System.out.println("Inserisci il cognome della persona numero : " + i + " che desideri prenotare : ");
                    persona.surname = scanner.next();
                    System.out.println("Inserisci l'età della persona numero : " + i + " che desideri prenotare : ");
                    persona.age = scanner.nextInt();
                    if (persona.age < 14){System.out.println("Paga il prezzo ridotto");
                    }else {
                        System.out.println("Paga il prezzo pieno");
                    }
                    sala[i] = persona;
                    System.out.println("Hai correttamente prenotato " + persona.name + " " + persona.surname);

                } else continue;
            }
        }else {
            System.out.println("devi inserire un numero compreso tra 1 e " + postiLiberiStatic);
        }
        }catch (Exception e){
            System.out.println("DEVI INSERIRE UN NUMERO!!");
        }
    }
    public void cancellaPrenotazione(Persona[] sala){
        this.sala = sala;
        System.out.println("Inserisci il nome della persona che desideri cancellare : ");
        String nomePersonaDaCancellare;
        nomePersonaDaCancellare = scanner.next();
        System.out.println("Inserisci il cognome della persona che desideri cancellare : ");
        String cognomePersonaDaCancellare;
        cognomePersonaDaCancellare = scanner.next();

        for (int i = 0; i < sala.length; i++){
            if (sala[i] != null && nomePersonaDaCancellare.equalsIgnoreCase(sala[i].name)
                    && cognomePersonaDaCancellare.equalsIgnoreCase(sala[i].surname)){
                sala[i] = null;
                System.out.println("hai correttamente cancellato la prenotazione di: " + nomePersonaDaCancellare + " "+ cognomePersonaDaCancellare);

            }
        }
        }


}
