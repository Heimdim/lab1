package entity.car

class GasCar(number: String, mark: String, fuelConsumption: Double,
             maximumSpeed: Int, cost: BigDecimal, var gasMark: String)
  extends AbstractCar(number, mark, fuelConsumption, maximumSpeed, cost) {

}
