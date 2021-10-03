#language: pt

@CreateAccount
Funcionalidade: Create account
	
	Contexto:
		Dado que eu acesse o site
    Então sera validado o acesso
     
		@teste
    Cenario: 01 - Validar primeiro formulario 
    Dado que eu esteja na pagina "Enter Vehicle Data"
    Quando for exibido o formulario
    E preencher make "BMW"
    E preencher model "Scooter"
    E preencher Cylinder Capacity "2000"
    E preencher Engine Performance "1000"
    E preencher Date Of Manufacture "10/01/2021"
    E prencher Number of Steats "9"
    E preencher Right Hand Drive "Yes"
    E preencher segundo Number of Seats "2"
    E preencher o Fuel Type "Electric Power"
    E preencher o Payload "500"
    E preencher o Total Weight "50000"
    E preencher List Price "100000"
    E preencher License Plate Number "123456789"
    E preencher Annual Mileage "50000"
    E clicar no botao next da pagina "Enter Vehicle Data" 
		Entao deverá ser exibido o proximo formulario "Enter Insurant Data" 
		
		Cenario: 02 - Validar segundo formulario 
    Dado que eu tenha completado o formulário anterior
    Quando clicar no botao next da pagina "Enter Vehicle Data"
    E que eu esteja na pagina "Enter Insurant Data"
    E for exibido o formulario
    E preencher First Name "Accenture"
    E preencher Last Name "Accenture"
    E preencher Date Of Birth "01/01/1999"
    E preencher Gender "Male"
    E preencher Street Address "Rua Alexandre Dumas, 2051"
    E prencher Country "Brazil"
    E preencher Zip Code "04717004"
    E preencher City  "São Paulo"
    E preencher Occupation "Employee"
    E preencher os Hobbies "Todos"
    E preencher Website "https://www.accenture.com/br-pt"
    E preencher Picture
    E clicar no botao next da pagina "Enter Insurant Data" 
		Entao deverá ser exibido o proximo formulario "Enter Product Data" 
		
		Cenario: 03 - Validar terceiro formulario 
    Dado que eu tenha completado os formulários anteriores
    Quando clicar no botao next da pagina "Enter Insurant Data"
    E que eu esteja na pagina "Enter Product Data"
    E for exibido o formulario
    E preencher Start Date "01/01/2023"
    E preencher Insurance Sum "9"
    E preencher Merit Rating "1"
    E preencher Damage Insurance "Full Coverage"
    E preencher Optional Products "Todos"
    E prencher Courtesy Car "Yes"
    E clicar no botao next da pagina "Enter Product Data" 
		Entao deverá ser exibido o proximo formulario "Select Price Option"
		
		Cenario: 04 - Validar quarto formulario 
    Dado que eu tenha completado todos os formulários anteriores
    Quando clicar no botao next da pagina "Enter Product Data"
    E que eu esteja na pagina "Select Price Option"
    E for exibido o formulario
    E clicar no tipo de contrato "Ultimate"
    E clicar no botao next da pagina "Select Price Option" 
		Entao deverá ser exibido o proximo formulario "Send Quote"
		
		Cenario: 05 - Validar terceiro formulario 
    Dado que eu tenha completado todos os formulários anteriores e selecionado o tipo de contrato
    Quando clicar no botao next da pagina "Select Price Option"
    E que eu esteja na pagina "Send Quote"
    E for exibido o formulario
    E preencher Email "accenture@accenture.com"
    E preencher Phone "12345678"
    E preencher Username "accenture"
    E preencher Password "Accenture123"
    E preencher Comfirm Password "Accenture123"
    E clicar no botao send 
		Entao deverá ser exibida a mensagem de sucesso
		
		Cenario: 06 - Validar quarto formulario 
    Dado que eu tenha completado todos os formulários
    Quando clicar no botao send 
		Entao deverá ser exibida a mensagem de sucesso