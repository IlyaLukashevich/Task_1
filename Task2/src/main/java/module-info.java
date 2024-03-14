module com.example.test {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.test to javafx.fxml;
    exports com.example.test.rasterization;
    exports com.example.test.app;
    opens com.example.test.app to javafx.fxml;
}