package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.*;

public class Lapras extends Pokemon implements Agua, Hielo {
    public Lapras(int nivel){
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

        // Nivel 10: Pistola Agua
        Ataque pistolaAgua = new Ataque("pistola agua", 40, 100, Tipo.AGUA, false, 25);
        asignarAtaque(pistolaAgua.getNombre(), pistolaAgua);

        // Nivel 20: Rayo Hielo
        Ataque rayoHielo = new Ataque("rayo hielo", 90, 100, Tipo.HIELO, true, 10);
        asignarAtaque(rayoHielo.getNombre(), rayoHielo);

        // Nivel 25: Cascada
        Ataque cascada = new Ataque("cascada", 80, 100, Tipo.AGUA, false, 15);
        asignarAtaque(cascada.getNombre(), cascada);

        // Nivel 32: Ventisca
        Ataque ventisca = new Ataque("ventisca", 110, 70, Tipo.HIELO, true, 5);
        asignarAtaque(ventisca.getNombre(), ventisca);
    }

    @Override
    public Pokemon clone() {
        Lapras clon = new Lapras(this.nivel);
        if (this.apodo != null) {
            clon.setApodo(this.apodo);
        }
        clon.regenerarIVs();
        return clon;
    }
}
