package mts.support.validator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.InputStream;
import java.net.URL;

public class RealisationXML extends Application {

    public static void main(String[] args) {

        Application.launch();

    }

    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("Unicorn Validator");

        InputStream iconStream = getClass().getResourceAsStream("/unicorn.png");
        Image image = new Image(iconStream);

        stage.getIcons().add(image);

        //jar
        //Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample.fxml"));;
//        Parent root = FXMLLoader.load(getClass().getResource("/sample.fxml"));

        FXMLLoader loader = new FXMLLoader();
        URL xmlUrl = getClass().getResource("/sample.fxml");
        loader.setLocation(xmlUrl);
        Parent root = loader.load();

        Scene scene = new Scene(root);

        stage.setScene(scene);

        stage.setWidth(250);
        stage.setHeight(200);

        stage.show();

    }
}
/*
        FXMLLoader loader = new FXMLLoader();
//        loader.setLocation(getClass().getResource("/resources/sample.fxml"));
        InputStream resource = getClass()
                .getResourceAsStream("sample.fxml");
        Parent root = loader.load(resource);
        /*
        Parent root = FXMLLoader.load(getClass()
                .getResource("/resources/sample.fxml"));

         */
