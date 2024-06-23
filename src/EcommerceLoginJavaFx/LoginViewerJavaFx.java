package EcommerceLoginJavaFx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.net.URL;
import java.nio.file.Paths;

public class LoginViewerJavaFx extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception{
		URL fxmlURL=Paths.get("C:\\Users\\user\\eclipse-workspace\\EcommerceJavaFxDB\\src\\EcommerceLoginJavaFx\\LoginForm.fxml").toUri().toURL();
		
		//Parent actorGroup = FXMLLoader.load(getClass().getResource("LoginScreen.fxml"));
        
		Parent actorGroup=FXMLLoader.load(fxmlURL);
		
		stage.setTitle("Ecommerce Login");
		
		Scene scene=new Scene(actorGroup, 600, 400);
		
		stage.setScene(scene);
		
		stage.show();
	}
}
