package example

object FizzBuzz extends App {
  def query(num: Int): Any = {
    if (num % 3 == 0) {
      return "Fizz"
    } else if (num % 5 == 0) {
      return "Buzz"
    } else if (num % 15 == 0) {
      return "FizzBuzz"
    } else {
      return num
    }
  }
}