package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Helper;

public class SimulaçaoPO extends Helper {

	// Elementos da pagina

	@FindBy(xpath = "//div[@class='container']//a[@id='branding']")
	@CacheLookup
	private WebElement topoPagina;
	
	@FindBy(xpath = "//div//select[@id='make']")
	@CacheLookup
	private WebElement marca;
	
	@FindBy(xpath = "//div//select[@id='model']")
	@CacheLookup
	private WebElement model;
	
	@FindBy(xpath = "//div//input[@id='cylindercapacity']")
	@CacheLookup
	private WebElement cylinderCapacity;
	
	@FindBy(xpath = "//div//input[@id='engineperformance']")
	@CacheLookup
	private WebElement enginePerformace;
	
	@FindBy(xpath = "//div//input[@id='dateofmanufacture']")
	@CacheLookup
	private WebElement dateOfManufacture;
	
	@FindBy(xpath = "//div//select[@id='numberofseats']")
	@CacheLookup
	private WebElement numberOfSeats1;
	
	@FindBy(xpath = "//div//input[@id='righthanddriveyes']")
	@CacheLookup
	private WebElement rightHandDriveSim;
	
	@FindBy(xpath = "//div//input[@id='righthanddriveno']")
	@CacheLookup
	private WebElement rightHandDriveNao;
	
	@FindBy(xpath = "//div//select[@id='numberofseatsmotorcycle']")
	@CacheLookup
	private WebElement numberOfSeats2;
	
	@FindBy(xpath = "//div//select[@id='fuel']")
	@CacheLookup
	private WebElement fuelType;
	
	@FindBy(xpath = "//div//input[@id='payload']")
	@CacheLookup
	private WebElement payload;
	
	@FindBy(xpath = "//div//input[@id='totalweight']")
	@CacheLookup
	private WebElement totalWeight;
	
	@FindBy(xpath = "//div//input[@id='listprice']")
	@CacheLookup
	private WebElement listPrice;
	
	@FindBy(xpath = "//div//input[@id='licenseplatenumber']")
	@CacheLookup
	private WebElement licensePlateNumber;
	
	@FindBy(xpath = "//div//input[@id='annualmileage']")
	@CacheLookup
	private WebElement annualMileage;
	
	@FindBy(xpath = "//div//button[@id='nextenterinsurantdata']")
	@CacheLookup
	private WebElement next1;
	
	@FindBy(xpath = "//div//input[@id='firstname']")
	@CacheLookup
	private WebElement firstName;
	
	@FindBy(xpath = "//div//input[@id='lastname']")
	@CacheLookup
	private WebElement lastName;
	
	@FindBy(xpath = "//div//input[@id='birthdate']")
	@CacheLookup
	private WebElement dateOfBirth;
	
	@FindBy(xpath = "//div//input[@id='gendermale']")
	@CacheLookup
	private WebElement genderMale;
	
	@FindBy(xpath = "//div//input[@id='genderfemale']")
	@CacheLookup
	private WebElement genderFemale;
	
	@FindBy(xpath = "//div//input[@id='streetaddress']")
	@CacheLookup
	private WebElement streetAddress;
	
	@FindBy(xpath = "//div//select[@id='country']")
	@CacheLookup
	private WebElement pais;
	
	@FindBy(xpath = "//div//input[@id='zipcode']")
	@CacheLookup
	private WebElement zipCode;
	
	@FindBy(xpath = "//div//input[@id='city']")
	@CacheLookup
	private WebElement city;
	
	@FindBy(xpath = "//div//select[@id='occupation']")
	@CacheLookup
	private WebElement ocupacao;
	
	@FindBy(xpath = "//div//input[@id='speeding']")
	@CacheLookup
	private WebElement hobbiesSpeeding;
	
	@FindBy(xpath = "//div//input[@id='bungeejumping']")
	@CacheLookup
	private WebElement hobbiesBungeeJumping;
	
	@FindBy(xpath = "//div//input[@id='cliffdiving']")
	@CacheLookup
	private WebElement hobbiesCliffDiving;
	
	@FindBy(xpath = "//div//input[@id='skydiving']")
	@CacheLookup
	private WebElement hobbiesSkydiving;
	
	@FindBy(xpath = "//div//input[@id='other']")
	@CacheLookup
	private WebElement hobbiesOther;
	
