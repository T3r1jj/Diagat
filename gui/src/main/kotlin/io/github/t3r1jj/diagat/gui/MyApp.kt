package io.github.t3r1jj.diagat.gui


import io.github.t3r1jj.diagat.gui.views.MainView
import javafx.application.Application
import javafx.concurrent.Task
import javafx.stage.Stage
import org.scenicview.ScenicView
import tornadofx.App
import javafx.concurrent.WorkerStateEvent
import javafx.event.EventHandler


open class MyApp : App(MainView::class, Styles::class) {
    override fun start(stage: Stage) {
        super.start(stage)
        Thread.sleep(1000)
        ScenicView.show(stage.scene.root)
    }
}

/**
 * The main method is needed to support the mvn jfx:run goal.
 */
fun main(args: Array<String>) {
    Application.launch(MyApp::class.java, *args)
}
