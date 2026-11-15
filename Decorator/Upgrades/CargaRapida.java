package Decorator.Upgrades;

import Decorator.Abstracts.UpgradeDecorator;
import Decorator.Interfaces.IArma;

public class CargaRapida extends UpgradeDecorator {

    public CargaRapida(IArma arma) {
        super(arma);
    }

    @Override
    public String getDescricao() {
        return arma.getDescricao() + ", Carga Rápida";
    }
}