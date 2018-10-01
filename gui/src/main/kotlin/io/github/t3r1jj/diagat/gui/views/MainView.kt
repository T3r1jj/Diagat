package io.github.t3r1jj.diagat.gui.views

import io.github.t3r1jj.diagat.gui.Styles
import kfoenix.jfxlistview
import tornadofx.*

class MainView : View("Hello TornadoFX") {
    var menuItems = mutableListOf("Start", "Save", "Save As", "Options", "About", "Exit").observable()


    override val root = pane {
        addClass(Styles.welcomeScreen)
        stackpane {
            borderpane {
                jfxlistview(menuItems) {
                    depth = 3
                }
            }
        }
    }
}