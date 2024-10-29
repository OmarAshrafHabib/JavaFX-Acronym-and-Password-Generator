
/**
 * can be used to test the methods in your StringGenerator class.
 * @author Omar Habib ID:3742418
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Title extends Application {
    private TextField text;
    private Text greetings;
    private Button acrynom;
    private Button password;
    private Button reset;
    private StringGenerator string;

    public void start(Stage primaryStage) {
        primaryStage.setTitle("String Generator");
        text = new TextField();
        text.setPrefWidth(500);

        Label stringLable = new Label("Enter a Title or phrase: ");
        greetings = new Text("Let's create an acronym or password!");

        acrynom = new Button("Generate Acronym");
        password = new Button("Generate Password");
        reset = new Button("Reset");

        acrynom.setOnAction(this::processButton);
        password.setOnAction(this::processButton2);
        reset.setOnAction(this::processButton3);

        HBox box1 = new HBox(acrynom, password, reset);
        VBox box2 = new VBox(stringLable, text, box1, greetings);

        FlowPane pane = new FlowPane(box2);
        box1.setSpacing(15);
        box2.setSpacing(15);
        pane.setHgap(30);
        pane.setVgap(50);
        pane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(pane, 600, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void processButton(ActionEvent event) {
        String s = text.getText();
        greetings.setText(string.generateAcronym(s));
    }

    public void processButton2(ActionEvent event) {
        String s = text.getText();
        greetings.setText(string.generatePassword(s));
    }

    public void processButton3(ActionEvent event) {
        text.clear();
        greetings.setText("Let's create an acronym or password!");
    }
}
