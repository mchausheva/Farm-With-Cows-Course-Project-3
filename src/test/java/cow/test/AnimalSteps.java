package cow.test;

import static org.junit.Assert.assertEquals;

import cow.model.Animal;
import cow.model.CowScreenModel;
import cow.model.Farm;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AnimalSteps {

	private CowScreenModel cowScreenModel;

	@Given("^Потребителят отваря екран за управление на крави$")
	public void потребителят_отваря_екран_за_управление_на_крави() throws Throwable {
		cowScreenModel = new CowScreenModel();
	}

	@When("^Въвежда майка$")
	public void въвежда_майка() throws Throwable {
		cowScreenModel.setMother(new Animal());
	}

	@When("^Въвежда баща$")
	public void въвежда_баща() throws Throwable {
		cowScreenModel.setFather(new Animal());
	}

	@When("^Въвежда възраст$")
	public void въвежда_възраст() throws Throwable {
		cowScreenModel.setAge(1);
	}

	@When("^Въвежда пол$")
	public void въвежда_пол() throws Throwable {
		cowScreenModel.setGender("m");
	}

	@When("^Въвежда ферма$")
	public void въвежда_ферма() throws Throwable {
		cowScreenModel.setFarm(new Farm());
	}

	@When("^натиска бутон за създаване на животно$")
	public void натиска_бутон_за_създаване_на_животно() throws Throwable {
		cowScreenModel.clickCreateCowButton();
	}

	@Then("^Получава съобщение \"([^\"]*)\"$")
	public void получава_съобщение(String arg1) throws Throwable {
		assertEquals(arg1, cowScreenModel.getMessage());
	}
	
	///
	@When("^Въвежда пол на първи родител$")
	public void въвежда_първи_родител() throws Throwable {
		cowScreenModel.setMother(new Animal(3, "female", 15));
	}

	@When("^Въвежда пол на втори родител$")
	public void въвежда_втори_родител() throws Throwable {
		cowScreenModel.setFather(new Animal(3, "female", 20));
	}

	@When("^Натиска бутон за чифтосване$")
	public void натиска_бутон_за_чифтосване() throws Throwable {
		cowScreenModel.clickMateCowsButton();
	}
	
	@When("^Въвежда възраст на първи родител$")
	public void въвежда_възраст_на_първи_родител() throws Throwable {
		cowScreenModel.setMother(new Animal(1, "female", 13));
	}

	@When("^Въвежда възраст на втори родител$")
	public void въвежда_възраст_на_втори_родител() throws Throwable {
		cowScreenModel.setFather(new Animal(2, "male", 17));
	}
	
	@When("^Въвежда майка и месеци от последно раждане на майката$")
	public void въвежда_майка_и_месеци_от_последно_раждане_на_майката() throws Throwable {
		cowScreenModel.setMother(new Animal(3, "female", 8));
	}

	@When("^Въвежда бащата$")
	public void въвежда_бащата() throws Throwable {
		cowScreenModel.setFather(new Animal(3, "male", 0));
	}
	
	@When("^Въвежда майка, която е поне двегодишна и не е раждала в последните десет месеца$")
	public void въвежда_майка_която_е_поне_двегодишна_и_не_е_раждала_в_последните_десет_месеца() throws Throwable {
		cowScreenModel.setMother(new Animal(3, "female", 12));
	}

	@When("^Въвежда баща, който е поне двегодишен$")
	public void въвежда_баща_който_е_поне_двегодишен() throws Throwable {
		cowScreenModel.setFather(new Animal(3, "male", 0));
	}
}
