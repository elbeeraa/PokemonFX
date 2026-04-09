package es.masanz.ut7.pokemonfx.model.items;

import es.masanz.ut7.pokemonfx.model.base.Item;
import es.masanz.ut7.pokemonfx.model.enums.TipoItem;

public class PocionParcial extends Item {

    public PocionParcial() {
        super(TipoItem.POTION);
    }

    public void usar() {
        System.out.println("Has usado una Poción Parcial para restaurar parte de los HP de tu Pokémon.");
    }
}
