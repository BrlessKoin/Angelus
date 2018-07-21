package com.bravesoft;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoaderController {

	// Declarando los campos del GUI dentro del controlador
	@FXML
	private TextField userNameField;

	@FXML
	private Label statusLabel;

	@FXML
	private PasswordField passWordField;

	@FXML
	private Button loaderSubmitButton;


	// Validacion temporal del formulario de login, valida solo campos vacios
	@FXML
	private void buttonPressed(ActionEvent event) {

		try {
			if(!userNameField.getText().isEmpty() && !passWordField.getText().isEmpty()) {

				statusLabel.setText("Passou!");
				statusLabel.setVisible(true);

			} else {

				statusLabel.setText("Por favor preencha os dados!");
				statusLabel.setVisible(true);
			}


		} catch (NumberFormatException ex) {

		}
	}


}
