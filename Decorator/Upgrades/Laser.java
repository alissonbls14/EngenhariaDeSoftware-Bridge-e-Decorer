package Decorator.Upgrades;

import Decorator.Abstracts.UpgradeDecorator;
import Decorator.Interfaces.IArma;

public class Laser extends UpgradeDecorator {

    public Laser(IArma arma) {
        super(arma);

        if (arma.getNome().equals("Bazuca")) {
            throw new IllegalArgumentException(
                "Laser não pode ser instalado em uma Bazuca!"
            );
        }
    }

    @Override
    public String getDescricao() {
        return arma.getDescricao() + ", Laser";
    }
}