	@FindBy(xpath = "//div//input[@id='website']")
	@CacheLookup
	private WebElement website;
	
	@FindBy(xpath = "//div//input[@id='picture']")
	@CacheLookup
	private WebElement foto;
	
	@FindBy(xpath = "//div//button[@id='nextenterproductdata']")
	@CacheLookup
	private WebElement next2;
	
	@FindBy(xpath = "//div//input[@id='startdate']")
	@CacheLookup
	private WebElement startDate;
	
	@FindBy(xpath = "//div//select[@id='insurancesum']")
	@CacheLookup
	private WebElement insuranceSum;
	
	@FindBy(xpath = "//div//select[@id='meritrating']")
	@CacheLookup
	private WebElement meritRating;
	
	@FindBy(xpath = "//div//select[@id='damageinsurance']")
	@CacheLookup
	private WebElement damageInsurance;
	
	@FindBy(xpath = "//div//input[@id='EuroProtection']")
	@CacheLookup
	private WebElement optionalProductsEuro;
	
	@FindBy(xpath = "//div//input[@id='LegalDefenseInsurance']")
	@CacheLookup
	private WebElement optionalProductsLegal;
	
	@FindBy(xpath = "//div//select[@id='courtesycar']")
	@CacheLookup
	private WebElement courtesyCar;
	
	@FindBy(xpath = "//div//button[@id='nextselectpriceoption']")
	@CacheLookup
	private WebElement next3;
	
	@FindBy(xpath = "//div//input[@id='selectsilver']")
	@CacheLookup
	private WebElement tipoDeContratoSilver;
	
	@FindBy(xpath = "//div//input[@id='selectgold']")
	@CacheLookup
	private WebElement tipoDeContratoGold;
	
	@FindBy(xpath = "//div//input[@id='selectplatinum']")
	@CacheLookup
	private WebElement tipoDeContratoPlatinum;
	
	@FindBy(xpath = "//div//input[@id='selectultimate']")
	@CacheLookup
	private WebElement tipoDeContratoUltimate;
	
	@FindBy(xpath = "//div//button[@id='nextsendquote']")
	@CacheLookup
	private WebElement next4;
	
	@FindBy(xpath = "//div//input[@id='email']")
	@CacheLookup
	private WebElement email;
	
	@FindBy(xpath = "//div//input[@id='phone']")
	@CacheLookup
	private WebElement phone;
	
	@FindBy(xpath = "//div//input[@id='username']")
	@CacheLookup
	private WebElement username;
	
	@FindBy(xpath = "//div//input[@id='password']")
	@CacheLookup
	private WebElement password;
	
	@FindBy(xpath = "//div//input[@id='confirmpassword']")
	@CacheLookup
	private WebElement comfirmPassword;
	
	@FindBy(xpath = "//div//input[@id='Comments']")
	@CacheLookup
	private WebElement comments;
	
	@FindBy(xpath = "//div//button[@id='sendemail']")
	@CacheLookup
	private WebElement send;
	
	@FindBy(xpath = "//div[@class='sweet-alert showSweetAlert visible']")
	@CacheLookup
	private WebElement mensagemSucesso;
	
	
	@FindBy(xpath = "//div[@class=\"idealsteps-wrap\"]")
	@CacheLookup
	private WebElement boxFormulario;
	
	
	private WebDriver driver;

	public SimulaçaoPO() {
		//Inicializar elementos através do driver
		driver = getDriver();
		PageFactory.initElements(driver, this);
	}

	//Checagem dos elementos
	public boolean checkLogoPagina() {
		waitForElement(topoPagina);
		return topoPagina.isDisplayed();
	}
	
	public boolean checkTituloPagina(String titulo) {
		waitForElement(topoPagina);
		return driver.getTitle().equals(titulo);
	}
	
	public boolean checkInputByName(String name) {
		WebElement elemento = driver.findElement(By.xpath("//input[@name=\"" + name + "\"]"));
		waitForElement(elemento);
		return elemento.isDisplayed();
	}
	
	public boolean checkSelectByName(String name) {
		WebElement elemento = driver.findElement(By.xpath("//select[@name=\"" + name + "\"]"));
		waitForElement(elemento);
		return elemento.isDisplayed();
	}
	
	public boolean checkButtonByName(String name) {
		WebElement elemento = driver.findElement(By.xpath("//button[@name=\"" + name + "\"]"));
		waitForElement(elemento);
		return elemento.isDisplayed();
	}
	
