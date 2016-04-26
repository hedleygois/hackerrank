/**
  * Created by hedleyluna on 24/04/16.
  */

object Solution4 {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    val n = sc.nextInt();
    val arr = new Array[Int](n);
    for(arr_i <- 0 to n-1) {
      arr(arr_i) = sc.nextInt();
    }
    println((arr.filter(number => number > 0).size.toDouble) / arr.size)
    println((arr.filter(number => number < 0).size.toDouble) / arr.size)
    println((arr.filter(number => number == 0).size.toDouble) / arr.size)
  }
}
