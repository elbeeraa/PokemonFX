package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Electrico;

public class Pikachu extends Pokemon implements Electrico {
    public Pikachu(int nivel){
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return 7;
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

        // Nivel 10: Impactrueno
        Ataque impactrueno = new Ataque("impactrueno", 40, 100, Tipo.ELECTRICO, false, 30);
        asignarAtaque(impactrueno.getNombre(), impactrueno);

        // Nivel 20: Chispa
        Ataque chispa = new Ataque("chispa", 65, 100, Tipo.ELECTRICO, false, 20);
        asignarAtaque(chispa.getNombre(), chispa);

        // Nivel 25: Rayo
        Ataque rayo = new Ataque("rayo", 90, 100, Tipo.ELECTRICO, true, 15);
        asignarAtaque(rayo.getNombre(), rayo);

        // Nivel 32: Trueno
        Ataque trueno = new Ataque("trueno", 110, 70, Tipo.ELECTRICO, true, 10);
        asignarAtaque(trueno.getNombre(), trueno);

    }

    @Override
    public Pokemon clone() {
        Pikachu clon = new Pikachu(this.nivel);
        if (this.apodo != null) {
            clon.setApodo(this.apodo);
        }
        return clon;
    }

}
