package io.github.t3r1jj.diagat.gui.views

import io.github.t3r1jj.diagat.gui.Styles
import javafx.scene.layout.Priority
import tornadofx.*

class DefaultMenuView(title: String) : MenuView(title) {
    override val root = hbox {
        addClass(Styles.specivicView)
        hgrow = Priority.ALWAYS
        vgrow = Priority.ALWAYS
    }
}