import io.cucumber.java.en.Then;

import org.junit.jupiter.api.Assertions;

import example.model.Car;
import example.service.CarServiceImpl;

class CarMake {

  @Then("Car make should be test")
  def checkMake(): Unit  = {
    val service = new CarServiceImpl();
    val car = service.createCar();
    Assertions.assertEquals(car.make, "test");
  }
}
