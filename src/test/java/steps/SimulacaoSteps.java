package steps;

import org.junit.Assert;

import PageObject.SimulaçaoPO;
import Utils.BaseTest;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Entao;


public class SimulacaoSteps extends BaseTest{

	// Page Objects
	SimulaçaoPO simulacao = new SimulaçaoPO();

	@Dado("que eu acesse o site")
	public void que_eu_acesse_o_site() {
		irPara("http://sampleapp.tricentis.com/101/app.php");
	}
	
	@Dado("que eu esteja na pagina {string}")
	public void que_eu_esteja_na_pagina(String titulo) {
		Assert.assertTrue("Falha ao tentar acessar a página: " + titulo, simulacao.checkTituloPagina(titulo));
	}

	@Quando("for exibido o formulario")
	public void for_exibido_o_formulario() {
	    Assert.assertTrue("Falha ao tentar visualizar o box de formulario na página.", simulacao.checkBoxFormulario());
	}

	@Quando("preencher make {string}")
	public void preencher_make(String marcaTxt) {
		simulacao.checkSelectByName("Make");
		simulacao.clickMake();
		simulacao.sendKeysMake(marcaTxt);
	}

	@Quando("preencher model {string}")
	public void preencher_model(String modelo) {
	    simulacao.checkSelectByName("Model");
	    simulacao.clickModel();
	    simulacao.sendKeysModel(modelo);
	}

	@Quando("preencher Cylinder Capacity {string}")
	public void preencher_cylinder_capacity(String capacidade) {
		simulacao.checkInputByName("Cylinder Capacity");
		simulacao.clickCylinder();
	    simulacao.sendKeysCylinder(capacidade);
	}

	@Quando("preencher Engine Performance {string}")
	public void preencher_engine_performance(String performace) {
		simulacao.checkInputByName("[kW]");
		simulacao.clickEngine();
	    simulacao.sendKeysEngine(performace);
	}

	@Quando("preencher Date Of Manufacture {string}")
	public void preencher_date_of_manufacture(String dataManufatura) {
		simulacao.checkInputByName("Date of Manufacture");
		simulacao.clickManufacture();
	    simulacao.sendKeysManufacture(dataManufatura);
	}

	@Quando("prencher Number of Steats {string}")
	public void prencher_number_of_steats(String acentos) {
		simulacao.checkSelectByName("Number of Seats");
		simulacao.clickNumberSeats();
	    simulacao.sendKeysNumberSeats(acentos);
	}

	@Quando("preencher Right Hand Drive {string}")
	public void preencher_right_hand_drive(String destro) {
		simulacao.checkInputByName("Right Hand Drive");
		switch (destro) {
		case "Yes":
			simulacao.clickRightYes();
			break;
		case "No":
			simulacao.clickRightNo();
			break;	
		}
	}

//	@Quando("preencher segundo Number of Seats  {string}")
//	public void preencher_segundo_number_of_seats(String acentos2) {
//		simulacao.checkSelectByName("Number of Seats Motorcycle");
//		simulacao.clickNumberOfSeats();
//	    simulacao.sendKeysNumberOfSeats(acentos2);
//	}
	
	@Quando("preencher segundo Number of Seats {string}")
	public void preencher_segundo_number_of_seats(String acentos2) {
		simulacao.checkSelectByName("Number of Seats Motorcycle");
		simulacao.clickNumberOfSeats();
	    simulacao.sendKeysNumberOfSeats(acentos2);
	}

	@Quando("preencher o Fuel Type {string}")
	public void preencher_o_fuel_type(String tipoCombustivel) {
		simulacao.checkSelectByName("Fuel Type");
		simulacao.clickFuelType();
		simulacao.sendKeysFuelType(tipoCombustivel);
	}

	@Quando("preencher o Payload {string}")
	public void preencher_o_payload(String payloadstring) {
		simulacao.checkInputByName("Payload");
		simulacao.clickPayload();
		simulacao.sendKeysPayload(payloadstring);
	}

