package br.com.digitalhouse;

public class Pato implements Voador {

    private int energia;

    public Pato(){}

    public Pato(int energia){
        this.energia = energia;
    }

    @Override
    public void voar() {
        this.energia -= 5;
        System.out.println("Estou voando como Pato");
    }
}
