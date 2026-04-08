package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Tierra;

public class Diglett extends Pokemon implements Tierra {
    public Diglett(int nivel){
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
        // Nivel 1: Arañazo
        Ataque aranazo = new Ataque("arañazo", 40, 100, Tipo.NORMAL, false, 35);
        asignarAtaque(aranazo.getNombre(), aranazo);

        // Nivel 10: Golpe Roca
        Ataque golpeRoca = new Ataque("golpe roca", 40, 100, Tipo.LUCHA, false, 15);
        asignarAtaque(golpeRoca.getNombre(), golpeRoca);

        // Nivel 20: Magnitud
        Ataque magnitud = new Ataque("magnitud", 70, 100, Tipo.TIERRA, false, 30);
        asignarAtaque(magnitud.getNombre(), magnitud);

        // Nivel 25: Excavar
        Ataque excavar = new Ataque("excavar", 80, 100, Tipo.TIERRA, false, 10);
        asignarAtaque(excavar.getNombre(), excavar);

        // Nivel 32: Terremoto
        Ataque terremoto = new Ataque("terremoto", 100, 100, Tipo.TIERRA, true, 10);
        asignarAtaque(terremoto.getNombre(), terremoto);

    }

    @Override
    public Pokemon clone() {
        Diglett clon = new Diglett(this.nivel);
        if (this.apodo != null) {
            clon.setApodo(this.apodo);
        }
        return clon;
    }
}
