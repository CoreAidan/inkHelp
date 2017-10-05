package com.coreaidan.inkhelp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/sample.fxml"));

        /*VBox box = new VBox();

        Group root = new Group();
        Text text = new Text("Sup!");
        text.setFont(new Font("Papyrus", 80));
        Label label = new Label("Name:");
        GridPane grid = new GridPane();
        Button btn = new Button();
        TextField nameFld = new TextField();

        grid.add(label, 0, 0);
        grid.add(nameFld, 1, 0);
        grid.add(btn, 1, 1);
        grid.setHgap(20);
        //grid.setGridLinesVisible(true);

        btn.setText("say sup!");
        btn.setOnAction(evt -> System.out.printf("Sup %s!%n", nameFld.getText()));

        text.setY(50);

        box.getChildren().addAll(text, grid);

        root.getChildren().add(box);*/

        primaryStage.setTitle("the sup app");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
