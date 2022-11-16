package session;

import browser.FactoryBrowser;
import org.openqa.selenium.WebDriver;
import util.GetPropertiesTodoist;

public class SessionTodoist {

    private static SessionTodoist instance=null;
    private WebDriver browser;
    private SessionTodoist(){
        browser= FactoryBrowser.make(GetPropertiesTodoist.getInstance().getBrowser()).create();
    }

    public static SessionTodoist getInstance(){
        if (instance==null)
            instance=new SessionTodoist();
        return instance;
    }

    public void closeSession(){
        browser.quit();
        instance=null;
    }

    public WebDriver getBrowser() {
        return browser;
    }

    public void acceptAlert() {
        browser.switchTo().alert().accept();
    }


}
