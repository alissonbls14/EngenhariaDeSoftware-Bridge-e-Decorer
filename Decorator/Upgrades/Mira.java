package Decorator.Upgrades;

import Decorator.Abstracts.UpgradeDecorator;
import Decorator.Interfaces.IArma;

public class Mira extends UpgradeDecorator {

    public Mira(IArma arma) {
        super(arma);
    }

    @Override
    public String getDescricao() {
        return arma.getDescricao() + ", Mira";
    }
}