package recommendations

object Recommendations {

  def standardDeviation[T](d1: List[T], stat: T => Double): Double = {
    0.0
  }


  // population or sample? sample coded here
  def correlation[T](d1: List[T], stat1: T => Double, stat2: T => Double): Double = {
    0.0
  }


  def topKCorrelations[T](d: List[T], statsOG: Map[String, T => Double], statString: String, k: Int): List[String] = {
    List()
  }

}
