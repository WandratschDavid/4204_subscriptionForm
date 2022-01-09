package viewcontroller;

import javafx.beans.binding.BooleanBinding;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Subscription;

import java.io.IOException;

/**
 * @author David Wandratsch
 * @version 1.0, 21.12.2021, class SubscriptionC
 * @link https://github.com/WandratschDavid/4204_subscriptionForm
 */
public class SubscriptionC
{
    @FXML
    private TextField firstNameTxt;
    @FXML
    private TextField surNameTxt;

    @FXML
    private CheckBox optionProperties;
    @FXML
    private CheckBox optionConcurrency;
    @FXML
    private CheckBox optionMOTU;

    @FXML
    private Button submitBtn;

    private Stage stage;

    private static Subscription subscription;

    public static void show(Stage stage)
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(SubscriptionC.class.getResource("SubscriptionV.fxml"));
            Parent root = loader.load();

            SubscriptionC subscriptionC = loader.getController();
            subscriptionC.stage = stage;
            init();

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("4204_subscriptionForm");
            stage.show();
        }
        catch (IOException ex)
        {
            System.err.printf("Error using %s!", "SubscriptionV.fxml");
            ex.printStackTrace();
            System.exit(1);
        }
    }

    public void init()
    {
        // Binding the TextFields to the StringProperties
        subscription.firstNameProperty().bind(firstNameTxt.textProperty());
        subscription.surNameProperty().bind(surNameTxt.textProperty());

        // Binding the CheckBoxes to the BooleanProperties
        subscription.javaFXConcurrencyProperty().bind(optionProperties.selectedProperty());
        subscription.javaFXPropertiesProperty().bind(optionConcurrency.selectedProperty());
        subscription.javaMOTUProperty().bind(optionMOTU.selectedProperty());

        // Checking if the TextFields are empty and disabling the Submit Button if they are
        BooleanBinding firstNameEntered = firstNameTxt.textProperty().isNotEmpty().and(firstNameTxt.textProperty().length().greaterThan(3));
        BooleanBinding surNameEntered = surNameTxt.textProperty().isNotEmpty().and(surNameTxt.textProperty().length().greaterThan(3));
        submitBtn.disableProperty().bind(firstNameEntered.not().and(surNameEntered.not()));

        // Button Handler
        /*
        submitBtn.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {

            }
        });
        */
    }
}