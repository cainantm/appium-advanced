package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class CreateTaskPage extends PageBase{

    public CreateTaskPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "editTextTitre")
    @iOSXCUITFindBy(iOSNsPredicate = "value == 'Title'")
    WebElement taskNameTxt;

    @AndroidFindBy(id = "editTextNote")
    @iOSXCUITFindBy(iOSNsPredicate = "value == 'Description'")
    WebElement taskDescTxt;

    @AndroidFindBy(id = "action_save")
    @iOSXCUITFindBy(accessibility = "Save")
    WebElement saveBtn;

    public void enterTaskName(String text){
        clear(taskNameTxt);
        sendText(taskNameTxt, text);
    }

    public void enterTaskDesc(String text){
        clear(taskDescTxt);
        sendText(taskDescTxt, text);
    }

    public void clickSaveBtn(){
        click(saveBtn);
    }


}
