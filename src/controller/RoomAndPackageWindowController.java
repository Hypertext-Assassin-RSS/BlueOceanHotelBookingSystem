package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class RoomAndPackageWindowController {
    public ComboBox <String> rmtp;

    public void initialize () {
        ObservableList<String> observableList = FXCollections.observableArrayList();
        rmtp.getItems().addAll("Single","Double","Triple","Quad");
        rmtp.getSelectionModel().selectedItemProperty().addListener(((observable, oldValue, newValue) -> {
            //System.out.println(oldValue);
            //System.out.println(newValue);
            //txtAnswer.setText(newValue);
        }));
    }

    public void openWindow3(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/RoomAvailabilityWindow.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

}
