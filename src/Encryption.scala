/**
  * Created by hedleyluna on 24/04/16.
  */
object Solution8 {
  def main(args: Array[String]): Unit = {
    val s = io.Source.stdin.getLines().next()
    val trimmed = s.replace(" ", "")
    var rows = Math.floor(Math.sqrt(trimmed.length)).toInt
    val columns = Math.ceil(Math.sqrt(trimmed.length)).toInt
    while((rows * columns) < trimmed.length)
      rows += 1
    val matrix = Array.ofDim[String](rows, columns)
    for(i <- 0 until rows) {
      var fullString = ""
      if((columns*i)+columns > trimmed.length) {
        fullString = trimmed.substring(columns * i, trimmed.length)
        val diff = columns - fullString.length
        for(k <- 0 until diff)
          fullString += " "
      }
      else
        fullString = trimmed.substring(columns*i, (columns*i)+columns)
      for(j <- 0 until fullString.length)
        matrix(i)(j) = fullString.charAt(j).toString
    }
    for(i <- 0 until columns) {
      for(j <- 0 until rows) {
        if(!matrix(j)(i).equals(" "))
          print(matrix(j)(i))
      }
      print(" ")
    }
  }
}