	@Quando("preencher o Total Weight {string}")
	public void preencher_o_total_weight(String weight) {
		simulacao.checkInputByName("Total Weight");
		simulacao.clickTotalWeight();
		simulacao.sendKeysTotalWeight(weight);
	}

	@Quando("preencher List Price {string}")
	public void preencher_list_price(String price) {
		simulacao.checkInputByName("List Price");
		simulacao.clickListPrice();
		simulacao.sendKeysListPrice(price);
	}

	@Quando("preencher License Plate Number {string}")
	public void preencher_license_plate_number(String license) {
		simulacao.checkInputByName("License Plate Number");
		simulacao.clickLicensePlateNumber();
		simulacao.sendKeysLicensePlateNumber(license);
	}

	@Quando("preencher Annual Mileage {string}")
	public void preencher_annual_mileage(String mileage) {
		simulacao.checkInputByName("Annual Mileage");
		simulacao.clickAnnualMileage();
		simulacao.sendKeysAnnualMileage(mileage);
	}
	
	@Quando("clicar no botao next da pagina {string}")
	public void clicar_no_botao_next_da_pagina(String tituloPagina) {
		switch (tituloPagina) {
		case "Enter Vehicle Data":
			simulacao.clicknext1();
			break;
		case "Enter Insurant Data":
			simulacao.clicknext2();
			break;
		case "Enter Product Data":
			simulacao.clicknext3();
			break;
		case "Select Price Option":
			simulacao.clicknext4();
			break;
		}
	}

	@Entao("deverá ser exibido o proximo formulario {string}")
	public void deverá_ser_exibido_o_proximo_formulario(String nomeFormulário) {
		Assert.assertTrue("Falha ao tentar acessar a página: " + nomeFormulário, simulacao.checkTituloPagina(nomeFormulário));
	}
	

	@Então("sera validado o acesso")
	public void sera_validado_o_acesso() {
		Assert.assertTrue("Falha ao tentar visualizar o título da página.", simulacao.checkLogoPagina());
	}
	
	@Dado("que eu tenha completado o formulário anterior")
	public void que_eu_tenha_completado_o_formulário_anterior() {
		simulacao.checkSelectByName("Make");
		simulacao.clickMake();
		simulacao.sendKeysMake("BMW");
		simulacao.checkSelectByName("Model");
	    simulacao.clickModel();
	    simulacao.sendKeysModel("Scooter");
	    simulacao.checkInputByName("Cylinder Capacity");
		simulacao.clickCylinder();
	    simulacao.sendKeysCylinder("2000");
		simulacao.checkInputByName("[kW]");
		simulacao.clickEngine();
	    simulacao.sendKeysEngine("1000");
		simulacao.checkInputByName("Date of Manufacture");
		simulacao.clickManufacture();
	    simulacao.sendKeysManufacture("10/01/2021");
		simulacao.checkSelectByName("Number of Seats");
		simulacao.clickNumberSeats();
	    simulacao.sendKeysNumberSeats("9");
		simulacao.checkInputByName("Right Hand Drive");
		simulacao.clickRightYes();
		simulacao.checkSelectByName("Number of Seats Motorcycle");
		simulacao.clickNumberOfSeats();
	    simulacao.sendKeysNumberOfSeats("3");
		simulacao.checkSelectByName("Fuel Type");
		simulacao.clickFuelType();
		simulacao.sendKeysFuelType("Electric Power");
		simulacao.checkInputByName("Payload");
		simulacao.clickPayload();
		simulacao.sendKeysPayload("500");
		simulacao.checkInputByName("Total Weight");
		simulacao.clickTotalWeight();
		simulacao.sendKeysTotalWeight("50000");
		simulacao.checkInputByName("List Price");
		simulacao.clickListPrice();
		simulacao.sendKeysListPrice("100000");
		simulacao.checkInputByName("License Plate Number");
		simulacao.clickLicensePlateNumber();
		simulacao.sendKeysLicensePlateNumber("123456789");
		simulacao.checkInputByName("Annual Mileage");
		simulacao.clickAnnualMileage();
		simulacao.sendKeysAnnualMileage("50000");
	}

