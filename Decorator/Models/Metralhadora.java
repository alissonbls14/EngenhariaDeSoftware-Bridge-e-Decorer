package Decorator.Models;

import Decorator.Abstracts.Arma;

public class Metralhadora extends Arma {

    public Metralhadora() {
        nome = "Metralhadora";
        descricao = "Metralhadora padrão";
        dano = 18;
        cadencia = 12;
    }
}