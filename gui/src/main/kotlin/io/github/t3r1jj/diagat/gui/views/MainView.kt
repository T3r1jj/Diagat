package io.github.t3r1jj.diagat.gui.views

import io.github.t3r1jj.diagat.gui.MainController
import io.github.t3r1jj.diagat.gui.Styles
import javafx.event.EventHandler
import javafx.scene.layout.Priority
import kfoenix.jfxlistview
import tornadofx.*

class MainView : View("Hello TornadoFX") {
    val controller = MainController()

    override val root = borderpane {
        addClass(Styles.welcomeScreen)
        left {
            anchorpane {
                gridpaneConstraints {
                    vgrow = Priority.ALWAYS
                }
                jfxlistview(controller.menuViews) {
                    anchorpaneConstraints {
                        topAnchor = 0
                        rightAnchor = 0
                        bottomAnchor = 0
                        leftAnchor = 0
                    }
                    onMouseClicked = EventHandler {
                        controller.menuView.setValue(selectionModel.selectedItem)
                    }
                }
            }
        }
        center {
            this += controller.menuView.value.root
        }
    }
}