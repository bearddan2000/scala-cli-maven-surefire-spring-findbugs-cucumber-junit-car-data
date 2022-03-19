import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import org.junit.jupiter.api.Assertions;

import example.model.Car;
import example.service.CarServiceImpl;

class CarPrice {

  @When("^Car created$")
  def createCar(): Car = {
  val service = new CarServiceImpl();
     return service.createCar();
  }

  @Then("^Car price should be 0$")
  def checkPrice(): Unit = {
    val car = createCar()
    Assertions.assertEquals(car.price, 0);
  }
}
