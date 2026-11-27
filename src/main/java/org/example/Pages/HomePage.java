package org.example.Pages;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target LOGIN_LINK = Target.the("Boton Signup / Login")
            .locatedBy("//a[@href ='/login']");

    public static final Target LOGGED_IN_AS = Target.the("Mensaje Logged in as")
            .locatedBy("//a[contains(text(),'Logged in as')]");

    public static final Target LOGOUT_LINK = Target.the("Boton Logout")
            .locatedBy("a[href='/logout']");

    public static final Target DELETE_ACCOUNT_LINK = Target.the("Boton Delete Account")
            .locatedBy("a[href='/delete_account']");

    public static final Target PRODUCTS_LINK = Target.the("Boton Products")
            .locatedBy("a[href='/products']");

    public static final Target CART_LINK = Target.the("Boton Cart")
            .locatedBy("a[href='/view_cart']");
}