package model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * @author David Wandratsch
 * @version 1.0, 21.12.2021, class Subscription
 * @link https://github.com/WandratschDavid/4204_subscriptionForm
 */
public class Subscription
{
    private final StringProperty firstName = new SimpleStringProperty();
    private final StringProperty surName = new SimpleStringProperty();
    private final BooleanProperty javaFXProperties = new SimpleBooleanProperty();
    private final BooleanProperty javaFXConcurrency = new SimpleBooleanProperty();
    private final BooleanProperty javaMOTU = new SimpleBooleanProperty();


    public String getFirstName()
    {
        return firstName.get();
    }

    public StringProperty firstNameProperty()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName.set(firstName);
    }

    public String getSurName()
    {
        return surName.get();
    }

    public StringProperty surNameProperty()
    {
        return surName;
    }

    public void setSurName(String lastName)
    {
        this.surName.set(lastName);
    }

    public boolean isJavaFXProperties()
    {
        return javaFXProperties.get();
    }

    public BooleanProperty javaFXPropertiesProperty()
    {
        return javaFXProperties;
    }

    public void setJavaFXProperties(boolean javaFXProperties)
    {
        this.javaFXProperties.set(javaFXProperties);
    }

    public boolean isJavaFXConcurrency()
    {
        return javaFXConcurrency.get();
    }

    public BooleanProperty javaFXConcurrencyProperty()
    {
        return javaFXConcurrency;
    }

    public void setJavaFXConcurrency(boolean javaFXConcurrency)
    {
        this.javaFXConcurrency.set(javaFXConcurrency);
    }

    public boolean isJavaMOTU()
    {
        return javaMOTU.get();
    }

    public BooleanProperty javaMOTUProperty()
    {
        return javaMOTU;
    }

    public void setJavaMOTU(boolean javaMOTU)
    {
        this.javaMOTU.set(javaMOTU);
    }
}