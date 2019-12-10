package example

import org.scalatest._

class FizzBuzzSpec extends FlatSpec with Matchers {
  "The FizzBuzz object" should "return 1" in {
    FizzBuzz.query(1) shouldEqual 1
  }
}
