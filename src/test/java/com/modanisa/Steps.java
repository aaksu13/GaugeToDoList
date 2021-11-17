package com.modanisa;

import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Steps extends BaseMetods{

    @Step("I write <x> to textbox and press enter")
    public void writeText(String x) {
        writeCheckBox(Locators.text,x);
    }

    @Step("I click on delete button next to 'rest for a while' item")
    public void deleteItem(){
        action(Locators.check);
        clickElement(Locators.destroy);
    }

    @Step("I click on checkbox next to item")
    public void markedBuySomeMilk(){
        clickElement(Locators.marked);
    }

    @Step("I should see 'buy some milk' item in ToDoList")
    public void checkBuySomeMilk() {
        Assert.assertEquals("buy some milk", findElement(Locators.check).getText());
    }


    @Step("I should see 'buy some milk' item marked as Done")
    public void checkMarkedDone(){
        Assert.assertEquals("line-through",findElement(Locators.check).getCssValue("text-decoration-line"));
    }
    @Step("I should see 'buy some milk' item marked as UnDone")
    public void checkMarkedUnDone(){
        Assert.assertNotNull(findElement(Locators.check).getCssValue("background-image"));
    }

    @Step("I should 'drink water' item in ToDo list")
    public void checkDrinkWater(){
        Assert.assertEquals("drink water",findElement(Locators.check).getText());
    }

    @Step("I should see 'enjoy the assignment' item in ToDoList below 'buy some milk'")
    public void checkEnjoyTheAssignment(){
        List<WebElement> list = driver.findElements(Locators.check);
        int size = list.size();
        Assert.assertEquals("enjoy the assignment",list.get(size-1).getText());
    }

    @Step("List should be empty")
    public void checkEmpty(){
        Assert.assertEquals("",findElement(Locators.checkEmpty).getText());
    }
}
