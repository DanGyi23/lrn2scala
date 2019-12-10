package example

import org.scalatest._

class FizzBuzzSpec extends FlatSpec with Matchers {
  "The FizzBuzz object" should "return argument passed in query" in {
    FizzBuzz.query(1) shouldEqual 1
  }

  "The FizzBuzz object" should "return Fizz if 3 is passed as query" in {
    FizzBuzz.query(3) shouldEqual "Fizz"
  }

  "The FizzBuzz object" should "return Buzz if 5 is passed as query" in {
    FizzBuzz.query(5) shouldEqual "Buzz"
  }

  "The FizzBuzz object" should "return FizzBuzz if 15 is passed as query" in {
    FizzBuzz.query(15) shouldEqual "FizzBuzz"
  }
}
