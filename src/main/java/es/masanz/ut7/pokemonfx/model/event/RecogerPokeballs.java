package es.masanz.ut7.pokemonfx.model.event;

import es.masanz.ut7.pokemonfx.app.GameApp;
import es.masanz.ut7.pokemonfx.model.base.Evento;
import es.masanz.ut7.pokemonfx.model.enums.TipoItem;

import java.util.Map;

public class RecogerPokeballs implements Evento {
    private String imagenEvento = "/pruebas/pokeball_transparente.png";

    @Override
    public void aplicarEfecto() {
        Map<TipoItem,Integer> items = GameApp.jugador.getInventario();
        if(!items.containsKey(TipoItem.POKEBALL)){
            items.put(TipoItem.POKEBALL, 0);
        }
        items.put(TipoItem.POKEBALL, items.get(TipoItem.POKEBALL) + 1);
        System.out.println("¡Has recogido una Pokeball!");
    }

    @Override
    public String imagenDelEvento() {
        return imagenEvento;
    }

    public boolean esCosumible() {
        return true;
    }
}
