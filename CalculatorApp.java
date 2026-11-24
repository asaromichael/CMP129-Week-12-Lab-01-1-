import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CalculatorApp extends Application {

    public static void main(String[] args) {
    launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        TextField display = new TextField();
        display.setEditable(false);
        display.setAlignment(Pos.CENTER_RIGHT);

        Button button1 = new Button("1");
        Button button2 = new Button("2");
        Button button3 = new Button("3");
        Button button4 = new Button("4");
        Button button5 = new Button("5");
        Button button6 = new Button("6");
        Button button7 = new Button("7");
        Button button8 = new Button("8");
        Button button9 = new Button("9");
        Button button0 = new Button("0");
        Button buttonPlus = new Button("+");
        Button buttonMinus = new Button("-");
        Button buttonMul = new Button("*");
        Button buttonDiv = new Button("/");
        Button buttonEqual = new Button("=");
        Button buttonC = new Button("C");

        VBox column1 = new VBox(12, button7, button4, button1);
        column1.setPadding(new Insets(20));

        VBox column2 = new VBox(12, button8, button5, button2);
        column2.setPadding(new Insets(20));

        VBox column3 = new VBox(12, button9, button6, button3);
        column3.setPadding(new Insets(20));

        VBox column4 = new VBox(12, buttonC, buttonEqual, button0);
        column4.setPadding(new Insets(20));

        VBox column5 = new VBox(12, buttonPlus, buttonMinus, buttonMul, buttonDiv);
        column5.setPadding(new Insets(20));

        HBox calc = new HBox(12, column1, column2, column3, column4, column5);
        calc.setPadding(new Insets(20));

        VBox calc2 = new VBox(12, display, calc);
        calc2.setPadding(new Insets(20));

        Scene scene = new Scene(calc2, 460, 300);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();



    }

    private class calcHandler implements EventHandler<ActionEvent> {
        public void handle(ActionEvent event) {
            // 1. Read the text currently in the two input boxes.
            String firstText = first.getText();
            String secondText = second.getText();
            // 2. Convert the text into numeric variables.
            double a = Double.parseDouble(firstText);
            double b = Double.parseDouble(secondText);
            // 3. Choose the higher score and display it in box three.
            double higher = Math.max(a, b);
            result.setText(String.valueOf(higher));
        }
    }
    
}