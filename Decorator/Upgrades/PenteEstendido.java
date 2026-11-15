package Decorator.Upgrades;

import Decorator.Abstracts.UpgradeDecorator;
import Decorator.Interfaces.IArma;

public class PenteEstendido extends UpgradeDecorator {

    public PenteEstendido(IArma arma) {
        super(arma);

        if (arma.getNome().equals("Bazuca")) {
            throw new IllegalArgumentException(
                "Pente estendido não pode ser instalado em uma Bazuca!"
            );
        }
    }

    @Override
    public String getDescricao() {
        return arma.getDescricao() + ", Pente Estendido";
    }
}