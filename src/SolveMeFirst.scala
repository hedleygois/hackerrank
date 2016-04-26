/**
  * Created by hedleyluna on 24/04/16.
  */

object Solution {
  def main(args: Array[String]) {
    println(io.Source.stdin.getLines().take(2).map(_.toInt).sum)
  }
}