package es.masanz.ut7.pokemonfx.model.items;

import es.masanz.ut7.pokemonfx.app.GameApp;
import es.masanz.ut7.pokemonfx.model.base.Item;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.TipoItem;
import static es.masanz.ut7.pokemonfx.util.Configuration.*;

public class PocionParcial extends Item {

    public PocionParcial() {
        super(TipoItem.POTION);
    }

    public void usar() {
        System.out.println("Evento de curación activado");
        if (GameApp.jugador == null) {
            System.out.println("Jugador es null");
            return;
        }
        Pokemon[] pokemonesCombate = GameApp.jugador.getPokemonesCombate();
        for (int i = 0; i < pokemonesCombate.length; i++) {
            Pokemon pokemon = pokemonesCombate[i];
            if (pokemon != null) {
                pokemon.setHpActual(pokemon.getHpActual() + CURACION_PARCIAL);
                if(pokemon.getHpActual() > pokemon.getMaxHP()) {
                    pokemon.setHpActual(pokemon.getMaxHP());
                }
                System.out.println("Curando pokemons combate");
            }
        }

    }
}
