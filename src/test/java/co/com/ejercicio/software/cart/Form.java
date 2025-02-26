package co.com.ejercicio.software.cart;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickInteraction;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class Form {
  public static Performable login(String username, String password) {
        return Task.where(
                        Enter.theValue(username).into(Login.USERNAME),
                        Enter.theValue(password).into(Login.PASSWORD)
                )
                .with("username").of(username)
                .with("password").of(password);

    }

    public static Performable continueLogin(){
        return Click.on(Login.CONTINUE_LOGIN);
    }

    public static Performable continueButonLogin(){
        return Click.on(Login.CONTINUE_BUTONLOGIN);
    }

    public static Performable selectProducts1(){
        return
                Click.on(Products.PRODUCT1);
    }

    public static Performable addProducts1(){
        return
                Click.on(Products.ADDCARD_PRODUCT1);


    }


    public static Performable home(){
      return
                Click.on(Products.HOME);
    }

    public static Performable selectProducts2(){
        return
                Click.on(Products.PRODUCT2);
    }

    public static Performable addProducts2(){
        return
                Click.on(Products.ADDCARD_PRODUCT2);
    }




    public static Performable viewCart(){
        return Click.on(Products.VIEW_CART);
    }

    public static Performable placeOrder(){
        return Click.on(Products.PLACE_ORDER);
    }

    public static Performable formulario(String Name, String Country, String City, String CreditCard, String Month, String Year) {
        return Task.where(
                        Enter.theValue(Name).into(Formulario.NAME),
                        Enter.theValue(Country).into(Formulario.COUNTRY),
                        Enter.theValue(City).into(Formulario.CITY),
                        Enter.theValue(CreditCard).into(Formulario.CREDIT_CARD),
                        Enter.theValue(Month).into(Formulario.MONTH),
                        Enter.theValue(Year).into(Formulario.YEAR)
                )
                .with("name").of(Name)
                .with("country").of(Country)
                .with("city").of(City)
                .with("creditcard").of(CreditCard)
                .with("month").of(Month)
                .with("year").of(Year);


    }

    public static Performable continuar(){
        return Click.on(Formulario.CONTINUE);
    }

    public static Performable finalizar(){
        return Click.on(Formulario.FINISH);
    }

}