	public boolean checkMensagemSucesso() {
		waitForElement(mensagemSucesso);
		return mensagemSucesso.isDisplayed();
	}
	
	//Ações com os elementos
	public void clickfoto() {
		waitForElement(foto);
		scrollToElement(foto);
		foto.click();
	}
	
	public void sendKeysFoto() {
		waitForElement(foto);
		scrollToElement(foto);
		foto.clear();
		try{
			foto.sendKeys("accenture.png");
		}catch (Exception e){
		}
	}
	
	public void clickMake() {
		waitForElement(marca);
		scrollToElement(marca);
		marca.click();
	}
	
	public void sendKeysMake(String marcaTxt) {
		waitForElement(marca);
		scrollToElement(marca);
		marca.sendKeys(marcaTxt);
	}
	
	public void clickModel() {
		waitForElement(model);
		scrollToElement(model);
		model.click();
	}
	
	public void sendKeysModel(String modelo) {
		waitForElement(model);
		scrollToElement(model);
		model.sendKeys(modelo);
	}
	
	public void clickCylinder() {
		waitForElement(cylinderCapacity);
		scrollToElement(cylinderCapacity);
		cylinderCapacity.click();
	}
	
	public void sendKeysCylinder(String capacidade) {
		waitForElement(cylinderCapacity);
		scrollToElement(cylinderCapacity);
		cylinderCapacity.clear();
		cylinderCapacity.sendKeys(capacidade);
	}
	
	public void clickEngine() {
		waitForElement(enginePerformace);
		scrollToElement(enginePerformace);
		enginePerformace.click();
	}
	
	public void sendKeysEngine(String performace) {
		waitForElement(enginePerformace);
		scrollToElement(enginePerformace);
		enginePerformace.clear();
		enginePerformace.sendKeys(performace);
	}
	
	public void clickManufacture() {
		waitForElement(dateOfManufacture);
		scrollToElement(dateOfManufacture);
		dateOfManufacture.click();
	}
	
	public void sendKeysManufacture(String dataManufatura) {
		waitForElement(dateOfManufacture);
		scrollToElement(dateOfManufacture);
		dateOfManufacture.clear();
		dateOfManufacture.sendKeys(dataManufatura);
	}
	
	public void clickNumberSeats() {
		waitForElement(numberOfSeats1);
		scrollToElement(numberOfSeats1);
		numberOfSeats1.click();
	}
	
	public void sendKeysNumberSeats(String acentos) {
		waitForElement(numberOfSeats1);
		scrollToElement(numberOfSeats1);
		numberOfSeats1.sendKeys(acentos);
	}
	
	public void clickNumberOfSeats() {
		waitForElement(numberOfSeats2);
		scrollToElement(numberOfSeats2);
		numberOfSeats2.click();
	}
	
	public void sendKeysNumberOfSeats(String acentos2) {
		waitForElement(numberOfSeats2);
		scrollToElement(numberOfSeats2);
		numberOfSeats2.sendKeys(acentos2);
	}
	
	public void clickRightYes() {
		waitForElement(rightHandDriveSim);
		scrollToElement(rightHandDriveSim);
		try{
			executorJS_Click(rightHandDriveSim);
		}catch (Exception e){
		}
	}
	
	public void clickRightNo() {
		waitForElement(rightHandDriveNao);
		scrollToElement(rightHandDriveNao);
		try{
			executorJS_Click(rightHandDriveNao);
		}catch (Exception e){
		}
	}
	
	public void clickFuelType() {
		waitForElement(fuelType);
		scrollToElement(fuelType);
		fuelType.click();
	}
	
	public void sendKeysFuelType(String tipoCombustivel) {
		waitForElement(fuelType);
		scrollToElement(fuelType);
		fuelType.sendKeys(tipoCombustivel);
	}
	
	public void clickPayload() {
		waitForElement(payload);
		scrollToElement(payload);
		payload.click();
	}
	
	public void sendKeysPayload(String payloadstring) {
		waitForElement(payload);
		scrollToElement(payload);
		payload.clear();
		payload.sendKeys(payloadstring);
	}
	
	public void clickTotalWeight() {
		waitForElement(totalWeight);
		scrollToElement(totalWeight);
		totalWeight.click();
	}
	