	@Quando("preencher First Name {string}")
	public void preencher_first_name(String nome) {
		simulacao.checkInputByName("First Name");
		simulacao.clickFirstName();
		simulacao.sendKeysFirstName(nome);
	}

	@Quando("preencher Last Name {string}")
	public void preencher_last_name(String sobrenome) {
		simulacao.checkInputByName("Last Name");
		simulacao.clickLastName();
		simulacao.sendKeysLastName(sobrenome);
	}

	@Quando("preencher Date Of Birth {string}")
	public void preencher_date_of_birth(String aniversario) {
		simulacao.checkInputByName("Date of Birth");
		simulacao.clickDateOfBirth();
		simulacao.sendKeysDateOfBirth(aniversario);
	}

	@Quando("preencher Gender {string}")
	public void preencher_gender(String genero) {
		simulacao.clickGender(genero);
	}

	@Quando("preencher Street Address {string}")
	public void preencher_street_address(String endereco) {
		simulacao.checkInputByName("Street Address");
		simulacao.clickStreetAddress();
		simulacao.sendKeysStreetAddress(endereco);
	}

	@Quando("prencher Country {string}")
	public void prencher_country(String country) {
		simulacao.checkSelectByName("Country");
		simulacao.clickCountry();
		simulacao.sendKeysCountry(country);
	}

	@Quando("preencher Zip Code {string}")
	public void preencher_zip_code(String codigoPostal) {
		simulacao.checkInputByName("Zip Code");
		simulacao.clickZipCode();
		simulacao.sendKeysZipCode(codigoPostal);
	}

	@Quando("preencher City  {string}")
	public void preencher_city(String cidade) {
		simulacao.checkInputByName("City");
		simulacao.clickCity();
		simulacao.sendKeysCity(cidade);
	}

	@Quando("preencher Occupation {string}")
	public void preencher_occupation(String occupation) {
		simulacao.checkSelectByName("Occupation");
		simulacao.clickOccupation();
		simulacao.sendKeysOccupation(occupation);
	}

	@Quando("preencher os Hobbies {string}")
	public void preencher_os_hobbies(String hobbie) {
		simulacao.checkInputByName("Hobbies");
		simulacao.clickHobbies(hobbie);
	}

	@Quando("preencher Website {string}")
	public void preencher_website(String site) {
		simulacao.checkInputByName("Website");
		simulacao.clickWebsite();
		simulacao.sendKeysWebsite(site);
	}

	@Quando("preencher Picture")
	public void preencher_picture() {
		simulacao.checkInputByName("Picture");
		simulacao.clickfoto();
		simulacao.sendKeysFoto();
	}

