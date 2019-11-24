package service.init

import entity.car._
import entity.carpark.CarPark
import service.carpark.impl.CarParkLogicImpl

class InitializationService {

}

object InitializationService {

  private def initCars(): List[AbstractCar] = {
    val cars: List[AbstractCar] = List(
      new ElectricCar("1111", null, 10.3, 120, 3000, 120, 300),
      new ElectricCar("2222", "BMW", 10.4, 200, 5000, 60, 300),
      new GasCar("3333", "Subaru", 10.2, 150, 4500, "Gas01"),
      new PetrolCar("4444", "Kia", 10.3, 90, 1500, "AI-95"),
      new DieselCar("5555", "Renault", 10.1, 150, 2200, "Diesel01"))

    cars
  }

  def initCarPark(): CarPark = {
    val carPark = new CarPark(initCars())
    carPark
  }

  def initCarParkLogicImpl(): CarParkLogicImpl = {
    val carParkLogicImpl = new CarParkLogicImpl()
    carParkLogicImpl
  }
}
