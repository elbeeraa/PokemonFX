package es.masanz.ut7.pokemonfx.model.map;

import es.masanz.ut7.pokemonfx.model.base.Evento;
import es.masanz.ut7.pokemonfx.model.base.Mapa;
import es.masanz.ut7.pokemonfx.model.enums.CollisionType;
import es.masanz.ut7.pokemonfx.model.enums.TileType;
import es.masanz.ut7.pokemonfx.model.event.RecogerPocion;
import es.masanz.ut7.pokemonfx.model.pokemons.Bulbasaur;
import es.masanz.ut7.pokemonfx.model.pokemons.Charmander;
import es.masanz.ut7.pokemonfx.model.pokemons.Squirtle;

import java.util.ArrayList;

public class CentroPokemon extends Mapa {
    @Override
    protected void cargarPokemonSalvajes(){}

    @Override
    protected void cargarMapa() {

        this.nombre = "Casa pokemon";

        int[][] mapaRuta = {
                {8, 7, 6, 11, 11, 2, 11, 11, 11, 11},
                {9, 10, 16, 13, 13, 3, 13, 13, 13, 13},
                {1, 1, 1, 1, 1, 4, 14, 14, 14, 14},
                {13, 13, 13, 13, 13, 13, 14, 14, 14, 14},
                {14, 14, 14, 14, 14, 14, 14, 14, 14, 14},
                {14, 14, 14, 14, 14, 14, 14, 14, 14, 14},
                {14, 14, 14, 14, 14, 14, 14, 12, 12, 14},
                {14, 14, 14, 14, 14, 14, 14, 14, 14, 14},
                {14, 14, 14, 14, 15, 15, 14, 12, 12, 14},

        };

        this.inicioX = 3;
        this.inicioY = 8;

        this.altura = mapaRuta.length;
        this.anchura = mapaRuta[0].length;

        this.mapData = new int[altura][anchura];
        this.collisionMap = new int[altura][anchura];
        this.teleportMap = new String[altura][anchura];
        this.eventsMap = new Evento[altura][anchura];
        this.npcs = new ArrayList<>();


        for (int y = 0; y < altura; y++) {
            for (int x = 0; x < anchura; x++) {
                switch (mapaRuta[y][x]) {
                    case 1:
                        mapData[y][x] = TileType.MURO.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 2:
                        mapData[y][x] = TileType.MURO1.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 3:
                        mapData[y][x] = TileType.MURO2.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 4:
                        mapData[y][x] = TileType.MURO3.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 5:
                        //TODO PONER SPRITE DE LA ENFERMERA?
                    case 6:
                        mapData[y][x] = TileType.ORDENADOR1.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 7:
                        mapData[y][x] = TileType.ORDENADOR2.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 8:
                        mapData[y][x] = TileType.ORDENADOR3.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 9:
                        mapData[y][x] = TileType.ORDENADOR4.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 10:
                        mapData[y][x] = TileType.ORDENADOR5.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 11:
                        mapData[y][x] = TileType.PARED.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 12:
                        mapData[y][x] = TileType.SILLA.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    case 13:
                        mapData[y][x] = TileType.SUELO1.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 14:
                        mapData[y][x] = TileType.SUELO2.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                    case 15:
                        mapData[y][x] = TileType.TELEPORT_ALFOMBRA.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        teleportMap[y][x] = "Ruta 1";
                        break;
                    case 16:
                        mapData[y][x] = TileType.ORDENADOR6.ordinal();
                        collisionMap[y][x] = CollisionType.PARED.ordinal();
                        break;
                    default:
                        mapData[y][x] = TileType.CAMINO_BLANCO.ordinal();
                        collisionMap[y][x] = CollisionType.SUELO.ordinal();
                        break;
                }
            }
        }
    }
}
