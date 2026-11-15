package Decorator.Upgrades;

import Decorator.Abstracts.UpgradeDecorator;
import Decorator.Interfaces.IArma;

public class TamborGiratorio extends UpgradeDecorator {

    public TamborGiratorio(IArma arma) {
        super(arma);

        if (!arma.getNome().equals("Metralhadora")) {
            throw new IllegalArgumentException(
                "Tambor giratório disponível apenas para Metralhadora!"
            );
        }
    }

    @Override
    public String getDescricao() {
        return arma.getDescricao() + ", Tambor Giratório";
    }
}