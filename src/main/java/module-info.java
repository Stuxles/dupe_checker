module com.stux.dupecheck {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.stux.dupecheck to javafx.fxml;
    exports com.stux.dupecheck;
}