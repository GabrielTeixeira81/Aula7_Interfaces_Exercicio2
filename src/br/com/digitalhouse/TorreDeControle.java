package br.com.digitalhouse;

import java.util.ArrayList;

public class TorreDeControle {
    list<Voador> voadores = new ArrayList<>();

    public void adicionarVoador(Voador umVoador) {
        this.voadores.add(umVoador);
    }

    public void voemTodos(){
        for (Voador umVoador : voadores){
            umVoador.voar();
        }
    }
}
