package com.coreaidan.inkhelp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller {


    @FXML private TextField firstName;
    @FXML private Label noun;


    public void handleSaySup(ActionEvent actionEvent) {
        noun.setText(Main.getRandomAdjective() + " " + Main.getRandomNoun());
    }
}
