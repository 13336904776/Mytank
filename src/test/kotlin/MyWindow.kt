import javafx.application.Application
import javafx.scene.input.KeyCode
import javafx.scene.input.KeyEvent
import org.itheima.kotlin.game.core.Window

class MyWindow : Window() {
    override fun onCreate() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        println("窗体创建……")
    }

    override fun onDisplay() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    }

    override fun onKeyPressed(event: KeyEvent) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        when (event.code){
            KeyCode.ENTER -> println("点击了")
        }
    }

    override fun onRefresh() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

fun main(args: Array<String>) {
    Application.launch(MyWindow::class.java)
}