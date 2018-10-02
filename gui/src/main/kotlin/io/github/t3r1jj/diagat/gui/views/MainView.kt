package io.github.t3r1jj.diagat.gui.views

import io.github.t3r1jj.diagat.gui.Styles
import javafx.scene.layout.Priority
import kfoenix.jfxlistview
import tornadofx.*

class MainView : View("Hello TornadoFX") {
    var menuItems = mutableListOf("Start", "Save", "Save As", "Options", "About", "Exit").observable()
    var startView = StartView()

    override val root = borderpane {
        addClass(Styles.welcomeScreen)
        left {
            anchorpane {
                gridpaneConstraints {
                    vgrow = Priority.ALWAYS
                }
                jfxlistview(menuItems) {
                    anchorpaneConstraints {
                        topAnchor = 0
                        rightAnchor = 0
                        bottomAnchor = 0
                        leftAnchor = 0
                    }
                }
            }
        }
        center {
            this += startView.root
        }
    }
}