package Decorator.Upgrades;

import Decorator.Abstracts.UpgradeDecorator;
import Decorator.Interfaces.IArma;

public class Propulsor extends UpgradeDecorator {

    public Propulsor(IArma arma) {
        super(arma);

        if (!arma.getNome().equals("Bazuca")) {
            throw new IllegalArgumentException(
                "Propulsor disponível apenas para Bazuca!"
            );
        }
    }

    @Override
    public String getDescricao() {
        return arma.getDescricao() + ", Propulsor Melhorado";
    }

    @Override
    public double getDano() {
        return arma.getDano() + 20;
    }
}