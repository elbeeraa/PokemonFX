package es.masanz.ut7.pokemonfx.model.enums;

public enum TipoItem {

    POKEBALL("Pokeball", "Captura pokemons salvajes"),
    POTION("Potion", "Cura 10 puntos de vida a tus pokemon en combate"),
    //TODO HACER QUE REVIVA UN POKEMON EN COMBATE CON LA MITAD DE LA VIDA
    REVIVE("Revive", "Revive a un pokemon debilitado con la mitad de su vida");

    private String nombre;
    private String descripcion;

    TipoItem(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
