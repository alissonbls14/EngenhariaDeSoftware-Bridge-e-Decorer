package Decorator.Upgrades;

import Decorator.Abstracts.UpgradeDecorator;
import Decorator.Interfaces.IArma;

public class Empunhadura extends UpgradeDecorator {

    public Empunhadura(IArma arma) {
        super(arma);

        if (!arma.getNome().equals("Metralhadora")) {
            throw new IllegalArgumentException(
                "Empunhadura disponível apenas para Metralhadora!"
            );
        }
    }

    @Override
    public String getDescricao() {
        return arma.getDescricao() + ", Empunhadura";
    }
}