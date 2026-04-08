package es.masanz.ut7.pokemonfx.model.event;

import es.masanz.ut7.pokemonfx.app.GameApp;
import es.masanz.ut7.pokemonfx.model.base.Evento;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;

import java.util.List;

public class CuracionPokemons implements Evento {

    private String imagenEvento = "/pruebas/pokeball_transparente.png";

    @Override
    public void aplicarEfecto() {
        System.out.println("Evento de curación activado");
        if (GameApp.jugador == null) {
            System.out.println("Jugador es null");
            return;
        }
        List<Pokemon> pokemonCapturados = GameApp.jugador.getPokemonesCapturados();
        Pokemon[] pokemonesCombate = GameApp.jugador.getPokemonesCombate();
        for (int i = 0; i < pokemonesCombate.length; i++) {
            Pokemon pokemon = pokemonesCombate[i];
            if (pokemon != null) {
                pokemon.setHpActual(pokemon.getMaxHP());
                System.out.println("Curando pokemon combate");
            }
        }

        for (Pokemon pokemon : pokemonCapturados) {
            pokemon.setHpActual(pokemon.getMaxHP());
            System.out.println("Curando pokemons!");
        }
    }

    @Override
    public String imagenDelEvento() {
        return imagenEvento;
    }

    public boolean esCosumible() {
        return false;
    }

}
