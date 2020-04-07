package ch.fhnw.oop2.module07.ab1;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

final class LabelButton extends FlowPane {
	private Button addLabelButton;
	private int labelCount;

	LabelButton() {
		initializeControls();
		layoutControls();
	}
	
	private void initializeControls() {
		addLabelButton = new Button("Add Label");

		addLabelButton.setOnAction(event -> {
			Label l = new Label("Label " + ++labelCount);
			setMargin(l, new Insets(5,0,5,10));
			getChildren().add(l);
		});
	}
	
	private void layoutControls() {
		setPadding(new Insets(10));
		getChildren().addAll(addLabelButton);
	}
}