	@Dado("que eu tenha completado os formulários anteriores")
	public void que_eu_tenha_completado_os_formulários_anteriores() {
		simulacao.checkSelectByName("Make");
		simulacao.clickMake();
		simulacao.sendKeysMake("BMW");
		simulacao.checkSelectByName("Model");
	    simulacao.clickModel();
	    simulacao.sendKeysModel("Scooter");
	    simulacao.checkInputByName("Cylinder Capacity");
		simulacao.clickCylinder();
	    simulacao.sendKeysCylinder("2000");
		simulacao.checkInputByName("[kW]");
		simulacao.clickEngine();
	    simulacao.sendKeysEngine("1000");
		simulacao.checkInputByName("Date of Manufacture");
		simulacao.clickManufacture();
	    simulacao.sendKeysManufacture("10/01/2021");
		simulacao.checkSelectByName("Number of Seats");
		simulacao.clickNumberSeats();
	    simulacao.sendKeysNumberSeats("9");
		simulacao.checkInputByName("Right Hand Drive");
		simulacao.clickRightYes();
		simulacao.checkSelectByName("Number of Seats Motorcycle");
		simulacao.clickNumberOfSeats();
	    simulacao.sendKeysNumberOfSeats("3");
		simulacao.checkSelectByName("Fuel Type");
		simulacao.clickFuelType();
		simulacao.sendKeysFuelType("Electric Power");
		simulacao.checkInputByName("Payload");
		simulacao.clickPayload();
		simulacao.sendKeysPayload("500");
		simulacao.checkInputByName("Total Weight");
		simulacao.clickTotalWeight();
		simulacao.sendKeysTotalWeight("50000");
		simulacao.checkInputByName("List Price");
		simulacao.clickListPrice();
		simulacao.sendKeysListPrice("100000");
		simulacao.checkInputByName("License Plate Number");
		simulacao.clickLicensePlateNumber();
		simulacao.sendKeysLicensePlateNumber("123456789");
		simulacao.checkInputByName("Annual Mileage");
		simulacao.clickAnnualMileage();
		simulacao.sendKeysAnnualMileage("50000");
		simulacao.clicknext1();
		simulacao.checkInputByName("First Name");
		simulacao.clickFirstName();
		simulacao.sendKeysFirstName("Accenture");
		simulacao.checkInputByName("Last Name");
		simulacao.clickLastName();
		simulacao.sendKeysLastName("Accenture");
		simulacao.checkInputByName("Date of Birth");
		simulacao.clickDateOfBirth();
		simulacao.sendKeysDateOfBirth("01/01/1999");
		simulacao.checkInputByName("Gender");
		simulacao.clickGender("Male");
		simulacao.checkInputByName("Street Address");
		simulacao.clickStreetAddress();
		simulacao.sendKeysStreetAddress("Rua Alexandre Dumas, 2051");
		simulacao.checkSelectByName("Country");
		simulacao.clickCountry();
		simulacao.sendKeysCountry("Brazil");
		simulacao.checkInputByName("Zip Code");
		simulacao.clickZipCode();
		simulacao.sendKeysZipCode("04717004");
		simulacao.checkInputByName("City");
		simulacao.clickCity();
		simulacao.sendKeysCity("São Paulo");
		simulacao.checkSelectByName("Occupation");
		simulacao.clickOccupation();
		simulacao.sendKeysOccupation("Employee");
		simulacao.checkInputByName("Hobbies");
		simulacao.clickHobbies("Todos");
		simulacao.checkInputByName("Website");
		simulacao.clickWebsite();
		simulacao.sendKeysWebsite("https://www.accenture.com/br-pt");
		simulacao.checkInputByName("Picture");
		simulacao.clickfoto();
		simulacao.sendKeysFoto();
	}

	@Quando("preencher Start Date {string}")
	public void preencher_start_date(String dataInicio) {
		simulacao.checkInputByName("Start Date");
		simulacao.clickStartDate();
		simulacao.sendKeysStartDate(dataInicio);
	}

	@Quando("preencher Insurance Sum {string}")
	public void preencher_insurance_sum(String somaSeguro) {
		simulacao.checkSelectByName("Insurance Sum");
		simulacao.clickInsuranceSum(somaSeguro);
	}

	@Quando("preencher Merit Rating {string}")
	public void preencher_merit_rating(String merito) {
		simulacao.checkSelectByName("Merit Rating");
		simulacao.clickMeritRating(merito);
	}

	@Quando("preencher Damage Insurance {string}")
	public void preencher_damage_insurance(String seguroDanos) {
		simulacao.checkSelectByName("Damage Insurance");
		simulacao.clickDamageInsurance();
		simulacao.sendKeysDamageInsurance(seguroDanos);
	}

	@Quando("preencher Optional Products {string}")
	public void preencher_optional_products(String opcionais) {
		simulacao.clickOptionalProducts(opcionais);
	}

	@Quando("prencher Courtesy Car {string}")
	public void prencher_courtesy_car(String cortesia) {
		simulacao.checkSelectByName("Courtesy Car");
		simulacao.clickCourtesyCar();
		simulacao.sendKeysCourtesyCar(cortesia);
	}

