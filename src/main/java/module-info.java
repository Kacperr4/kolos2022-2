module org.example.kolos2022 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.kolos2022 to javafx.fxml;
    exports org.example.kolos2022;
}