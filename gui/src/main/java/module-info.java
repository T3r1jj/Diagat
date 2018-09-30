module gui {
    requires logic;
    requires javafx.controls;
    requires tornadofx;
    requires kotlin.stdlib;
    exports io.github.t3r1jj.diagat.gui to tornadofx;
    opens io.github.t3r1jj.diagat.gui to javafx.graphics;
}