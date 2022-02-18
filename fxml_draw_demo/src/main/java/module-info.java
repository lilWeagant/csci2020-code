module com.example.fxml_draw_demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxml_draw_demo to javafx.fxml;
    exports com.example.fxml_draw_demo;
}