package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.viewmodel.UsuarioViewModel;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("/sample/view/clientes.fxml"));
        Parent root =  loader.load();

        primaryStage.setTitle("Hello World");

        primaryStage.setScene(new Scene(root, 900, 510));

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
