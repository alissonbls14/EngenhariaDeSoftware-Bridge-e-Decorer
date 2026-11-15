package Decorator.Abstracts;

import Decorator.Interfaces.IArma;

public abstract class UpgradeDecorator implements IArma {

    protected IArma arma;

    public UpgradeDecorator(IArma arma) {
        this.arma = arma;
    }

    @Override
    public String getNome() {
        return arma.getNome();
    }

    @Override
    public String getDescricao() {
        return arma.getDescricao();
    }

    @Override
    public double getDano() {
        return arma.getDano();
    }

    @Override
    public double getCadencia() {
        return arma.getCadencia();
    }
}