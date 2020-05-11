object FizzBuzzCalculator extends App {

  val iterationValues = (1 to 100)
  iterationValues.foreach(x => println(calculate(x)))

  def calculate(value: Int):String = {
    value match{
      case fizzbuzz if fizzbuzz % 15 == 0 => "FizzBuzz"
      case fizz if fizz % 3 == 0 => "Fizz"
      case buzz if buzz % 5 == 0 => "Buzz"
      case number => number.toString
    }
  }
}
