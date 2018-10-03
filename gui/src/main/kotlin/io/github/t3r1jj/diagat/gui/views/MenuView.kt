package io.github.t3r1jj.diagat.gui.views

import tornadofx.*

abstract class MenuView(title: String) : View(title) {
    override fun toString(): String {
        return title
    }
}