package Decorator.Upgrades;

import Decorator.Abstracts.UpgradeDecorator;
import Decorator.Interfaces.IArma;

public class MunicaoExplosiva extends UpgradeDecorator {

    public MunicaoExplosiva(IArma arma) {
        super(arma);

        if (arma.getNome().equals("Bazuca")) {
            throw new IllegalArgumentException(
                "A Bazuca já utiliza projéteis explosivos!"
            );
        }
    }

    @Override
    public String getDescricao() {
        return arma.getDescricao() + ", Munição Explosiva";
    }

    @Override
    public double getDano() {
        return arma.getDano() + 10;
    }
}