package es.masanz.ut7.pokemonfx.model.map;

import es.masanz.ut7.pokemonfx.model.base.Entrenador;
import es.masanz.ut7.pokemonfx.model.base.Evento;
import es.masanz.ut7.pokemonfx.model.base.Mapa;
import es.masanz.ut7.pokemonfx.model.enums.CollisionType;
import es.masanz.ut7.pokemonfx.model.enums.TileType;
import es.masanz.ut7.pokemonfx.model.fx.NPC;
import es.masanz.ut7.pokemonfx.model.pokemons.*;

import java.util.ArrayList;

import static es.masanz.ut7.pokemonfx.util.Configuration.ABAJO;
import static es.masanz.ut7.pokemonfx.util.Configuration.ARRIBA;

public class RutaCasa extends Mapa {
    @Override
    protected void cargarPokemonSalvajes() {
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
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,2,2,2,1,1,1,1,1,1,1,1,1,1,1,4,1,1,1,1},
                {1,2,1,1,15,15,15,15,15,1,1,5,5,5,5,2,1,1,1,1},
                {1,2,1,1,16,16,16,16,16,1,1,5,5,5,5,2,1,1,1,1},
                {1,2,1,1,11,12,17,9,8,1,1,1,1,1,1,2,1,1,1,1},
                {1,2,1,1,13,7,14,7,10,1,1,1,1,1,2,2,1,1,1,1},
                {1,2,1,1,1,1,3,5,5,5,1,1,1,1,2,2,1,1,1,1},
                {1,2,1,1,1,1,3,3,1,1,1,1,1,1,2,2,1,1,1,1}
        };


        this.inicioX = 5;
        this.inicioY = 8;

        this.altura = mapaRuta.length;
        this.anchura = mapaRuta[0].length;
        this.nombre = "Ruta casa";

        this.mapData = new int[altura][anchura];
        this.collisionMap = new int[altura][anchura];
        this.teleportMap = new String[altura][anchura];
        this.eventsMap = new Evento[altura][anchura];
        this.npcs = new ArrayList<>();

//        Entrenador entrenador1 = new Entrenador();
//        entrenador1.incluirPokemonParaCombatir(0, new Bulbasaur(3));
//        entrenador1.incluirPokemonParaCombatir(1, new Charmander(3));
//        entrenador1.incluirPokemonParaCombatir(2, new Diglett(3));
//        entrenador1.incluirPokemonParaCombatir(3, new Squirtle(3));
//        entrenador1.incluirPokemonParaCombatir(4, new Machop(3));
//        entrenador1.incluirPokemonParaCombatir(5, new Onix(3));
//
//        Entrenador entrenador2 = new Entrenador();
//        entrenador2.incluirPokemonParaCombatir(0, new Lapras(3));
//        entrenador2.incluirPokemonParaCombatir(1, new Pikachu(3));
//        entrenador2.incluirPokemonParaCombatir(2, new Snorlax(3));
//        entrenador2.incluirPokemonParaCombatir(3, new Onix(3));
//        entrenador2.incluirPokemonParaCombatir(4, new Bulbasaur(3));
//        entrenador2.incluirPokemonParaCombatir(5, new Charmander(3));
//
//        Entrenador entrenador3 = new Entrenador();
//        entrenador3.incluirPokemonParaCombatir(0, new Charmander(3));
//        entrenador3.incluirPokemonParaCombatir(1, new Charmander(3));
//        entrenador3.incluirPokemonParaCombatir(2, new Charmander(3));
//        entrenador3.incluirPokemonParaCombatir(3, new Charmander(3));
//        entrenador3.incluirPokemonParaCombatir(4, new Charmander(3));
//        entrenador3.incluirPokemonParaCombatir(5, new Charmander(3));

//        // ENTRENADOR CON APARIENCIA RANDOM
//        npcs.add(new NPC(10, 2, ABAJO, entrenador1));
//        // ENTRENADOR CON APARIENCIA QUE YO INDICO
//        npcs.add(new NPC(6, 4, ARRIBA, 2, entrenador2));
//        npcs.add(new NPC(6, 6, ABAJO, 4, entrenador3));


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
                        // hierba
                        mapData[y][x] = TileType.CESPED_HIERBA.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 6:
                        // teleport
                        mapData[y][x] = TileType.CAMINO_BLANCO.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        teleportMap[y][x] = "Ruta 1";
                        break;
                    case 7:
                        // CASA
                        mapData[y][x] = TileType.CASA.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 8:
                        // CASA
                        mapData[y][x] = TileType.CASADERVEN1.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 9:
                        // CASA
                        mapData[y][x] = TileType.CASADERVEN2.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 10:
                        // CASA
                        mapData[y][x] = TileType.CASADERESQ.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 11:
                        // CASA
                        mapData[y][x] = TileType.CASAIZQVEN1.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 12:
                        // CASA
                        mapData[y][x] = TileType.CASAIZQVEN2.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 13:
                        // CASA
                        mapData[y][x] = TileType.CASAIZQESQ.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 14:
                        // CASA
                        mapData[y][x] = TileType.CASAPUERTA.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        teleportMap[y][x] = "Ruta 1";
                        break;
                    case 15:
                        // CASA
                        mapData[y][x] = TileType.CASATECHOA.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 16:
                        // CASA
                        mapData[y][x] = TileType.CASATECHOB.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 17:
                        // CASA
                        mapData[y][x] = TileType.CASA2.ordinal();
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