	@Dado("que eu tenha completado todos os formulários anteriores")
	public void que_eu_tenha_completado_todos_os_formulários_anteriores() {
		simulacao.checkSelectByName("Make");
		simulacao.clickMake();
		simulacao.sendKeysMake("BMW");
		simulacao.checkSelectByName("Model");
	    simulacao.clickModel();
	    simulacao.sendKeysModel("Scooter");
	    simulacao.checkInputByName("Cylinder Capacity");
		simulacao.clickCylinder();
	    simulacao.sendKeysCylinder("2000");
		simulacao.checkInputByName("[kW]");
		simulacao.clickEngine();
	    simulacao.sendKeysEngine("1000");
		simulacao.checkInputByName("Date of Manufacture");
		simulacao.clickManufacture();
	    simulacao.sendKeysManufacture("10/01/2021");
		simulacao.checkSelectByName("Number of Seats");
		simulacao.clickNumberSeats();
	    simulacao.sendKeysNumberSeats("9");
		simulacao.checkInputByName("Right Hand Drive");
		simulacao.clickRightYes();
		simulacao.checkSelectByName("Number of Seats Motorcycle");
		simulacao.clickNumberOfSeats();
	    simulacao.sendKeysNumberOfSeats("3");
		simulacao.checkSelectByName("Fuel Type");
		simulacao.clickFuelType();
		simulacao.sendKeysFuelType("Electric Power");
		simulacao.checkInputByName("Payload");
		simulacao.clickPayload();
		simulacao.sendKeysPayload("500");
		simulacao.checkInputByName("Total Weight");
		simulacao.clickTotalWeight();
		simulacao.sendKeysTotalWeight("50000");
		simulacao.checkInputByName("List Price");
		simulacao.clickListPrice();
		simulacao.sendKeysListPrice("100000");
		simulacao.checkInputByName("License Plate Number");
		simulacao.clickLicensePlateNumber();
		simulacao.sendKeysLicensePlateNumber("123456789");
		simulacao.checkInputByName("Annual Mileage");
		simulacao.clickAnnualMileage();
		simulacao.sendKeysAnnualMileage("50000");
		simulacao.clicknext1();
		simulacao.checkInputByName("First Name");
		simulacao.clickFirstName();
		simulacao.sendKeysFirstName("Accenture");
		simulacao.checkInputByName("Last Name");
		simulacao.clickLastName();
		simulacao.sendKeysLastName("Accenture");
		simulacao.checkInputByName("Date of Birth");
		simulacao.clickDateOfBirth();
		simulacao.sendKeysDateOfBirth("01/01/1999");
		simulacao.checkInputByName("Gender");
		simulacao.clickGender("Male");
		simulacao.checkInputByName("Street Address");
		simulacao.clickStreetAddress();
		simulacao.sendKeysStreetAddress("Rua Alexandre Dumas, 2051");
		simulacao.checkSelectByName("Country");
		simulacao.clickCountry();
		simulacao.sendKeysCountry("Brazil");
		simulacao.checkInputByName("Zip Code");
		simulacao.clickZipCode();
		simulacao.sendKeysZipCode("04717004");
		simulacao.checkInputByName("City");
		simulacao.clickCity();
		simulacao.sendKeysCity("São Paulo");
		simulacao.checkSelectByName("Occupation");
		simulacao.clickOccupation();
		simulacao.sendKeysOccupation("Employee");
		simulacao.checkInputByName("Hobbies");
		simulacao.clickHobbies("Todos");
		simulacao.checkInputByName("Website");
		simulacao.clickWebsite();
		simulacao.checkInputByName("Picture");
		simulacao.clickfoto();
		simulacao.sendKeysFoto();
		simulacao.clicknext2();
		simulacao.checkInputByName("Start Date");
		simulacao.clickStartDate();
		simulacao.sendKeysStartDate("01/01/2023");
		simulacao.checkSelectByName("Insurance Sum");
		simulacao.clickInsuranceSum("9");
		simulacao.checkSelectByName("Merit Rating");
		simulacao.clickMeritRating("1");
		simulacao.checkSelectByName("Damage Insurance");
		simulacao.clickDamageInsurance();
		simulacao.sendKeysDamageInsurance("Full Coverage");
		simulacao.clickOptionalProducts("Todos");
		simulacao.checkSelectByName("Courtesy Car");
		simulacao.clickCourtesyCar();
		simulacao.sendKeysCourtesyCar("Yes");
	}

