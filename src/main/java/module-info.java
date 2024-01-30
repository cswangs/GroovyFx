module com.example.groovyfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.groovy;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.groovyfx to javafx.fxml;
    exports com.example.groovyfx;
}