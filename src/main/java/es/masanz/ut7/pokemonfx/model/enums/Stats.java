package es.masanz.ut7.pokemonfx.model.enums;

public enum Stats {

    // TODO 08: Incluir nuevos pokemon. Cuidado, el nombre correcto es muy IMPORTANTE
    // EXP BASE: https://pokemon.fandom.com/es/wiki/Experiencia_base
    // https://pokemon.fandom.com/es/wiki/Lista_de_Pokémon_con_sus_estadísticas_base
    BULBASAUR("001", 45, 49, 49, 45, 65, 65, 64),
    CHARMANDER("004", 39, 52, 43, 65, 60, 50, 65),
    SQUIRTLE("007", 44, 48, 65, 43, 50, 64, 66),
    PIKACHU("025", 35, 55, 40, 90, 50, 50, 82);

    public final String numPokedex;
    public final int hp, ataque, defensa, velocidad, ataqueEspecial, defensaEspecial, expBase;

    Stats(String numPokedex, int hp, int ataque, int defensa, int velocidad, int ataqueEspecial, int defensaEspecial, int expBase) {
        this.numPokedex = numPokedex;
        this.hp = hp;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaEspecial = defensaEspecial;
        this.expBase = expBase;
    }
}
