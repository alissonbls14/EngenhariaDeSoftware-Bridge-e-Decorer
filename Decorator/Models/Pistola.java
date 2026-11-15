package Decorator.Models;

import Decorator.Abstracts.Arma;

public class Pistola extends Arma {
    public Pistola() {
        nome = "Pistola";
        descricao = "Uma pistola básicas";
        dano = 25.0;
        cadencia = 4.0;
    }
}
