package io.github.t3r1jj.diagat.gui


import io.github.t3r1jj.diagat.gui.views.MainView
import javafx.stage.Stage
import org.scenicview.ScenicView
import tornadofx.*
import java.util.*


open class MyApp : App(MainView::class, Styles::class) {
    init {
        FX.messages = ResourceBundle.getBundle("Messages")
    }

    override fun start(stage: Stage) {
//        stage.initStyle(StageStyle.UNDECORATED)
        super.start(stage)
        ScenicView.show(stage.scene.root)
    }
}
