package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.*;

public class Gengar extends Pokemon implements Fantasma, Veneno {
    public Gengar(int nivel){
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
        // Nivel 1: Lengüetazo
        Ataque lenguetazo = new Ataque("lengüetazo", 30, 100, Tipo.FANTASMA, false, 30);
        asignarAtaque(lenguetazo.getNombre(), lenguetazo);

        // Nivel 10: Bola Sombra
        Ataque bolaSombra = new Ataque("bola sombra", 80, 100, Tipo.FANTASMA, true, 15);
        asignarAtaque(bolaSombra.getNombre(), bolaSombra);

        // Nivel 20: Bomba Lodo
        Ataque bombaLodo = new Ataque("bomba lodo", 90, 100, Tipo.VENENO, true, 10);
        asignarAtaque(bombaLodo.getNombre(), bombaLodo);

        // Nivel 25: Pulso Umbrío
        Ataque pulsoUmbrio = new Ataque("pulso umbrío", 80, 100, Tipo.SINIESTRO, true, 15);
        asignarAtaque(pulsoUmbrio.getNombre(), pulsoUmbrio);

        // Nivel 32: Psíquico
        Ataque psiquico = new Ataque("psíquico", 90, 100, Tipo.PSIQUICO, true, 10);
        asignarAtaque(psiquico.getNombre(), psiquico);

    }

    @Override
    public Pokemon clone() {
        Gengar clon = new Gengar(this.nivel);
        if (this.apodo != null) {
            clon.setApodo(this.apodo);
        }
        clon.regenerarIVs();
        return clon;
    }
}
