/**
  * Created by hedleyluna on 24/04/16.
  */

object Solution6 {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    val t = sc.nextInt()
    var a0 = 0
    while(a0 < t) {
      val alumniQuantity = sc.nextInt()
      val threshold = sc.nextInt()
      val a = new Array[Int](alumniQuantity)
      for(a_i <- 0 until alumniQuantity) {
        a(a_i) = sc.nextInt()
      }
      val onTime = a.filter(hour => hour <= 0).size
      if(onTime >= threshold) println("NO") else println("YES")
      a0+=1
    }
  }
}
