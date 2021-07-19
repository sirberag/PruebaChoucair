package pruebas.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PageEmpleoChoucair extends PageObject{

    @FindBy(xpath = "//*[contains(text(),'Analista de Pruebas')]")
    private List<WebElementFacade> lblEmpleos;

    public int getEmpleosAnalistaPruebas() {
        for (int i=0;lblEmpleos.size()>i;i++)
        {
            withAction().moveToElement(lblEmpleos.get(i)).build().perform();
        }
        return lblEmpleos.size();
    }

}
