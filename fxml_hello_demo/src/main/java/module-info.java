module com.example.fxml_hello_demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxml_hello_demo to javafx.fxml;
    exports com.example.fxml_hello_demo;
}