	@Quando("clicar no tipo de contrato {string}")
	public void clicar_no_tipo_de_contrato(String contrato) {
		simulacao.clickTipoDeContrato(contrato);
	}

	@Dado("que eu tenha completado todos os formulários anteriores e selecionado o tipo de contrato")
	public void que_eu_tenha_completado_todos_os_formulários_anteriores_e_selecionado_o_tipo_de_contrato() {
		simulacao.checkSelectByName("Make");
		simulacao.clickMake();
		simulacao.sendKeysMake("BMW");
		simulacao.checkSelectByName("Model");
	    simulacao.clickModel();
	    simulacao.sendKeysModel("Scooter");
	    simulacao.checkInputByName("Cylinder Capacity");
		simulacao.clickCylinder();
	    simulacao.sendKeysCylinder("2000");
		simulacao.checkInputByName("[kW]");
		simulacao.clickEngine();
	    simulacao.sendKeysEngine("1000");
		simulacao.checkInputByName("Date of Manufacture");
		simulacao.clickManufacture();
	    simulacao.sendKeysManufacture("10/01/2021");
		simulacao.checkSelectByName("Number of Seats");
		simulacao.clickNumberSeats();
	    simulacao.sendKeysNumberSeats("9");
		simulacao.checkInputByName("Right Hand Drive");
		simulacao.clickRightYes();
		simulacao.checkSelectByName("Number of Seats Motorcycle");
		simulacao.clickNumberOfSeats();
	    simulacao.sendKeysNumberOfSeats("3");
		simulacao.checkSelectByName("Fuel Type");
		simulacao.clickFuelType();
		simulacao.sendKeysFuelType("Electric Power");
		simulacao.checkInputByName("Payload");
		simulacao.clickPayload();
		simulacao.sendKeysPayload("500");
		simulacao.checkInputByName("Total Weight");
		simulacao.clickTotalWeight();
		simulacao.sendKeysTotalWeight("50000");
		simulacao.checkInputByName("List Price");
		simulacao.clickListPrice();
		simulacao.sendKeysListPrice("100000");
		simulacao.checkInputByName("License Plate Number");
		simulacao.clickLicensePlateNumber();
		simulacao.sendKeysLicensePlateNumber("123456789");
		simulacao.checkInputByName("Annual Mileage");
		simulacao.clickAnnualMileage();
		simulacao.sendKeysAnnualMileage("50000");
		simulacao.clicknext1();
		simulacao.checkInputByName("First Name");
		simulacao.clickFirstName();
		simulacao.sendKeysFirstName("Accenture");
		simulacao.checkInputByName("Last Name");
		simulacao.clickLastName();
		simulacao.sendKeysLastName("Accenture");
		simulacao.checkInputByName("Date of Birth");
		simulacao.clickDateOfBirth();
		simulacao.sendKeysDateOfBirth("01/01/1999");
		simulacao.checkInputByName("Gender");
		simulacao.clickGender("Male");
		simulacao.checkInputByName("Street Address");
		simulacao.clickStreetAddress();
		simulacao.sendKeysStreetAddress("Rua Alexandre Dumas, 2051");
		simulacao.checkSelectByName("Country");
		simulacao.clickCountry();
		simulacao.sendKeysCountry("Brazil");
		simulacao.checkInputByName("Zip Code");
		simulacao.clickZipCode();
		simulacao.sendKeysZipCode("04717004");
		simulacao.checkInputByName("City");
		simulacao.clickCity();
		simulacao.sendKeysCity("São Paulo");
		simulacao.checkSelectByName("Occupation");
		simulacao.clickOccupation();
		simulacao.sendKeysOccupation("Employee");
		simulacao.checkInputByName("Hobbies");
		simulacao.clickHobbies("Todos");
		simulacao.checkInputByName("Website");
		simulacao.clickWebsite();
		simulacao.checkInputByName("Picture");
		simulacao.clickfoto();
		simulacao.sendKeysFoto();
		simulacao.clicknext2();
		simulacao.checkInputByName("Start Date");
		simulacao.clickStartDate();
		simulacao.sendKeysStartDate("01/01/2023");
		simulacao.checkSelectByName("Insurance Sum");
		simulacao.clickInsuranceSum("9");
		simulacao.checkSelectByName("Merit Rating");
		simulacao.clickMeritRating("1");
		simulacao.checkSelectByName("Damage Insurance");
		simulacao.clickDamageInsurance();
		simulacao.sendKeysDamageInsurance("Full Coverage");
		simulacao.clickOptionalProducts("Todos");
		simulacao.checkSelectByName("Courtesy Car");
		simulacao.clickCourtesyCar();
		simulacao.sendKeysCourtesyCar("Yes");
		simulacao.clicknext3();
		simulacao.clickTipoDeContrato("Ultimate");
	}

