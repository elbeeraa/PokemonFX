package es.masanz.ut7.pokemonfx.model.enums;

public enum TipoItem {

    POKEBALL("Pokeball", "Captura pokemons salvajes"),
    POTION("Potion", "Cura 20 puntos de vida a un pokemon"),
    REVIVE("Revive", "Revive a un pokemon debilitado con la mitad de su vida"),
    BERRY("Berry", "Restaura 10 puntos de vida a un pokemon durante el combate"),;

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
