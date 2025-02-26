package co.com.ejercicio.software.cart;

import org.openqa.selenium.By;

public class Products {

    public static By PRODUCT1 = By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a");

    public static By ADDCARD_PRODUCT1 = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");

    public static By HOME = By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a");

    public static By PRODUCT2 = By.xpath("//*[@id=\"tbodyid\"]/div[8]/div/div/h4/a");

    public static By ADDCARD_PRODUCT2 = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");

    public static By VIEW_CART = By.xpath("//*[@id=\"navbarExample\"]/ul/li[4]/a");

    public static By PLACE_ORDER = By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button");
}
