/**
  * Created by hedleyluna on 24/04/16.
  */
object Solution2 {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    val n = sc.nextInt();
    val arr = new Array[Long](n);
    for(arr_i <- 0 until n) {
      arr(arr_i) = sc.nextInt();
    }
    println(arr.reduce{(acc, i) => acc + i})
  }
}

