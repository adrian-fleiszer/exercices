object ExerciseP03 extends App {

  def nth[A](n: Int,list: List[A]):Option[A] = {
    list.drop(n) match {
      case head :: tail => Some(head)
      case _ => None
    }
  }
}
