package es.masanz.ut7.pokemonfx.model.event;

import es.masanz.ut7.pokemonfx.app.GameApp;
import es.masanz.ut7.pokemonfx.model.base.Evento;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.TipoItem;

import java.util.List;
import java.util.Map;

public class RecogerPocion implements Evento {

    private String imagenEvento = "/items/potion.png";

    @Override
    public void aplicarEfecto() {
        Map<TipoItem,Integer> items = GameApp.jugador.getInventario();
        if(!items.containsKey(TipoItem.POTION)){
            items.put(TipoItem.POTION, 0);
        }
        items.put(TipoItem.POTION, items.get(TipoItem.POTION) + 1);
        System.out.println("¡Has recogido una poción!");
    }

    @Override
    public String imagenDelEvento() {
        return imagenEvento;
    }

    public boolean esCosumible() {
        return true;
    }

}
