case class Robot(var x: Int, var y: Int, var angle: Int) {

  def moveForward(): Robot = {
    angle match {
      case -90 => Robot(x - 1, y, angle)
      case 0 => Robot(x, y + 1, angle)
      case 90 => Robot(x + 1, y, angle)
      case 180 => Robot(x, y - 1, angle)
    }
  }

  def turnLeft(): Robot = {
    if (angle - 90 == -180) Robot(x, y, 180)
    else Robot(x, y, angle - 90)
  }

  def turnRight(): Robot = {
    if (angle + 90 == 270) Robot(x, y, -90)
    else Robot(x, y, angle + 90)
  }

}
