import org.scalatest.{FlatSpec, Matchers}

class ExerciseP03Test extends FlatSpec with Matchers {

  behavior of "ExerciseP03"

  it should "return the nth element of the list" in {
    //given
    val list = List(1,2,3,4)

    //when
    val result = ExerciseP03.nth(2,list)

    //then
    result should === (Some(3))
  }

  it should "return None for index out of bounds" in {
    //given
    val list = List(1,2,3,4)

    //when
    val result = ExerciseP03.nth(5,list)

    //then
    result should be(None)
  }
}
