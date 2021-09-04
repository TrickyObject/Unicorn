package mts.support.validator;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.InputStream;

public class Program extends Application {

    public static void main(String[] args)  {

        XMLValidator validator = new XMLValidator();

        Source pathToFile  = new StreamSource(
                new File("C:/test/sample.xml"));
        File pathToSchema  = new File("C:/test/schema.xsd");

//        validator.validateXML(pathToFile, pathToSchema);

        Application.launch();

    }

    @Override
    public void start(Stage stage) throws Exception {

        stage.show();
        stage.setTitle("Unicorn Validator");

        InputStream iconStream = getClass().getResourceAsStream("/unicorn.png");
        Image image = new Image(iconStream);

        stage.getIcons().add(image);

        Label labelXML = new Label("Путь к XML");
        Label labelXSD = new Label("Путь к XSD");
        Label labelRes = new Label();

        TextField pathToXML = new TextField();
        TextField pathToXSD = new TextField();

        pathToXML.setPrefColumnCount(10);
        pathToXSD.setPrefColumnCount(10);

        Button checkValidate = new Button("Валидировать");
        checkValidate.setOnAction(actionEvent ->
                labelRes.setText(pathToXML.getText() + pathToXSD.getText()));

        FlowPane root = new FlowPane(Orientation.VERTICAL, 10, 10,
                pathToXML, pathToXSD, labelXSD, labelXML, checkValidate, labelRes);
        Scene scene = new Scene(root, 250, 250);

        stage.setScene(scene);

    }
}
