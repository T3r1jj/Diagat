package io.github.t3r1jj.diagat.gui


import io.github.t3r1jj.diagat.gui.views.MainView
import javafx.application.Application
import javafx.stage.Stage
import javafx.stage.StageStyle
import org.scenicview.ScenicView
import tornadofx.*


open class MyApp : App(MainView::class, Styles::class) {
    override fun start(stage: Stage) {
//        stage.initStyle(StageStyle.UNDECORATED)
        super.start(stage)
        ScenicView.show(stage.scene.root)
    }
}

/**
 * The main method is needed to support the mvn jfx:run goal.
 */
fun main(args: Array<String>) {
    Application.launch(MyApp::class.java, *args)
}
