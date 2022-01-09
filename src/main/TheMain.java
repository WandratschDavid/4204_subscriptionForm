package main;

import javafx.application.Application;
import javafx.stage.Stage;
import viewcontroller.SubscriptionC;

/**
 * @author David Wandratsch
 * @version 1.0, 21.12.2021, class TheMain
 * @link https://github.com/WandratschDavid/4204_subscriptionForm
 */
public class TheMain extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        SubscriptionC.show(primaryStage);
    }
}