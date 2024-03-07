module com.example.lab3_pc2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab3_pc2 to javafx.fxml;
    exports com.example.lab3_pc2;
}