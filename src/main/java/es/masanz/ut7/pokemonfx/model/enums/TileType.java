package es.masanz.ut7.pokemonfx.model.enums;

import es.masanz.ut7.pokemonfx.controller.MapController;
import javafx.scene.image.Image;

public enum TileType {

    // TODO 09: Incluir nuevos tipos de sprites. Las dimensiones deben ser 16x16px
    CAMINO_BLANCO("/pruebas/camino_blanco.png"),
    PARED_BLANCA("/pruebas/pared_blanca.png"),
    CESPED("/pruebas/cesped.png"),
    CESPED_ARBUSTO("/pruebas/cesped_arbusto.png"),
    CESPED_HIERBA("/pruebas/cesped_hierba.png"),
    MONTE_CENTRO("/pruebas/monte_centro.png"),
    MONTE_BORDE_SUPERIOR("/pruebas/monte_borde_superior.png"),
    MONTE_BORDE_INFERIOR("/pruebas/monte_borde_inferior.png"),
    MONTE_BORDE_IZQUIERDA("/pruebas/monte_borde_izquierda.png"),
    MONTE_BORDE_DERECHA("/pruebas/monte_borde_derecha.png"),
    MONTE_ESQUINA_SUPERIOR_IZQUIERDA("/pruebas/monte_esquina_superior_izquierda.png"),
    MONTE_ESQUINA_SUPERIOR_DERECHA("/pruebas/monte_esquina_superior_derecha.png"),
    MONTE_ESQUINA_INFERIOR_IZQUIERDA("/pruebas/monte_esquina_inferior_izquierda.png"),
    MONTE_ESQUINA_INFERIOR_DERECHA("/pruebas/monte_esquina_inferior_derecha.png"),
    MURO_MARRON_CESPED("/pruebas/cesped_muro.png"),
    CARTEL("/pruebas/grava_cartel.png"),
    TELEPORT_RED("/pruebas/teleport_red.png"),
    CASA("/rutas/casa.png"),
    CASA2("/rutas/casa2.png"),
    CASADERVEN1("/rutas/casaDER1.png"),
    CASADERESQ("/rutas/casaDER2.png"),
    CASADERVEN2("/rutas/casaDER3.png"),
    CASAIZQVEN1("/rutas/casaIZQ1.png"),
    CASAIZQESQ("/rutas/casaIZQ2.png"),
    CASAIZQVEN2("/rutas/casaIZQ3.png"),
    CASAPUERTA("/rutas/puerta.png"),
    CASATECHOA("/rutas/techoA.png"),
    CASATECHOB("/rutas/techoB.png"),
    CARTELPOKE("/rutas/cartelPOKE.png"),


    MURO("/rutas/muro.png"),
    MURO1("/rutas/muro1.png"),
    MURO2("/rutas/muro2.png"),
    MURO3("/rutas/muro3.png"),
    ORDENADOR1("/rutas/ordenador1.png"),
    ORDENADOR2("/rutas/ordenador2.png"),
    ORDENADOR3("/rutas/ordenador3.png"),
    ORDENADOR4("/rutas/ordenador4.png"),
    ORDENADOR5("/rutas/ordenador5.png"),
    ORDENADOR6("/rutas/ordenador6.png"),
    PARED("/rutas/pared.png"),
    SILLA("/rutas/silla.png"),
    SUELO1("/rutas/suelo1.png"),
    SUELO2("/rutas/suelo2.png"),
    TELEPORT_ALFOMBRA("/rutas/teleport.png");



    public final Image imagen;

    TileType(String rutaImagen){
        imagen = new Image(MapController.class.getResource(rutaImagen).toExternalForm());
    }

}
