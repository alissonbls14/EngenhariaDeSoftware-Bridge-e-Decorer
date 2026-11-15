package Decorator.Upgrades;

import Decorator.Abstracts.UpgradeDecorator;
import Decorator.Interfaces.IArma;

public class Silenciador extends UpgradeDecorator {

    public Silenciador(IArma arma) {
        super(arma);

        if (arma.getNome().equals("Bazuca")) {
            throw new IllegalArgumentException(
                "Silenciador não pode ser instalado em uma Bazuca!"
            );
        }
    }

    @Override
    public String getDescricao() {
        return arma.getDescricao() + ", Silenciador";
    }

    @Override
    public double getDano() {
        return arma.getDano() - 2;
    }
}