	@Quando("preencher Email {string}")
	public void preencher_email(String emailTest) {
		simulacao.checkInputByName("E-Mail");
		simulacao.clickEmail();
		simulacao.sendEmail(emailTest);
	}

	@Quando("preencher Phone {string}")
	public void preencher_phone(String telefone) {
		simulacao.checkInputByName("Phone");
		simulacao.clickPhone();
		simulacao.sendKeysPhone(telefone);
	}

	@Quando("preencher Username {string}")
	public void preencher_username(String usernameTest) {
		simulacao.checkInputByName("Username");
		simulacao.clickUsername();
		simulacao.sendKeysUsername(usernameTest);
	}

	@Quando("preencher Password {string}")
	public void preencher_password(String senha) {
		simulacao.checkInputByName("Password");
		simulacao.clickPassword();
		simulacao.sendKeysPassword(senha);
	}

	@Quando("preencher Comfirm Password {string}")
	public void preencher_comfirm_password(String senhaConfirmacao) {
		simulacao.checkInputByName("Confirm Password");
		simulacao.clickComfirmPassword();
		simulacao.sendKeysComfirmPassword(senhaConfirmacao);
	}

	@Quando("clicar no botao send")
	public void clicar_no_botao_send() {
		simulacao.checkButtonByName("Send E-Mail");
		simulacao.clicksend();
	}

	@Entao("deverá ser exibida a mensagem de sucesso")
	public void deverá_ser_exibida_a_mensagem_de_sucesso() {
		Assert.assertTrue("Falha ao tentar visualizar a mensagem de Sucesso", simulacao.checkMensagemSucesso());
	}

