package Operaciones;

import java.nio.charset.Charset;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import SeleniumOperaciones.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class CrearUsuario extends Base {

	
	By SingUp = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
	By cuenta = By.xpath("//*[@id=\"email_create\"]");
	By BtnValidar = By.xpath("//*[@id=\"SubmitCreate\"]");
	By Genger = By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[1]/div[1]");
	By Name = By.xpath("//*[@id=\"customer_firstname\"]");
	By Lname = By.xpath("//*[@id=\"customer_lastname\"]");
	By Pass = By.xpath("//*[@id=\"passwd\"]");
	By Day = By.xpath("//*[@id=\"days\"]");
	By Month = By.xpath("//*[@id=\"months\"]");
	By Year = By.xpath("//*[@id=\"years\"]");
	By Address = By.xpath("//*[@id=\"address1\"]");
	By City = By.xpath("//*[@id=\"city\"]");
	By State = By.xpath("//*[@id=\"id_state\"]");
	By Code = By.xpath("//*[@id=\"postcode\"]");
	By Country = By.xpath("//*[@id=\"id_country\"]");
	By Telefono = By.xpath("//*[@id=\"phone_mobile\"]");
	By Alias = By.xpath("//*[@id=\"alias\"]");
	By Register = By.xpath("//*[@id=\"submitAccount\"]");
	By Msg = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span");
	                          



	public void AbrirNavegador(String url) {
		try {
			this.chromeConnection();
			visit(url);
			driver.manage().window().maximize();
		}catch(Exception ex) {
			System.out.println("Error al abrir el navegador: "+ex);
		}
	}
	
	public void SeleccionarSeccion() {
		try {
			click(SingUp);
		}catch(Exception ex){
			System.out.println("Error en el click: "+ex);
		}
		
	}
	
	public void ValidarCorreo() {
		try {
			
			Input("Tt019874@gmail.com",cuenta);
			click(BtnValidar);
			
		}catch(Exception ex) {
			System.out.println("El cliente ya existe: "+ ex);
		}
	}
	public void Formulario() {
		try {
			
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				click(Genger);
				Input("Jose",Name);
				Input("Montoya",Lname);
				Input("12345",Pass);
				ListaBox(1,Day);
				ListaBox(1,Month);
				ListaBox(1,Year);
				Input("Calle 128 C N° 123- 33",Address);
				Input("Bogota",City);
				ListaBox(1,State);
				Input("00000",Code);
				ListaBox(1,Country);
				Input("31000000",Telefono);
				Input("Jmontoya",Alias);
				
				
				
			
		}catch(Exception ex){
			System.out.println("Error con el formulario: "+ex);
		}

	}
	

	public void Enviar() {
		try {
			click(Register);
		}catch(Exception ex) {
			System.out.println("Error al enviar el formulario: "+ex);
		}
		
	}
	
	public void Mensaje() {
		
		String mensaje = getText(Msg);
		if(mensaje != null) {
			System.out.println("Usuario registrado");
		}
		else {
			System.out.println("Error al crear usuario: ");
		}
	}


}
