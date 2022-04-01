object ControlPanel extends App {

  def executeCommands(startRobot: Robot, commands: String) = {
    val nextRobot = commands.toUpperCase.toList.foldLeft(startRobot) { (rob, cmd) =>
      cmd match {
        case 'A' => rob.moveForward()
        case 'L' => rob.turnLeft()
        case 'R' => rob.turnRight()
      }
    }
    println(s"Robot is now in position ${nextRobot.x},${nextRobot.y} and facing ${nextRobot.angle}")
    nextRobot
  }

}