package es.masanz.ut7.pokemonfx.controller;

import es.masanz.ut7.pokemonfx.model.event.CuraPokemons;
import es.masanz.ut7.pokemonfx.model.fx.NPC;
import javafx.scene.SnapshotParameters;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ConversacionController {

    private Stage primaryStage;
    private Scene previousStage;
    private String ruta;
    private CuraPokemons eventoCura = new CuraPokemons();
    private String textoConversacion = "Tus Pokemon parecen cansados. ¿Quieres que los cure?";
    private String opcionA = "Si, curar equipo";
    private String opcionB = "No, gracias";

    public void load(Stage primaryStage, Scene previousStage, String ruta) {
        this.primaryStage = primaryStage;
        this.previousStage = previousStage;
        this.ruta = ruta;
        loadConversationScene(textoConversacion, opcionA, opcionB);
    }

    private void loadConversationScene(String textoConversacion, String opcionA, String opcionB) {
        double sceneWidth = previousStage.getWidth() > 0 ? previousStage.getWidth() : 480;
        double sceneHeight = previousStage.getHeight() > 0 ? previousStage.getHeight() : 320;

        WritableImage mapSnapshot = previousStage.getRoot().snapshot(new SnapshotParameters(), null);
        ImageView background = new ImageView(mapSnapshot);
        background.setFitWidth(sceneWidth);
        background.setFitHeight(sceneHeight);
        background.setPreserveRatio(false);

        StackPane sceneRoot = new StackPane();
        sceneRoot.getChildren().add(background);

        VBox dialogBox = new VBox(12);
        dialogBox.setMaxWidth(sceneWidth - 100);
        dialogBox.setMaxHeight(110);
        dialogBox.setPadding(new Insets(16));
        dialogBox.setStyle("-fx-background-color: white; -fx-border-color: black; -fx-border-width: 3;");

        Label texto = new Label();
        texto.setWrapText(true);
        texto.setTextFill(Color.BLACK);
        texto.setFont(Font.font("Arial", 16));
        texto.setText(textoConversacion);
        Button botonA = new Button();
        Button botonB = new Button();
        if(opcionA == null) {
            botonA.setDisable(true);
        }else {
            botonA = new Button(opcionA);
        }
        if(opcionB == null) {
            botonB.setDisable(true);
        }else {
            botonB = new Button(opcionB);
        }
        botonA.setMaxWidth(Double.MAX_VALUE);
        botonB.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(botonA, Priority.ALWAYS);
        HBox.setHgrow(botonB, Priority.ALWAYS);

        HBox botones = new HBox(10, botonA, botonB);
        botones.setAlignment(Pos.CENTER);

        botonA.setOnAction(e -> ejecutarOpcionAceptar());
        botonB.setOnAction(e -> cerrarConversacion());

        dialogBox.getChildren().addAll(texto, botones);
        StackPane.setAlignment(dialogBox, Pos.BOTTOM_CENTER);
        StackPane.setMargin(dialogBox, new Insets(0, 20, 20, 20));
        sceneRoot.getChildren().add(dialogBox);

        Scene scene = new Scene(sceneRoot, sceneWidth, sceneHeight);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Enfermera Joy");
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    private void ejecutarOpcionAceptar() {
        eventoCura.aplicarEfecto();
        textoConversacion = "¡Tus Pokemon han sido curados!";
        loadConversationScene(textoConversacion, null, "Gracias!");
    }

    private void cerrarConversacion() {
        primaryStage.setScene(previousStage);
    }
}
