package es.masanz.ut7.pokemonfx.model.map;

import es.masanz.ut7.pokemonfx.model.base.Entrenador;
import es.masanz.ut7.pokemonfx.model.base.Evento;
import es.masanz.ut7.pokemonfx.model.base.Mapa;
import es.masanz.ut7.pokemonfx.model.enums.CollisionType;
import es.masanz.ut7.pokemonfx.model.enums.TileType;
import es.masanz.ut7.pokemonfx.model.fx.NPC;
import es.masanz.ut7.pokemonfx.model.pokemons.Bulbasaur;
import es.masanz.ut7.pokemonfx.model.pokemons.Charmander;
import es.masanz.ut7.pokemonfx.model.pokemons.Squirtle;

import java.util.ArrayList;

import static es.masanz.ut7.pokemonfx.util.Configuration.ABAJO;
import static es.masanz.ut7.pokemonfx.util.Configuration.ARRIBA;

public class RutaInicial extends Mapa {
    protected void cargarPokemonSalvajes(){
        pokemonSalvajes = new ArrayList<>();
        pokemonSalvajes.add(new Bulbasaur(80));
        pokemonSalvajes.add(new Squirtle(100));
        pokemonSalvajes.add(new Charmander(9));
    }

    @Override
    protected void cargarMapa() {

        int[][] mapaRuta = {
                {1,2,1,1,1,1,1,2,3,3,2,1,1,1,1,2,1,1,1,1},
                {1,2,2,2,2,2,2,2,3,3,2,2,2,2,2,2,1,1,1,1},
                {1,2,1,1,1,1,1,1,3,3,1,1,1,1,1,2,1,1,1,1},
                {1,2,1,1,1,1,1,1,3,3,1,1,1,1,1,2,1,1,1,1},
                {1,2,1,1,1,1,1,4,3,3,3,3,3,3,3,2,1,1,1,1},
                {1,2,5,5,5,5,5,4,6,6,6,3,3,3,3,2,1,1,1,1},
                {1,4,1,1,1,1,1,4,7,7,7,7,7,7,7,4,1,1,1,1},
                {1,4,1,1,1,1,1,4,7,7,7,7,7,7,7,4,1,1,1,1},
                {1,4,1,1,1,1,1,4,7,7,7,7,7,7,7,4,1,1,1,1},
                {1,4,1,5,5,5,5,4,7,7,7,7,7,7,7,4,1,1,1,1},
                {1,4,7,7,1,1,1,1,1,3,3,3,3,3,3,4,1,1,1,1},
                {1,4,7,7,1,1,1,1,1,3,3,3,3,3,3,4,1,1,1,1},
                {1,4,1,1,1,1,1,1,1,3,3,7,7,7,7,4,1,1,1,1},
                {1,4,2,2,5,5,5,5,2,2,2,7,7,7,7,4,1,1,1,1},
                {1,2,1,1,1,1,1,1,1,3,3,7,7,7,7,2,1,1,1,1},
                {1,2,1,1,1,1,1,1,1,3,3,7,7,7,7,2,1,1,1,1},
                {1,2,1,1,3,3,3,3,3,3,3,1,1,1,1,2,1,1,1,1},
                {1,2,1,1,3,3,3,3,3,3,3,1,1,1,2,2,1,1,1,1},
                {1,2,1,1,3,3,1,1,1,1,1,1,1,2,2,2,1,1,1,1},
                {1,2,5,5,3,3,8,5,5,5,5,5,5,5,2,2,1,1,1,1}
        };


        this.inicioX = 2;
        this.inicioY = 2;

        this.altura = mapaRuta.length;
        this.anchura = mapaRuta[0].length;
        this.nombre = "Ruta inicial";

        this.mapData = new int[altura][anchura];
        this.collisionMap = new int[altura][anchura];
        this.teleportMap = new String[altura][anchura];
        this.eventsMap = new Evento[altura][anchura];
        this.npcs = new ArrayList<>();

//        teleportMap[3][9] = "Ruta 1";

        Entrenador entrenador1 = new Entrenador();
        entrenador1.incluirPokemonParaCombatir(0, new Bulbasaur(50));
        entrenador1.incluirPokemonParaCombatir(1, new Bulbasaur(40));
        entrenador1.incluirPokemonParaCombatir(2, new Bulbasaur(30));
        entrenador1.incluirPokemonParaCombatir(3, new Bulbasaur(20));
        entrenador1.incluirPokemonParaCombatir(4, new Bulbasaur(10));
        entrenador1.incluirPokemonParaCombatir(5, new Bulbasaur(5));

        Entrenador entrenador2 = new Entrenador();
        entrenador2.incluirPokemonParaCombatir(0, new Charmander(50));
        entrenador2.incluirPokemonParaCombatir(1, new Charmander(40));
        entrenador2.incluirPokemonParaCombatir(2, new Charmander(30));
        entrenador2.incluirPokemonParaCombatir(3, new Charmander(20));
        entrenador2.incluirPokemonParaCombatir(4, new Charmander(10));
        entrenador2.incluirPokemonParaCombatir(5, new Charmander(5));

        // ENTRENADOR CON APARIENCIA RANDOM
        npcs.add(new NPC(2, 1, ABAJO, entrenador1));
        // ENTRENADOR CON APARIENCIA QUE YO INDICO
        npcs.add(new NPC(2, 3, ARRIBA, 0, entrenador2));

        for (int y = 0; y < altura; y++) {
            for (int x = 0; x < anchura; x++) {
                switch (mapaRuta[y][x]) {
                    case 1:
                        // Cesped
                        mapData[y][x] = TileType.CESPED.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 2:
                        // Muro blanco
                        mapData[y][x] = TileType.PARED_BLANCA.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 3:
                        // Camino blanco
                        mapData[y][x] = TileType.CAMINO_BLANCO.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 4:
                        // Arbustos
                        mapData[y][x] = TileType.CESPED_ARBUSTO.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 5:
                        // Muro + hierba
                        mapData[y][x] = TileType.MURO_MARRON_CESPED.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 6:
                        // Muro marrón + camino
                        mapData[y][x] = TileType.MONTE_CENTRO.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 7:
                        // hierba
                        mapData[y][x] = TileType.CESPED_HIERBA.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 8:
                        // cartelito
                        mapData[y][x] = TileType.CARTEL.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    default:
                        mapData[y][x] = TileType.CESPED.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                }
            }
        }
    }
}
