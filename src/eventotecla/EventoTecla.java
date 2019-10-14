
package eventotecla;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class EventoTecla extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Text texto = new Text(20,20,"A");
       
        
        texto.setOnKeyPressed((KeyEvent e) -> {
            switch(e.getCode())
            {
                case DOWN:
                    texto.setLayoutY(texto.getLayoutY()+10);
                    break;
                case UP:
                    texto.setLayoutY(texto.getLayoutY()-10);
                    break;
                case RIGHT:
                    texto.setLayoutX(texto.getLayoutX()+10);
                    break;
                case LEFT:
                    texto.setLayoutX(texto.getLayoutX()-10);
                    break;
                default:
                    break;
            }
        });
        
        Pane root = new Pane();      
        root.getChildren().add(texto);
        texto.setFocusTraversable(true);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
