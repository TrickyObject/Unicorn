package mts.support.validator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import java.io.File;

public class Controller {

    @FXML
    private Button button;
    @FXML
    private TextField pathToXML;
    @FXML
    private TextField pathToXSD;

    private XMLValidator validator;
    private Source pathToFile;
    private File pathToSchema;


    public Controller() {
        validator = new XMLValidator();
    }

    @FXML
    private void validateClick(ActionEvent event) {

        button.setText("Исполнено!");
        System.out.println(pathToXML.getText());
        System.out.println(pathToXSD.getText());

        pathToFile = new StreamSource(new File(pathToXML.getText()));
        pathToSchema = new File(pathToXSD.getText());
//        pathToFile = new StreamSource(new File("C:/test/sample.xml"));
//        pathToSchema = new File("C:/test/schema.xsd");

        validator.validateXML(pathToFile, pathToSchema);

    }


}
