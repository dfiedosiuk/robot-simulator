object ControlPanel extends App {

  def executeCommands(startRobot: Robot, commands: String) = {
    val nextRobot = commands.toUpperCase.toList.foldLeft(startRobot) { (rob, cmd) =>
      cmd match {
        case 'A' => rob.moveForward()
        case 'L' => rob.turnLeft()
        case 'R' => rob.turnRight()
        case x => println(s"${x} is invalid input!"); rob
      }
    }
    println(
      s"Robot is now in position {${nextRobot.x},${nextRobot.y}} " +
      s"and facing ${
      nextRobot.angle match {
        case -90 => "west"
        case 0 => "north"
        case 90 => "east"
        case 180 => "south"
      }}")
    nextRobot
  }
}