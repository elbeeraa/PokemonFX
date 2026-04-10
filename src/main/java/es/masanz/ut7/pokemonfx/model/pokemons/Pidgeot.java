package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.*;

public class Pidgeot extends Pokemon implements Volador, Normal {
    public Pidgeot(int nivel){
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
        // Nivel 1: Ataque Rápido
        Ataque ataqueRapido = new Ataque("ataque rápido", 40, 100, Tipo.NORMAL, false, 30);
        asignarAtaque(ataqueRapido.getNombre(), ataqueRapido);

        // Nivel 10: Tornado
        Ataque tornado = new Ataque("tornado", 40, 100, Tipo.VOLADOR, true, 35);
        asignarAtaque(tornado.getNombre(), tornado);

        // Nivel 20: Ataque Ala
        Ataque ataqueAla = new Ataque("ataque ala", 60, 100, Tipo.VOLADOR, false, 35);
        asignarAtaque(ataqueAla.getNombre(), ataqueAla);

        // Nivel 25: Golpe Aéreo
        Ataque golpeAereo = new Ataque("golpe aéreo", 60, 100, Tipo.VOLADOR, false, 20);
        asignarAtaque(golpeAereo.getNombre(), golpeAereo);

        // Nivel 32: Pájaro Osado
        Ataque pajaroOsado = new Ataque("pájaro osado", 120, 100, Tipo.VOLADOR, false, 15);
        asignarAtaque(pajaroOsado.getNombre(), pajaroOsado);
    }

    @Override
    public Pokemon clone() {
        Pidgeot clon = new Pidgeot(this.nivel);
        if (this.apodo != null) {
            clon.setApodo(this.apodo);
        }
        return clon;
    }
}
