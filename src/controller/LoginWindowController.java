package controller;

import javafx.animation.ParallelTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import jdk.nashorn.internal.runtime.Context;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class LoginWindowController {
    public AnchorPane context;

    public void openWindow2(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/RoomAndPackageWindow.fxml");
        Parent load = FXMLLoader.load(resource);
        //context.getChildren().clear();
        //context.getChildren().add(load);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
