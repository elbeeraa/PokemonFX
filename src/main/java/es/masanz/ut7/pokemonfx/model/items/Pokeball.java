package es.masanz.ut7.pokemonfx.model.items;

import es.masanz.ut7.pokemonfx.model.base.Item;
import es.masanz.ut7.pokemonfx.model.enums.TipoItem;

public class Pokeball extends Item {

    public Pokeball() {
        super(TipoItem.POKEBALL);
    }

    public void usar() {
        System.out.println("usar pokeball");
    }
}
