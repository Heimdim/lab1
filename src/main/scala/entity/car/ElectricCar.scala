package entity.car

class ElectricCar(number: String, mark: String, fuelConsumption: Double,
                  maximumSpeed: Int, cost: BigDecimal, chargingTime: Long, lifetimeBattery: Long)
  extends AbstractCar(number, mark, fuelConsumption, maximumSpeed, cost) {

}
