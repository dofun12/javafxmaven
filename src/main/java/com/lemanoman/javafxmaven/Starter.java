package com.lemanoman.javafxmaven;

import com.lemanoman.javafxmaven.interfaces.FXController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Map;

public class Starter extends Application {
    private Stage primaryStage;


    public void changeStage(String name){
        try {
            FXMLLoader loader = new FXMLLoader(Starter.class.getClassLoader().getResource(name+".fxml"));
            Parent root = loader.load();
            FXController controller = loader.getController();
            controller.initialize(root,this);
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void start(Stage primaryStage) throws Exception{


        this.primaryStage = primaryStage;
        primaryStage.setTitle("Hello World");
        changeStage("sample");
        primaryStage.show();
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
