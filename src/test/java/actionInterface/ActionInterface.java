package actionInterface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface ActionInterface {
	
	public void click(WebDriver ldriver, WebElement ele);
	public String getTitle(WebDriver driver);
}
	