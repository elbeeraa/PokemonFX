package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.*;

public class Onix extends Pokemon implements Roca, Tierra {
    public Onix(int nivel){
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

        // Nivel 10: Lanzarrocas
        Ataque lanzarrocas = new Ataque("lanzarrocas", 50, 90, Tipo.ROCA, false, 15);
        asignarAtaque(lanzarrocas.getNombre(), lanzarrocas);

        Ataque golpeRoca = new Ataque("golpe roca", 40, 100, Tipo.LUCHA, false, 15);
        asignarAtaque(golpeRoca.getNombre(), golpeRoca);

        // Nivel 25: Excavar
        Ataque excavar = new Ataque("excavar", 80, 100, Tipo.TIERRA, false, 10);
        asignarAtaque(excavar.getNombre(), excavar);

        // Nivel 32: Avalancha
        Ataque avalancha = new Ataque("avalancha", 75, 90, Tipo.ROCA, false, 10);
        asignarAtaque(avalancha.getNombre(), avalancha);

    }

    @Override
    public Pokemon clone() {
        Onix clon = new Onix(this.nivel);
        if (this.apodo != null) {
            clon.setApodo(this.apodo);
        }
        clon.regenerarIVs();
        return clon;
    }
}
