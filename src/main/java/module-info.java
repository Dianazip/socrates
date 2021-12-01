module com.example.socrates {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.socrates to javafx.fxml;
    exports com.example.socrates;
}