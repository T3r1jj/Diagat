package io.github.t3r1jj.diagat.gui


import javafx.application.Application
import tornadofx.App

open class MyApp : App(MainView::class, Styles::class)

/**
 * The main method is needed to support the mvn jfx:run goal.
 */
fun main(args: Array<String>) {
    Application.launch(MyApp::class.java, *args)
}