	public void sendKeysTotalWeight(String weight) {
		waitForElement(totalWeight);
		scrollToElement(totalWeight);
		totalWeight.clear();
		totalWeight.sendKeys(weight);
	}
	
	public void clickListPrice() {
		waitForElement(listPrice);
		scrollToElement(listPrice);
		listPrice.click();
	}
	
	public void sendKeysListPrice(String weight) {
		waitForElement(listPrice);
		scrollToElement(listPrice);
		listPrice.clear();
		listPrice.sendKeys(weight);
	}
	
	public void clickLicensePlateNumber() {
		waitForElement(licensePlateNumber);
		scrollToElement(licensePlateNumber);
		licensePlateNumber.click();
	}
	
	public void sendKeysLicensePlateNumber(String license) {
		waitForElement(licensePlateNumber);
		scrollToElement(licensePlateNumber);
		licensePlateNumber.clear();
		licensePlateNumber.sendKeys(license);
	}
	
	public void clickAnnualMileage() {
		waitForElement(annualMileage);
		scrollToElement(annualMileage);
		annualMileage.click();
	}
	
	public void sendKeysAnnualMileage(String mileage) {
		waitForElement(annualMileage);
		scrollToElement(annualMileage);
		annualMileage.clear();
		annualMileage.sendKeys(mileage);
	}
	
	public void clicknext1() {
		waitForElement(next1);
		scrollToElement(next1);
		next1.click();
	}
	
	public void clickFirstName() {
		waitForElement(firstName);
		scrollToElement(firstName);
		firstName.click();
	}
	
	public void sendKeysFirstName(String nome) {
		waitForElement(firstName);
		scrollToElement(firstName);
		firstName.clear();
		firstName.sendKeys(nome);
	}
	
	public void clickLastName() {
		waitForElement(lastName);
		scrollToElement(lastName);
		lastName.click();
	}
	
	public void sendKeysLastName(String sobrenome) {
		waitForElement(lastName);
		scrollToElement(lastName);
		lastName.clear();
		lastName.sendKeys(sobrenome);
	}
	
	public void clickDateOfBirth() {
		waitForElement(dateOfBirth);
		scrollToElement(dateOfBirth);
		dateOfBirth.click();
	}
	
	public void sendKeysDateOfBirth(String aniversario) {
		waitForElement(dateOfBirth);
		scrollToElement(dateOfBirth);
		dateOfBirth.clear();
		dateOfBirth.sendKeys(aniversario);
	}
	
	public void clickGender(String genero) {
		waitForElement(genderFemale);
		waitForElement(genderMale);
		scrollToElement(genderFemale);
		switch (genero) {
		case "Female":
			try{
				executorJS_Click(genderFemale);
			}catch (Exception e){
			}
			break;
		case "Male":
			try{
				executorJS_Click(genderMale);
			}catch (Exception e){
			}
			break;
		}
	}
	
	public void clickStreetAddress() {
		waitForElement(streetAddress);
		scrollToElement(streetAddress);
		streetAddress.click();
	}
	
	public void sendKeysStreetAddress(String endereco) {
		waitForElement(streetAddress);
		scrollToElement(streetAddress);
		streetAddress.clear();
		streetAddress.sendKeys(endereco);
	}
	
	public void clickCountry() {
		waitForElement(pais);
		scrollToElement(pais);
		pais.click();
	}
	
	public void sendKeysCountry(String country) {
		waitForElement(pais);
		scrollToElement(pais);
		pais.sendKeys(country);
	}
	
	public void clickZipCode() {
		waitForElement(zipCode);
		scrollToElement(zipCode);
		zipCode.click();
	}
	
	public void sendKeysZipCode(String codigoPostal) {
		waitForElement(zipCode);
		scrollToElement(zipCode);
		zipCode.clear();
		zipCode.sendKeys(codigoPostal);
	}
	
	public void clickCity() {
		waitForElement(city);
		scrollToElement(city);
		city.click();
	}
	
	public void sendKeysCity(String cidade) {
		waitForElement(city);
		scrollToElement(city);
		city.clear();
		city.sendKeys(cidade);
	}
	
	public void clickOccupation() {
		waitForElement(ocupacao);
		scrollToElement(ocupacao);
		ocupacao.click();
	}
	
