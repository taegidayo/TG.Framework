module org.tg.framewolk.Framework {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.tg.framewolk.Main to javafx.fxml;
    exports org.tg.framewolk.Main;
}