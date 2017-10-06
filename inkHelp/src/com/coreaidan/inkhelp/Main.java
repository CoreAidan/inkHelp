package com.coreaidan.inkhelp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Main extends Application {

    private static ArrayList<String> nouns;
    private static ArrayList<String> adjective;

    @Override
    public void start(Stage primaryStage) throws Exception{
        nouns = new ArrayList<String>(5000);
        adjective = new ArrayList<String>(2000);

        System.out.println(this.getClass().getResource("./file"));

        loadAdjective();
        loadNouns();


        Parent root = FXMLLoader.load(getClass().getResource("/fxml/sample.fxml"));

        primaryStage.getIcons().add(new Image("/ink-icon.png"));
        primaryStage.setTitle("inkHelp");
        primaryStage.setScene(new Scene(root, 550, 475));
        primaryStage.show();
    }

    public static String getRandomNoun(){
        Random rand = new Random();

        return nouns.get(rand.nextInt(4554 ) + 1);
    }

    public static String getRandomAdjective(){
        Random rand = new Random();

        return adjective.get(rand.nextInt(1466 ) + 1);
    }

    private void loadAdjective(){
        String fileName = "adjectivelist.txt";
        String filePath = "file/" + fileName;

        String line = null;

        try {
            InputStream is = this.getClass().getResourceAsStream(filePath);
            BufferedReader bf = new BufferedReader(new InputStreamReader(is));
            //FileReader fr = new FileReader(filePath);
            //BufferedReader bf = new BufferedReader(fr);

            while((line = bf.readLine()) != null){
                adjective.add(line);
            }

        }catch (FileNotFoundException ex){
            System.out.println("unable to open file: " + fileName);
        }
        catch (IOException ex){
            System.out.print("Error reading file: " + fileName);
        }
    }

    private void loadNouns(){
        String fileName = "nounlist.txt";
        String filePath = "file/" + fileName;

        String line = null;

        try {
            InputStream is = this.getClass().getResourceAsStream(filePath);
            BufferedReader bf = new BufferedReader(new InputStreamReader(is));
            //FileReader fr = new FileReader(filePath);
            //BufferedReader bf = new BufferedReader(fr);

            while((line = bf.readLine()) != null){
                nouns.add(line);
            }

        }catch (FileNotFoundException ex){
            System.out.println("unable to open file: " + fileName);
        }
        catch (IOException ex){
            System.out.print("Error reading file: " + fileName);
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
