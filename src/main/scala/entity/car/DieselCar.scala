package entity.car

class DieselCar(number: String, mark: String, fuelConsumption: Double,
                maximumSpeed: Int, cost: BigDecimal, var dieselMark: String)
  extends AbstractCar(number, mark, fuelConsumption, maximumSpeed, cost) {

}
