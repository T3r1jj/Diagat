package io.github.t3r1jj.diagat.gui.views

import io.github.t3r1jj.diagat.gui.Styles
import javafx.scene.layout.Priority
import kfoenix.jfxlistview
import tornadofx.*

class StartView : MenuView("Start") {
    var startItems = mutableListOf("New", "Import").observable()
    var sharedItems = mutableListOf("A", "B", "C").observable()
    var recentItems = mutableListOf("1", "2", "3", "4").observable()

    override val root = hbox {
        addClass(Styles.specivicView)
        hgrow = Priority.ALWAYS
        vgrow = Priority.ALWAYS
        vbox {
            hgrow = Priority.ALWAYS
            vgrow = Priority.ALWAYS
            label(messages["new_task_label"]) { }
            jfxlistview(startItems) {

            }
            label(messages["shared_tasks_label"]) { }
            jfxlistview(sharedItems) {

            }
        }
        vbox {
            hgrow = Priority.ALWAYS
            vgrow = Priority.ALWAYS
            label(messages["recent_tasks_label"]) { }
            jfxlistview(recentItems) {
            }
        }
    }
}