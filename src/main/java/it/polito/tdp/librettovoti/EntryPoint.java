package it.polito.tdp.librettovoti;

import it.polito.tdp.librettovoti.model.Libretto;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class EntryPoint extends Application {
	
//	All'interno del main (entryPoint) creo la classe model e chiamo il metodo setModel del Controller affinche lui si possa ricordare e conoscere	
//	su quale modello lavorare.
//	Per chiamarte tale metodo devo avere nel main un riferimento alla classe controller.
	
    @Override
    public void start(Stage stage) throws Exception {
       // Parent root = FXMLLoader.load(getClass().getResource("/fxml/Scene.fxml"));
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Scene.fxml"));
        Parent root = loader.load();
        
        FXMLController controller = loader.getController();
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/Styles.css");
        
        //creo il Modello = un istanza della classe Libretto, e servirà al controllore come minimo per chiamare il metodo add
        Libretto model = new Libretto();
        controller.setModel(model);
        
        stage.setTitle("JavaFX and Maven");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
