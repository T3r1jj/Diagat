module gui {
    requires logic;
    requires javafx.controls;
    requires javafx.web;
    requires javafx.fxml;
    requires tornadofx;
    requires kotlin.stdlib;
    requires com.jfoenix;
    requires kfoenix;
    requires scenicviewpatch;
    exports io.github.t3r1jj.diagat.gui to tornadofx;
    exports io.github.t3r1jj.diagat.gui.views to tornadofx;
    opens io.github.t3r1jj.diagat.gui to javafx.graphics;
}