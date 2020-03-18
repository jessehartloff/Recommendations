package recommendations

object Recommendations {

  def standardDeviation[T](elements: List[T], property: T => Double): Double = {
    0.0
  }


  def correlation[T](elements: List[T], property1: T => Double, property2: T => Double): Double = {
    0.0
  }


  def topKCorrelations[T](elements: List[T], allProperties: Map[String, T => Double], testPropertyName: String, k: Int): List[String] = {
    List()
  }

}
