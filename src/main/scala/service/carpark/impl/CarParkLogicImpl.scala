package service.carpark.impl

import entity.car.AbstractCar
import entity.carpark.CarPark
import service.carpark.CarParkLogic

class CarParkLogicImpl extends CarParkLogic {

  override def sortByFuelConsumption(carPark: CarPark): List[AbstractCar] = {
    val sortedCars = super.sortByFuelConsumption(carPark)
    for (i <- sortedCars)
      println(i.toString)
    sortedCars
  }
}
