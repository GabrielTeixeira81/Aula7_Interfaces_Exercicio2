package br.com.digitalhouse;

public class Super_Homem implements Voador {

    private int experiencia;

    public Super_Homem(){}

    public Super_Homem(int experiencia){
        this.experiencia = experiencia;
    }


    @Override
    public void voar() {
        this.experiencia += 3;
        System.out.println("Estou voando como um campeao");
        }
}
