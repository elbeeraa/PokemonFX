package es.masanz.ut7.pokemonfx.model.base;

import es.masanz.ut7.pokemonfx.model.enums.TipoItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Entrenador {

    private List<Pokemon> pokemonesCapturados;
    private Pokemon[] pokemonesCombate;
    private Map<TipoItem, Integer> inventario;

    public Entrenador(){
        pokemonesCapturados = new ArrayList<>();
        pokemonesCombate = new Pokemon[6];
        inventario = new HashMap<>();
    }

    public void incluirPokemonParaCombatir(int pos, Pokemon pokemon){
        pokemonesCombate[pos] = pokemon;
    }

    public Map<TipoItem, Integer> getInventario() {
        return inventario;
    }

    public List<Pokemon> getPokemonesCapturados() {
        return pokemonesCapturados;
    }

    public Pokemon[] getPokemonesCombate() {
        return pokemonesCombate;
    }

}
