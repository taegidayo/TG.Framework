module org.tg.framewalk.tg_framewolk {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.tg.framewalk.tg_framewolk to javafx.fxml;
    exports org.tg.framewalk.tg_framewolk;
}