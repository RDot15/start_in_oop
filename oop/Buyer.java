package oop;

import java.util.ArrayList;

public class Buyer {

    String login;
    String password;
    private Basket basket;


    public Buyer(String login, String password) {
        this.login = login;
        this.password = password;
        this.basket = new Basket();
    }
    public String getLogin(){
        return login;
    }

    public String getPassword(){
        return password;
    }

    public Basket getBasket() {
        return basket;
    }


}
