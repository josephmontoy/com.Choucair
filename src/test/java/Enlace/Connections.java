package Enlace;

import Operaciones.CrearUsuario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Connections {
	
	CrearUsuario cs = new CrearUsuario();
	
	@Given("^Acceder al link de la pagina de choucair$")
	public void acceder_al_link_de_la_pagina_de_choucair() {
	    // Write code here that turns the phrase above into concrete actions
		cs.AbrirNavegador("http://automationpractice.com/index.php");
	}


	@When("^Acceder a la seccion Sing in$")
	public void acceder_a_la_seccion_Sing_in() {
	    // Write code here that turns the phrase above into concrete actions
		cs.SeleccionarSeccion();
	}

	@When("^Validar existencia del cliente$")
	public void validar_existencia_del_cliente() {
	    // Write code here that turns the phrase above into concrete actions
		cs.ValidarCorreo();
	}

	@When("^Diligenciar formulario$")
	public void diligenciar_formulario() {
	    // Write code here that turns the phrase above into concrete actions
		cs.Formulario();
	}

	@When("^Enviar solicitud de creacion del cliente$")
	public void enviar_solicitud_de_creacion_del_cliente() {
	    // Write code here that turns the phrase above into concrete actions
		cs.Enviar();
	}

	@Then("^Validar creacion del cliente$")
	public void validar_creacion_del_cliente() {
	    // Write code here that turns the phrase above into concrete actions
		cs.Mensaje();
	}


}
