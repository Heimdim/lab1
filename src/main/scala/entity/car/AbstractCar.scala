package entity.car

abstract class AbstractCar(number: String, var model: String, var fuelConsumption: Double,
                           var maximumSpeed: Int, var cost: BigDecimal) extends Ordered[AbstractCar] {
  override def compare(that: AbstractCar): Int = {
    this.fuelConsumption.compareTo(that.fuelConsumption)
  }

  override def toString: String = {
    model + " with number " + number + " and " +
      fuelConsumption + " consumption of fuel"
  }
}
