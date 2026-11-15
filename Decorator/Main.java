package Decorator;

import Decorator.Interfaces.IArma;
import Decorator.Models.Pistola;
import Decorator.Models.Bazuca;
import Decorator.Models.Metralhadora;
import Decorator.Upgrades.*;

public class Main {

    public static void main(String[] args) {

        // Pistola com vários upgrades
        IArma pistola = new Pistola();
        pistola = new Silenciador(pistola);
        pistola = new Mira(pistola);
        pistola = new PenteEstendido(pistola);
        pistola = new Laser(pistola);

        System.out.println("=== PISTOLA ===");
        System.out.println(pistola.getDescricao());
        System.out.println("Dano: " + pistola.getDano());

        // Metralhadora com vários upgrades
        IArma metralhadora = new Metralhadora();
        metralhadora = new Mira(metralhadora);
        metralhadora = new PenteEstendido(metralhadora);
        metralhadora = new Empunhadura(metralhadora);
        metralhadora = new TamborGiratorio(metralhadora);

        System.out.println("\n=== METRALHADORA ===");
        System.out.println(metralhadora.getDescricao());
        System.out.println("Dano: " + metralhadora.getDano());

        // Bazuca com upgrades específicos
        IArma bazuca = new Bazuca();
        bazuca = new MiraTermica(bazuca);
        bazuca = new CargaRapida(bazuca);
        bazuca = new Propulsor(bazuca);
        bazuca = new SistemaDeRastreamento(bazuca);

        System.out.println("\n=== BAZUCA ===");
        System.out.println(bazuca.getDescricao());
        System.out.println("Dano: " + bazuca.getDano());
    }
}