package Decorator.Upgrades;

import Decorator.Abstracts.UpgradeDecorator;
import Decorator.Interfaces.IArma;

public class MunicaoPerfurante extends UpgradeDecorator {

    public MunicaoPerfurante(IArma arma) {
        super(arma);

        if (arma.getNome().equals("Bazuca")) {
            throw new IllegalArgumentException(
                "Munição perfurante não pode ser usada em uma Bazuca!"
            );
        }
    }

    @Override
    public String getDescricao() {
        return arma.getDescricao() + ", Munição Perfurante";
    }

    @Override
    public double getDano() {
        return arma.getDano() + 5;
    }
}