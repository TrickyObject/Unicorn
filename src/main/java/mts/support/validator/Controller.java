package mts.support.validator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    @FXML
    private Button button;

    @FXML
    private void validateClick(ActionEvent event) {
        button.setText("Исполнено!");
    }


}
