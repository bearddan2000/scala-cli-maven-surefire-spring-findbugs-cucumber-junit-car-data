import io.cucumber.java.en.Then;

import org.junit.jupiter.api.Assertions;

import example.model.Car;
import example.service.CarServiceImpl;

class CarModel {

  @Then("Car model should be test")
  def checkModel(): Unit = {
  val service = new CarServiceImpl();
    val car = service.createCar();
    Assertions.assertEquals(car.model, "test");
  }
}
