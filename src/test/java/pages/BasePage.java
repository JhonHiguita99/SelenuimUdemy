package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
public class BasePage {
    /*
     * Declaración de una variable estática 'driver' de tipo WebDriver
     * Esta variable va a ser compartida por todas las instancias de BasePage y sus subclases
     */
    protected static WebDriver driver;
    /*
     * Declaración de una variable de instancia 'wait' de tipo WebDriverWait.
     * Se inicializa inmediatamente con una instancia de WebDriverWait utilizando el 'driver' estático
     * WebDriverWait se usa para poner esperas explícitas en los elementos web
     */
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    /*
     * Configura el WebDriver para Chrome usando WebDriverManager.
     * WebDriverManager va a estar descargando y configurando automáticamente el driver del navegador
     */
    static{
        WebDriverManager.chromedriver().setup();
        //Inicializa la variable estática 'driver' con una instancia de ChromeDriver
        driver = new ChromeDriver();

    }
    /*
     * Este es el constructor de BasePage que acepta un objeto WebDriver como argumento.
     */
    public BasePage(WebDriver driver){

        BasePage.driver = driver;
    }
    //Método estático para navegar a una URL.
    public static void NavigateTo(String url){
        driver.get(url);
        driver.manage().window().maximize();

    }
    public static void closeBrowser(){
        driver.quit();
    }
    //Encuentra y devuelve un Web Element en la pagina utilizando un locator Xpath
    //Esperando a que este presente en el DOM
    private WebElement Find(String locator){
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }
    public void clickElement(String locator){

        Find(locator).click();
    }
    //Escribir en un web element algun texto
    public void Write(String locator,String keysToSend){
        Find(locator).clear();
        Find(locator).sendKeys(keysToSend);
    }
    public void selectFromDropdownByValue(String locator, String value){
        Select dropdown = new Select(Find(locator));
        dropdown.selectByValue(value);
    }

    public void selectFromDropdownByIndex(String locator, Integer value){
        Select dropdown = new Select(Find(locator));
        dropdown.selectByIndex(value);
    }

    public int dropdownSize(String locator){
        Select dropdown = new Select(Find(locator));
        List<WebElement> dropdownOption = dropdown.getOptions();
        return dropdownOption.size();
    }

    public List<String>getDropdownValues(String locator){
        Select dropdown = new Select(Find(locator));

        List<WebElement> dropdownOptions = dropdown.getOptions();
        List<String> values = new ArrayList<>();
        for (WebElement option : dropdownOptions){
            values.add(option.getText());
        }
        return values;

    }
}
