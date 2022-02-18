package com.example.fxml_hello_demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label nameLabel;
    @FXML
    private TextField nameField;

    @FXML
    protected void handleSubmitButton() {
        nameLabel.setText("Hello " + nameField.getText());
        nameField.clear();
    }
}