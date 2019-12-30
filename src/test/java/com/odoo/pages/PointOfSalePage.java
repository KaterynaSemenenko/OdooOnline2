package com.odoo.pages;

import com.odoo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PointOfSalePage extends BasePage{

    public PointOfSalePage(){

        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//a[@class='oe_menu_toggler']//span[@class='oe_menu_text'][contains(text(),'Point of Sale')]")
    public WebElement pointOfSaleTap;

    @FindBy(xpath = "//a[@class='oe_menu_toggler']//span[@class='oe_menu_text'][contains(text(),'Products')] ")
    public WebElement productSubmoduleLink;

    @FindBy(xpath = "//span[contains(text(),'PoS Categories')]")
    public WebElement poSCategoriesLink ;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_list_button_add']")
    public WebElement createButton;

   @FindBy(css = "input[name='name']")
    public WebElement nameInputBox;

   @FindBy (xpath = "//input[@id='o_field_input_6']")
    public WebElement parentCategoryDropDownBox;

   @FindBy(css = "input[id='o_field_input_7']")
    public WebElement sequenceInputBox;

   @FindBy(xpath = " //button[@class='btn btn-primary btn-sm o_form_button_save']")
   public  WebElement saveButton;




    }



