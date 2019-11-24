package service.carpark

import entity.car.AbstractCar
import entity.carpark.CarPark

trait CarParkLogic {

  def getCarparkCost(carPark: CarPark): BigDecimal = {
    var totalCost = BigDecimal(0)
    for (car <- carPark.cars) {
      totalCost = totalCost + car.cost
    }
    totalCost
  }

  def sortByFuelConsumption(carPark: CarPark): List[AbstractCar] = {
    carPark.cars.sorted
  }

  def findCarBySpeed(carPark: CarPark, lowerSpeedLimit: Int, higherSpeedLimit: Int): AbstractCar = {
    var foundedCar: AbstractCar = null
    for (car <- carPark.cars) {
      if (car.maximumSpeed >= lowerSpeedLimit && car.maximumSpeed <= higherSpeedLimit)
        foundedCar = car
    }
    foundedCar
  }
}
