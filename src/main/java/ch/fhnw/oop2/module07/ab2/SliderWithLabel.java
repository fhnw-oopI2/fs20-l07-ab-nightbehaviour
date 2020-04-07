package ch.fhnw.oop2.module07.ab2;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;

final class SliderWithLabel extends VBox {
	private Slider slider;
	private Label label;

	SliderWithLabel() {
		initializeControls();
		layoutControls();
	}
	
	private void initializeControls() {
		label = new Label();

		slider = new Slider(1, 10, 1);
		slider.setShowTickMarks(true);
		slider.setShowTickLabels(true);
		slider.setMajorTickUnit(1);
		slider.setSnapToTicks(true);

		slider.valueProperty().addListener((observable, oldValue, newValue) -> label.setText(String.valueOf(newValue)));
	}
	
	private void layoutControls() {
		setMargin(label, new Insets(0,0,20,0));
		setPadding(new Insets(10));
		setAlignment(Pos.CENTER);
		getChildren().addAll(label, slider);
	}
}
