package com.example.fxml_draw_demo;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class HelloController {
    @FXML
    private Canvas canvas;

    @FXML
    protected void onDrawButtonClick() {

        GraphicsContext gc = canvas.getGraphicsContext2D();
        draw(gc);
    }

    public void draw(GraphicsContext gc){
        gc.setFill(Color.BLUEVIOLET);
        gc.fillOval(10, 60, 100, 100);
    }
}