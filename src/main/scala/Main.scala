import service.init.InitializationService

object Main {
  def main(args: Array[String]): Unit = {

    val carPark = InitializationService.initCarPark()
    val carParkLogicImpl = InitializationService.initCarParkLogicImpl()

    println("The cost of carPark is " + carParkLogicImpl.getCarparkCost(carPark).toString())
    try {
      println("\n\nEnter low speed border for finding car:")
      val lowBorder: Int = scala.io.StdIn.readInt()
      println("\n\nEnter high speed border for finding car:")
      val highBorder: Int = scala.io.StdIn.readInt()
      val foundedCar = carParkLogicImpl.findCarBySpeed(carPark, lowBorder, highBorder)
      if (foundedCar != null)
        println("The suitable car is " + foundedCar)
      else
        println("There is no suitable car!")
    } catch {
      case _: NumberFormatException =>
        System.out.println("This is not a number")
    }
    println("\n\nThe carPark, sorted by Fuel Consumption (as a percentage of the whole charge for ElectricCars):")
    carParkLogicImpl.sortByFuelConsumption(carPark)
  }
}