package com.example.groovyfx

import javafx.fxml.FXML
import javafx.scene.control.Label

class HelloController {
    @FXML
    private Label welcomeText

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!")
    }
}