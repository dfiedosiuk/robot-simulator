import org.scalatest._
import flatspec._
import matchers._

import ControlPanel._


class ControlPanelSpec extends AnyFlatSpec with should.Matchers {

  behavior of "A ControlPanel.executeCommands "

  it should "return new object Robot with parameters corresponding to the commands " in {
    executeCommands(Robot(7, 3, 0), "RAALAL") shouldBe Robot(9, 4, -90)
  }

  it should "return new object Robot with parameters corresponding to the commands skipping non-existing commands" in {
    executeCommands(Robot(7, 3, 0), "RAALALALWA") shouldBe Robot(8, 3, 180)
  }
}