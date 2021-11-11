package com.modanisa;

import org.openqa.selenium.By;

public class Locators {
    public static By text = By.cssSelector(".new-todo");
    public static By check = By.cssSelector(".view>label");
    public static By marked = By.cssSelector(".toggle");
    public static By destroy = By.cssSelector(".destroy");
    public static By checkEmpty = By.cssSelector(".todo-list");
}
