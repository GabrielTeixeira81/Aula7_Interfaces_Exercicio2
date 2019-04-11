package br.com.digitalhouse;

public class Aviao implements Voador{

    private int horasvoo;

    public Aviao(){}

    public Aviao(int horasvoo){
        this.horasvoo = horasvoo;
    }


    @Override
    public void voar() {
        this.horasvoo += 13;
        System.out.println("Estou voando como um aviao");
    }
}
