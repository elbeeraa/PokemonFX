package es.masanz.ut7.pokemonfx.model.event;

import es.masanz.ut7.pokemonfx.app.GameApp;
import es.masanz.ut7.pokemonfx.model.base.Evento;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;

import java.util.List;

public class CuraPokemons implements Evento {

    private String imagenEvento = "";

    @Override
    public void aplicarEfecto() {
        System.out.println("Evento de curación activado");
        Pokemon[] pokemonesCombate = GameApp.jugador.getPokemonesCombate();
        if(pokemonesCombate == null) {
            System.out.println("Pokemones combate es null");
            return;
        }
        for (int i = 0; i < pokemonesCombate.length; i++) {
            Pokemon pokemon = pokemonesCombate[i];
            if (pokemon != null) {
                pokemon.setHpActual(pokemon.getMaxHP());
                if(pokemon.getHpActual() > pokemon.getMaxHP()) {
                    pokemon.setHpActual(pokemon.getMaxHP());
                }
            }
        }
        List<Pokemon> pokemonesEquipo = GameApp.jugador.getPokemonesCapturados();
        if(pokemonesEquipo == null) {
            System.out.println("Pokemones equipo es null");
            return;
        }
        for (Pokemon pokemon : pokemonesEquipo) {
            if (pokemon != null) {
                pokemon.setHpActual(pokemon.getMaxHP());
                if(pokemon.getHpActual() > pokemon.getMaxHP()) {
                    pokemon.setHpActual(pokemon.getMaxHP());
                }
            }
        }
    }

    @Override
    public String imagenDelEvento() {
        return imagenEvento;
    }

    @Override
    public boolean esCosumible() {
        return false;
    }
}
