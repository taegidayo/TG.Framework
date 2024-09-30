module org.tg.framewolk.Framework {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.mongodb.driver.sync.client;
    requires org.mongodb.driver.core;

    opens org.tg.framewolk.Main to javafx.fxml;
    exports org.tg.framewolk.Main;
}