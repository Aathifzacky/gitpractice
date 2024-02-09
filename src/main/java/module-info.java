module org.example.gitpractice {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens org.example.gitpractice to javafx.fxml;
    exports org.example.gitpractice;
}