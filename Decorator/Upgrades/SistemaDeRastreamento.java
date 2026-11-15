package Decorator.Upgrades;

import Decorator.Abstracts.UpgradeDecorator;
import Decorator.Interfaces.IArma;

public class SistemaDeRastreamento extends UpgradeDecorator {

    public SistemaDeRastreamento(IArma arma) {
        super(arma);

        if (!arma.getNome().equals("Bazuca")) {
            throw new IllegalArgumentException(
                "Sistema de rastreamento disponível apenas para Bazuca!"
            );
        }
    }

    @Override
    public String getDescricao() {
        return arma.getDescricao() + ", Sistema de Rastreamento";
    }
}