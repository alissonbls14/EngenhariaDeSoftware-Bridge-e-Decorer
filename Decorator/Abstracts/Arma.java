package Decorator.Abstracts;

import Decorator.Interfaces.IArma;

public abstract class Arma implements IArma {

    protected String nome;
    protected String descricao;
    protected double dano;
    protected double cadencia;

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public double getDano() {
        return dano;
    }

    @Override
    public double getCadencia() {
        return cadencia;
    }
}