	public void sendKeysOccupation(String occupation) {
		waitForElement(ocupacao);
		scrollToElement(ocupacao);
		ocupacao.sendKeys(occupation);
	}
	
	public void clickHobbies(String hobbie) {
		waitForElement(hobbiesBungeeJumping);
		waitForElement(hobbiesCliffDiving);
		waitForElement(hobbiesOther);
		waitForElement(hobbiesSkydiving);
		waitForElement(hobbiesSpeeding);
		scrollToElement(hobbiesBungeeJumping);
		switch (hobbie) {
		case "Todos":
			try{
				executorJS_Click(hobbiesBungeeJumping);
				executorJS_Click(hobbiesCliffDiving);
				executorJS_Click(hobbiesOther);
				executorJS_Click(hobbiesSkydiving);
				executorJS_Click(hobbiesSpeeding);
			}catch (Exception e){
			}
			break;
		case "Bungee Jumping":
			try{
				executorJS_Click(hobbiesBungeeJumping);
			}catch (Exception e){
			}
			break;
		case "Cliff Diving":
			try{
				executorJS_Click(hobbiesCliffDiving);
			}catch (Exception e){
			}
			break;
		case "Other":
			try{
				executorJS_Click(hobbiesOther);
			}catch (Exception e){
			}
			break;
		case "Skydiving":
			try{
				executorJS_Click(hobbiesSkydiving);
			}catch (Exception e){
			}
			break;
		case "Speeding":
			try{
				executorJS_Click(hobbiesSpeeding);
			}catch (Exception e){
			}
			break;
		}
	}
		
	public void clickWebsite() {
		waitForElement(website);
		scrollToElement(website);
		website.click();
	}
	
	public void sendKeysWebsite(String site) {
		waitForElement(website);
		scrollToElement(website);
		website.clear();
		website.sendKeys(site);
	}
	
	public void clicknext2() {
		waitForElement(next2);
		scrollToElement(next2);
		next2.click();
	}
	
	public void clickStartDate() {
		waitForElement(startDate);
		scrollToElement(startDate);
		startDate.click();
	}
	
	public void sendKeysStartDate(String dataInicio) {
		waitForElement(startDate);
		scrollToElement(startDate);
		startDate.clear();
		startDate.sendKeys(dataInicio);
	}
	
	public void clickInsuranceSum(String somaSeguro) {
		waitForElement(insuranceSum);
		scrollToElement(insuranceSum);
		String seguro = "";
		insuranceSum.click();
		switch (somaSeguro) {
		case "1":
			seguro = "3.000.000,00";
			break;
		case "2":
			seguro = "5.000.000,00";
			break;
		case "3":
			seguro = "7.000.000,00";
			break;
		case "4":
			seguro = "10.000.000,00";
			break;
		case "5":
			seguro = "15.000.000,00";
			break;
		case "6":
			seguro = "20.000.000,00";
			break;
		case "7":
			seguro = "25.000.000,00";
			break;
		case "8":
			seguro = "30.000.000,00";
			break;
		case "9":
			seguro = "35.000.000,00";
			break;
		}
		insuranceSum.sendKeys(seguro);
	}
	
	public void clickMeritRating(String merito) {
		waitForElement(meritRating);
		scrollToElement(meritRating);
		String rating = "";
		meritRating.click();
		switch (merito) {
		case "1":
			rating = "Super Bonus";
			break;
		case "2":
			rating = "Bonus 1";
			break;
		case "3":
			rating = "Bonus 2";
			break;
		case "4":
			rating = "Bonus 3";
			break;
		case "5":
			rating = "Bonus 4";
			break;
		case "6":
			rating = "Bonus 5";
			break;
		case "7":
			rating = "Bonus 6";
			break;
		case "8":
			rating = "Bonus 7";
			break;
		case "9":
			rating = "Bonus 8";
			break;
		case "10":
			rating = "Bonus 9";
			break;
		case "11":
			rating = "Malus 10";
			break;
		case "12":
			rating = "Malus 11";
			break;
		case "13":
			rating = "Malus 12";
			break;
		case "14":
			rating = "Malus 13";
			break;
		case "15":
			rating = "Malus 14";
			break;
		case "16":
			rating = "Malus 15";
			break;
		case "17":
			rating = "Malus 16";
			break;
		case "18":
			rating = "Malus 17";
			break;
		}
		meritRating.sendKeys(rating);
	}
	
