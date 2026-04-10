package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Normal;

public class Snorlax extends Pokemon implements Normal {
    public Snorlax(int nivel){
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return 5;
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        // Esto NO MOLA. Tener en cuenta que el apodo y los IV los perdemos si hacemos esto
        Pokemon pokemon = new Charmander(this.nivel);
        return pokemon;
    }

    @Override
    protected void asignarAtaques() {
        // Nivel 1: Placaje
        Ataque placaje = new Ataque("placaje", 35, 95, Tipo.NORMAL, false, 35);
        asignarAtaque(placaje.getNombre(), placaje);

        // Nivel 10: Mordisco
        Ataque mordisco = new Ataque("mordisco", 60, 100, Tipo.SINIESTRO, false, 25);
        asignarAtaque(mordisco.getNombre(), mordisco);

        // Nivel 20: Golpe Cuerpo
        Ataque golpeCuerpo = new Ataque("golpe cuerpo", 85, 100, Tipo.NORMAL, false, 15);
        asignarAtaque(golpeCuerpo.getNombre(), golpeCuerpo);

        // Nivel 25: Demolición
        Ataque demolicion = new Ataque("demolición", 75, 100, Tipo.LUCHA, false, 15);
        asignarAtaque(demolicion.getNombre(), demolicion);

        // Nivel 32: Hiperrayo
        Ataque hiperrayo = new Ataque("hiperrayo", 150, 90, Tipo.NORMAL, true, 5);
        asignarAtaque(hiperrayo.getNombre(), hiperrayo);
    }

    @Override
    public Pokemon clone() {
        Snorlax clon = new Snorlax(this.nivel);
        if (this.apodo != null) {
            clon.setApodo(this.apodo);
        }
        return clon;
    }
}
