package io.github.t3r1jj.diagat.gui

import io.github.t3r1jj.diagat.gui.views.DefaultMenuView
import io.github.t3r1jj.diagat.gui.views.MenuView
import io.github.t3r1jj.diagat.gui.views.StartView
import javafx.beans.property.ObjectProperty
import javafx.beans.property.SimpleObjectProperty
import javafx.collections.FXCollections
import javafx.collections.ObservableList
import tornadofx.*

class MainController : Controller() {

    val menuViews: ObservableList<MenuView> = FXCollections.observableArrayList(StartView(), DefaultMenuView("Save"),
            DefaultMenuView("Save As"), DefaultMenuView("Options"), DefaultMenuView("About"), DefaultMenuView("Exit"))
    val menuView: ObjectProperty<MenuView> = SimpleObjectProperty(menuViews.get(0))

    init {
        menuView.addListener(ChangeListener { observable, oldValue, newValue -> oldValue.replaceWith(newValue) })
    }
}