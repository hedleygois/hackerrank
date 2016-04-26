/**
  * Created by hedleyluna on 24/04/16.
  */

object Solution5 {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    val time = sc.next()
    val splitted = time.split(":")
    val newHours = if (splitted(0).toInt == 12) 0 else splitted(0).toInt
    val shift = if(time contains "PM") 12 else 0
    var sec = splitted(2).replace("PM", "")
    sec = sec.replace("AM", "")
    println("%02d:%02d:%02d".format((newHours + shift), splitted(1).toInt, sec.toInt))
  }
}
