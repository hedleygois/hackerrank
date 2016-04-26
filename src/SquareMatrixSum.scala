object Solution3 {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    val n = sc.nextInt();
    val a = Array.ofDim[Int](n,n);
    var diagonalPrincipal = 0;
    var diagonalSecundaria = 0;
    for(a_i <- 0 to n-1) {
      for(a_j <- 0 to n-1){
        a(a_i)(a_j) = sc.nextInt();
        if(a_i == a_j) {
          diagonalPrincipal += a(a_i)(a_j)
        }
        if((a_i + a_j) == (n-1)) {
          diagonalSecundaria += a(a_i)(a_j)
        }
      }
    }
    println(Math.abs(diagonalPrincipal - diagonalSecundaria))
  }
}
