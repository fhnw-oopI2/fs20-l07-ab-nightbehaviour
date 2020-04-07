package ch.fhnw.oop2.module07.ab3;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.util.converter.NumberStringConverter;

final class SliderWithTextField extends VBox {
	private Slider slider;
	private TextField textField;

	SliderWithTextField() {
		initializeControls();
		layoutControls();
	}
	
	private void initializeControls() {
		textField = new TextField();

		slider = new Slider(1, 10, 1);
		slider.setShowTickMarks(true);
		slider.setShowTickLabels(true);
		slider.setMajorTickUnit(1);
		slider.setSnapToTicks(true);

		textField.textProperty().bindBidirectional(slider.valueProperty(), new NumberStringConverter());
	}
	
	private void layoutControls() {
		setMargin(textField, new Insets(0,0,20,0));
		setPadding(new Insets(10));
		setAlignment(Pos.CENTER);
		getChildren().addAll(textField, slider);
	}
}
