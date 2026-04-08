package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Lucha;

public class Machop extends Pokemon implements Lucha {
    public Machop(int nivel){
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return 6;
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

        // Nivel 10: Puño Fuego (puede ser un ataque físico elemental, solo como ejemplo)
        Ataque punoFuego = new Ataque("puño fuego", 40, 100, Tipo.FUEGO, false, 25);
        asignarAtaque(punoFuego.getNombre(), punoFuego);

        // Nivel 15: Puño Hielo
        Ataque punoHielo = new Ataque("puño hielo", 40, 100, Tipo.HIELO, false, 25);
        asignarAtaque(punoHielo.getNombre(), punoHielo);

        // Nivel 20: Puño Trueno
        Ataque punoTrueno = new Ataque("puño trueno", 40, 100, Tipo.ELECTRICO, false, 25);
        asignarAtaque(punoTrueno.getNombre(), punoTrueno);

        // Nivel 25: Cometazo
        Ataque cometazo = new Ataque("cometazo", 60, 95, Tipo.LUCHA, false, 20);
        asignarAtaque(cometazo.getNombre(), cometazo);

        // Nivel 32: Supersalto
        Ataque supersalto = new Ataque("supersalto", 90, 85, Tipo.LUCHA, true, 10);
        asignarAtaque(supersalto.getNombre(), supersalto);

    }

    @Override
    public Pokemon clone() {
        Machop clon = new Machop(this.nivel);
        if (this.apodo != null) {
            clon.setApodo(this.apodo);
        }
        return clon;
    }
}