	public void clickDamageInsurance() {
		waitForElement(damageInsurance);
		scrollToElement(damageInsurance);
		damageInsurance.click();
	}
	
	public void sendKeysDamageInsurance(String seguroDanos) {
		waitForElement(damageInsurance);
		scrollToElement(damageInsurance);
		damageInsurance.sendKeys(seguroDanos);
	}
	
	public void clickOptionalProducts(String opcionais) {
		waitForElement(optionalProductsEuro);
		waitForElement(optionalProductsLegal);
		scrollToElement(optionalProductsEuro);
		switch (opcionais) {
		case "Todos":
			try{
				executorJS_Click(optionalProductsEuro);
				executorJS_Click(optionalProductsLegal);
			}catch (Exception e){
			}
			break;
		case "Products Euro":
			try{
				executorJS_Click(optionalProductsEuro);
			}catch (Exception e){
			}
			break;
		case "Products Legal":
			try{
				executorJS_Click(optionalProductsLegal);
			}catch (Exception e){
			}
			break;
		}
	}
	
	public void clickCourtesyCar() {
		waitForElement(courtesyCar);
		scrollToElement(courtesyCar);
		courtesyCar.click();
	}
	
	public void sendKeysCourtesyCar(String cortesia) {
		waitForElement(courtesyCar);
		scrollToElement(courtesyCar);
		courtesyCar.sendKeys(cortesia);
	}
	
	public void clicknext3() {
		waitForElement(next3);
		scrollToElement(next3);
		next3.click();
	}
	
	public void clickTipoDeContrato(String contrato) {
		waitForElement(tipoDeContratoSilver);
		waitForElement(tipoDeContratoGold);
		waitForElement(tipoDeContratoPlatinum);
		waitForElement(tipoDeContratoUltimate);
		scrollToElement(tipoDeContratoSilver);
		switch (contrato) {
		case "Silver":
			try{
				executorJS_Click(tipoDeContratoSilver);
			}catch (Exception e){
			}
			break;
		case "Gold":
			try{
				executorJS_Click(tipoDeContratoGold);
			}catch (Exception e){
			}
			break;
		case "Platinum":
			try{
				executorJS_Click(tipoDeContratoPlatinum);
			}catch (Exception e){
			}
			break;
		case "Ultimate":
			try{
				executorJS_Click(tipoDeContratoUltimate);
			}catch (Exception e){
			}
			break;
		}
	}
	
	public void clicknext4() {
		waitForElement(next4);
		scrollToElement(next4);
		next4.click();
	}
	
	public void clickEmail() {
		waitForElement(email);
		scrollToElement(email);
		email.click();
	}
	
	public void sendEmail(String emailTest) {
		waitForElement(email);
		scrollToElement(email);
		email.clear();
		email.sendKeys(emailTest);
	}
	
	public void clickPhone() {
		waitForElement(phone);
		scrollToElement(phone);
		phone.click();
	}
	
	public void sendKeysPhone(String telefone) {
		waitForElement(phone);
		scrollToElement(phone);
		phone.clear();
		phone.sendKeys(telefone);
	}
	
	public void clickUsername() {
		waitForElement(username);
		scrollToElement(username);
		username.click();
	}
	
	public void sendKeysUsername(String usernameTest) {
		waitForElement(username);
		scrollToElement(username);
		username.clear();
		username.sendKeys(usernameTest);
	}
	
	public void clickPassword() {
		waitForElement(password);
		scrollToElement(password);
		password.click();
	}
	
	public void sendKeysPassword(String senha) {
		waitForElement(password);
		scrollToElement(password);
		password.clear();
		password.sendKeys(senha);
	}
	
	public void clickComfirmPassword() {
		waitForElement(comfirmPassword);
		scrollToElement(comfirmPassword);
		comfirmPassword.click();
	}
	
	public void sendKeysComfirmPassword(String senhaConfirmacao) {
		waitForElement(comfirmPassword);
		scrollToElement(comfirmPassword);
		comfirmPassword.clear();
		comfirmPassword.sendKeys(senhaConfirmacao);
	}
	
	public void clicksend() {
		waitForElement(send);
		scrollToElement(send);
		send.click();
	}

	public boolean checkBoxFormulario() {
		waitForElement(boxFormulario);
		scrollToElement(boxFormulario);
		return boxFormulario.isDisplayed();
	}
}
