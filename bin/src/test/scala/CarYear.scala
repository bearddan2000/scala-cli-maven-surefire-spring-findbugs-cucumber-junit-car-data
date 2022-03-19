import io.cucumber.java.en.Then;

import org.junit.jupiter.api.Assertions;

import example.model.Car;
import example.service.CarServiceImpl;

class CarYear {

  @Then("Car year should be 0")
  def checkYear(): Unit = {
  val service = new CarServiceImpl();
    val car = service.createCar();
    Assertions.assertEquals(car.year, 0);
  }
}
