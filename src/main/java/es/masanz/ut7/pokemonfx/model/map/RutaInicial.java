package es.masanz.ut7.pokemonfx.model.map;

import es.masanz.ut7.pokemonfx.model.base.Entrenador;
import es.masanz.ut7.pokemonfx.model.base.Evento;
import es.masanz.ut7.pokemonfx.model.base.Mapa;
import es.masanz.ut7.pokemonfx.model.enums.CollisionType;
import es.masanz.ut7.pokemonfx.model.enums.TileType;
import es.masanz.ut7.pokemonfx.model.event.RecogerPocion;
import es.masanz.ut7.pokemonfx.model.event.RecogerPokeballs;
import es.masanz.ut7.pokemonfx.model.fx.NPC;
import es.masanz.ut7.pokemonfx.model.pokemons.*;

import java.util.ArrayList;

import static es.masanz.ut7.pokemonfx.util.Configuration.ABAJO;
import static es.masanz.ut7.pokemonfx.util.Configuration.ARRIBA;

public class RutaInicial extends Mapa {
    protected void cargarPokemonSalvajes(){
        pokemonSalvajes = new ArrayList<>();
        pokemonSalvajes.add(new Bulbasaur(4));
        pokemonSalvajes.add(new Squirtle(4));
        pokemonSalvajes.add(new Charmander(4));
        pokemonSalvajes.add(new Pikachu(4));
        pokemonSalvajes.add(new Onix(4));
        pokemonSalvajes.add(new Diglett(4));
        pokemonSalvajes.add(new Machop(4));
        pokemonSalvajes.add(new Gengar(4));
        pokemonSalvajes.add(new Lapras(4));
        pokemonSalvajes.add(new Pidgeot(4));
        pokemonSalvajes.add(new Snorlax(4));
    }

    @Override
    protected void cargarMapa() {

        int[][] mapaRuta = {
                {1,2,1,1,1,1,1,2,9,9,2,1,1,1,1,2,1,1,1,1},
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
                {1,2,1,11,1,1,1,1,1,3,3,7,7,7,7,2,1,1,1,1},
                {1,2,1,11,1,1,1,1,1,3,3,7,7,7,7,2,1,1,1,1},
                {1,2,1,10,3,3,3,3,3,3,3,1,1,1,1,2,1,1,1,1},
                {1,2,1,9,3,3,3,3,3,3,3,1,1,1,2,2,1,1,1,1},
                {1,2,1,1,3,3,1,1,1,1,1,1,1,2,2,2,1,1,1,1},
                {1,2,5,5,3,3,8,5,5,5,5,5,5,5,2,2,1,1,1,1}
        };


        this.inicioX = 5;
        this.inicioY = 19;

        this.altura = mapaRuta.length;
        this.anchura = mapaRuta[0].length;
        this.nombre = "Ruta inicial";

        this.mapData = new int[altura][anchura];
        this.collisionMap = new int[altura][anchura];
        this.teleportMap = new String[altura][anchura];
        this.eventsMap = new Evento[altura][anchura];
        this.npcs = new ArrayList<>();

        Entrenador entrenador1 = new Entrenador();
        entrenador1.incluirPokemonParaCombatir(0, new Bulbasaur(3));
        entrenador1.incluirPokemonParaCombatir(1, new Charmander(3));
        entrenador1.incluirPokemonParaCombatir(2, new Diglett(3));
        entrenador1.incluirPokemonParaCombatir(3, new Squirtle(3));
        entrenador1.incluirPokemonParaCombatir(4, new Machop(3));
        entrenador1.incluirPokemonParaCombatir(5, new Onix(3));

        Entrenador entrenador2 = new Entrenador();
        entrenador2.incluirPokemonParaCombatir(0, new Lapras(3));
        entrenador2.incluirPokemonParaCombatir(1, new Pikachu(3));
        entrenador2.incluirPokemonParaCombatir(2, new Snorlax(3));
        entrenador2.incluirPokemonParaCombatir(3, new Onix(3));
        entrenador2.incluirPokemonParaCombatir(4, new Bulbasaur(3));
        entrenador2.incluirPokemonParaCombatir(5, new Charmander(3));

        Entrenador entrenador3 = new Entrenador();
        entrenador3.incluirPokemonParaCombatir(0, new Charmander(3));
        entrenador3.incluirPokemonParaCombatir(1, new Charmander(3));
        entrenador3.incluirPokemonParaCombatir(2, new Charmander(3));
        entrenador3.incluirPokemonParaCombatir(3, new Charmander(3));
        entrenador3.incluirPokemonParaCombatir(4, new Charmander(3));
        entrenador3.incluirPokemonParaCombatir(5, new Charmander(3));

        // ENTRENADOR CON APARIENCIA RANDOM
        npcs.add(new NPC(10, 2, ABAJO, entrenador1));
        // ENTRENADOR CON APARIENCIA QUE YO INDICO
        npcs.add(new NPC(6, 4, ARRIBA, 2, entrenador2));
        npcs.add(new NPC(6, 6, ABAJO, 4, entrenador3));


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
                    case 9:
                        // teleport
                        mapData[y][x] = TileType.CAMINO_BLANCO.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        //TODO CAMBIAR
//                        teleportMap[y][x] = "Ruta 1";
                        teleportMap[y][x] = "Ruta casa";
                        break;
                    case 10:
                        // evento recoger poti
                        mapData[y][x] = TileType.CESPED.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        RecogerPocion eventoCuracion = new RecogerPocion();
                        eventsMap[y][x] = eventoCuracion;
                        break;
                    case 11:
                        // evento recoger pokeball
                        mapData[y][x] = TileType.CESPED.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        RecogerPokeballs rp = new RecogerPokeballs();
                        eventsMap[y][x] = rp;
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
