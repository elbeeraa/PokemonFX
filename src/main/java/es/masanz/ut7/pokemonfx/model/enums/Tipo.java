package es.masanz.ut7.pokemonfx.model.enums;

public enum Tipo {

    // TODO 10: Si se incluyen nuevos tipos de pokemon, se deberan reflejar aqui
    AGUA(new String[]{"PLANTA","ELECTRICO"}, new String[]{"FUEGO","AGUA","HIELO","ACERO"}, new String[]{}),
    FUEGO(new String[]{"AGUA","TIERRA","ROCA"}, new String[]{"PLANTA","FUEGO","HIELO","BICHO","ACERO", "HADA"}, new String[]{}),
    PLANTA(new String[]{"FUEGO","HIELO","VENENO","VOLADOR","BICHO"}, new String[]{"AGUA","ELECTRICO","PLANTA","TIERRA"}, new String[]{}),
    NORMAL(new String[]{"LUCHA"}, new String[]{}, new String[]{"FANTASMA"}),
    SINIESTRO(new String[]{"LUCHA","BICHO","HADA"}, new String[]{"FANTASMA","SINIESTRO"}, new String[]{"PSIQUICO"}),
    DRAGON(new String[]{"HIELO", "DRAGON","HADA"}, new String[]{"FUEGO","AGUA","ELECTRICO","PLANTA"}, new String[]{}),
    ELECTRICO(new String[]{"TIERRA"}, new String[]{"ELECTRICO","VOLADOR","ACERO"}, new String[]{}),
    HIELO(new String[]{"FUEGO","LUCHA","ROCA","ACERO"}, new String[]{"HIELO"}, new String[]{}),
    LUCHA(new String[]{"VOLADOR","PSIQUICO","HADA"}, new String[]{"BICHO","ROCA","SINIESTRO"}, new String[]{}),
    VENENO(new String[]{"TIERRA","PSIQUICO"}, new String[]{"PLANTA","LUCHA","VENENO","BICHO","HADA"}, new String[]{}),
    TIERRA(new String[]{"AGUA","PLANTA","HIELO"}, new String[]{"VENENO","ROCA"}, new String[]{"ELECTRICO"}),
    ROCA(new String[]{"AGUA","PLANTA","LUCHA","TIERRA","ACERO"}, new String[]{"NORMAL","FUEGO","VENENO","VOLADOR"}, new String[]{}),
    BICHO(new String[]{"FUEGO","VOLADOR","ROCA"}, new String[]{"PLANTA","LUCHA","TIERRA"}, new String[]{}),
    FANTASMA(new String[]{"FANTASMA","SINIESTRO"}, new String[]{"VENENO","BICHO"}, new String[]{"NORMAL","LUCHA"}),
    PSIQUICO(new String[]{"BICHO","FANTASMA","SINIESTRO"}, new String[]{"LUCHA","PSIQUICO"}, new String[]{}),
    VOLADOR(new String[]{"ELECTRICO","HIELO","ROCA"}, new String[]{"PLANTA","LUCHA","BICHO"}, new String[]{"TIERRA"}),
    ACERO(new String[]{"FUEGO","LUCHA","TIERRA"}, new String[]{"NORMAL","PLANTA","HIELO","VOLADOR","PSIQUICO","BICHO","ROCA","DRAGON","ACERO","HADA"}, new String[]{"VENENO"}),
    HADA(new String[]{"VENENO","ACERO"}, new String[]{"LUCHA","BICHO","SINIESTRO"}, new String[]{"DRAGON"});


    public final String[] debilidades;
    public final String[] resistencias;
    public final String[] inmunidades;

    Tipo(String[] debilidades, String[] resistencias, String[] inmunidades) {
        this.debilidades = debilidades;
        this.resistencias = resistencias;
        this.inmunidades = inmunidades;
    }

    public boolean esDebilContra(String tipo) {
        if(debilidades!=null && debilidades.length>0){
            for (String debilidad : debilidades) {
                if(debilidad.equalsIgnoreCase(tipo)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean esFuerteContra(String tipo) {
        if(resistencias!=null && resistencias.length>0){
            for (String resistencia : resistencias) {
                if(resistencia.equalsIgnoreCase(tipo)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean esInmuneContra(String tipo) {
        if(inmunidades!=null && inmunidades.length>0){
            for (String inmunidad : inmunidades) {
                if(inmunidad.equalsIgnoreCase(tipo)){
                    return true;
                }
            }
        }
        return false;
    }
}
