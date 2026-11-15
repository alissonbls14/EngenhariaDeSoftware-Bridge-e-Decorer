package Decorator.Upgrades;

import Decorator.Abstracts.UpgradeDecorator;
import Decorator.Interfaces.IArma;

public class MiraTermica extends UpgradeDecorator {

    public MiraTermica(IArma arma) {
        super(arma);

        if (arma.getNome().equals("Pistola")) {
            throw new IllegalArgumentException(
                "Mira térmica não pode ser instalada em uma Pistola!"
            );
        }
    }

    @Override
    public String getDescricao() {
        return arma.getDescricao() + ", Mira Térmica";
    }
}