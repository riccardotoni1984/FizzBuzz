import org.scalatest.FlatSpec

class FizzBuzzTest extends FlatSpec{
  behavior of "FizzBuzzCalculator.calculate"

 it should "return number if non divisible by 3 or 5" in{
    assert(FizzBuzzCalculator.calculate(1) == "1")
 }

  it should "return Fizz if divisible by 3 and not by 5" in{
    assert(FizzBuzzCalculator.calculate(3) == "Fizz")
    assert((FizzBuzzCalculator.calculate(9)) == "Fizz")
  }

  it should "return Buzz if divisible by 5 and not by 3" in{
    assert(FizzBuzzCalculator.calculate(5) == "Buzz")
    assert(FizzBuzzCalculator.calculate(10) == "Buzz")
  }

  it should "return FizzBuzz if divisible by both 5 and 3" in{
    assert(FizzBuzzCalculator.calculate(15) == "FizzBuzz")
    assert(FizzBuzzCalculator.calculate(30) == "FizzBuzz")
  }

}
