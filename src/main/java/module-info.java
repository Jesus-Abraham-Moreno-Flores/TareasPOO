module org.example.pruebajavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.desktop;


    opens org.example.pruebajavafx to javafx.fxml;
    exports org.example.pruebajavafx;
}