	@Dado("que eu tenha completado todos os formulários")
	public void que_eu_tenha_completado_todos_os_formulários() {
		simulacao.checkSelectByName("Make");
		simulacao.clickMake();
		simulacao.sendKeysMake("BMW");
		simulacao.checkSelectByName("Model");
	    simulacao.clickModel();
	    simulacao.sendKeysModel("Scooter");
	    simulacao.checkInputByName("Cylinder Capacity");
		simulacao.clickCylinder();
	    simulacao.sendKeysCylinder("2000");
		simulacao.checkInputByName("[kW]");
		simulacao.clickEngine();
	    simulacao.sendKeysEngine("1000");
		simulacao.checkInputByName("Date of Manufacture");
		simulacao.clickManufacture();
	    simulacao.sendKeysManufacture("10/01/2021");
		simulacao.checkSelectByName("Number of Seats");
		simulacao.clickNumberSeats();
	    simulacao.sendKeysNumberSeats("9");
		simulacao.checkInputByName("Right Hand Drive");
		simulacao.clickRightYes();
		simulacao.checkSelectByName("Number of Seats Motorcycle");
		simulacao.clickNumberOfSeats();
	    simulacao.sendKeysNumberOfSeats("3");
		simulacao.checkSelectByName("Fuel Type");
		simulacao.clickFuelType();
		simulacao.sendKeysFuelType("Electric Power");
		simulacao.checkInputByName("Payload");
		simulacao.clickPayload();
		simulacao.sendKeysPayload("500");
		simulacao.checkInputByName("Total Weight");
		simulacao.clickTotalWeight();
		simulacao.sendKeysTotalWeight("50000");
		simulacao.checkInputByName("List Price");
		simulacao.clickListPrice();
		simulacao.sendKeysListPrice("100000");
		simulacao.checkInputByName("License Plate Number");
		simulacao.clickLicensePlateNumber();
		simulacao.sendKeysLicensePlateNumber("123456789");
		simulacao.checkInputByName("Annual Mileage");
		simulacao.clickAnnualMileage();
		simulacao.sendKeysAnnualMileage("50000");
		simulacao.clicknext1();
		simulacao.checkInputByName("First Name");
		simulacao.clickFirstName();
		simulacao.sendKeysFirstName("Accenture");
		simulacao.checkInputByName("Last Name");
		simulacao.clickLastName();
		simulacao.sendKeysLastName("Accenture");
		simulacao.checkInputByName("Date of Birth");
		simulacao.clickDateOfBirth();
		simulacao.sendKeysDateOfBirth("01/01/1999");
		simulacao.checkInputByName("Gender");
		simulacao.clickGender("Male");
		simulacao.checkInputByName("Street Address");
		simulacao.clickStreetAddress();
		simulacao.sendKeysStreetAddress("Rua Alexandre Dumas, 2051");
		simulacao.checkSelectByName("Country");
		simulacao.clickCountry();
		simulacao.sendKeysCountry("Brazil");
		simulacao.checkInputByName("Zip Code");
		simulacao.clickZipCode();
		simulacao.sendKeysZipCode("04717004");
		simulacao.checkInputByName("City");
		simulacao.clickCity();
		simulacao.sendKeysCity("São Paulo");
		simulacao.checkSelectByName("Occupation");
		simulacao.clickOccupation();
		simulacao.sendKeysOccupation("Employee");
		simulacao.checkInputByName("Hobbies");
		simulacao.clickHobbies("Todos");
		simulacao.checkInputByName("Website");
		simulacao.clickWebsite();
		simulacao.checkInputByName("Picture");
		simulacao.clickfoto();
		simulacao.sendKeysFoto();
		simulacao.clicknext2();
		simulacao.checkInputByName("Start Date");
		simulacao.clickStartDate();
		simulacao.sendKeysStartDate("01/01/2023");
		simulacao.checkSelectByName("Insurance Sum");
		simulacao.clickInsuranceSum("9");
		simulacao.checkSelectByName("Merit Rating");
		simulacao.clickMeritRating("1");
		simulacao.checkSelectByName("Damage Insurance");
		simulacao.clickDamageInsurance();
		simulacao.sendKeysDamageInsurance("Full Coverage");
		simulacao.clickOptionalProducts("Todos");
		simulacao.checkSelectByName("Courtesy Car");
		simulacao.clickCourtesyCar();
		simulacao.sendKeysCourtesyCar("Yes");
		simulacao.clicknext3();
		simulacao.clickTipoDeContrato("Ultimate");
		simulacao.clicknext4();
		simulacao.checkInputByName("E-Mail");
		simulacao.clickEmail();
		simulacao.sendEmail("accenture@accenture.com");
		simulacao.checkInputByName("Phone");
		simulacao.clickPhone();
		simulacao.sendKeysPhone("12345678");
		simulacao.checkInputByName("Username");
		simulacao.clickUsername();
		simulacao.sendKeysUsername("accenture");
		simulacao.checkInputByName("Password");
		simulacao.clickPassword();
		simulacao.sendKeysPassword("Accenture123");
		simulacao.checkInputByName("Confirm Password");
		simulacao.clickComfirmPassword();
		simulacao.sendKeysComfirmPassword("Accenture123");	
	}

}
