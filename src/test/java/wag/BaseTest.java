package wag;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected static WebDriver driver;
    protected static User user;
    protected static User invalidUser;

    @BeforeClass
    public static void setUp() {

        System.out.println("Start setUp");

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\entso\\OneDrive\\Desktop\\driver\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://wagwalking.com/");

        String expetedTitle = "WagWalking.com | Trusted Local Dog Walkers, Pet Sitters, Trainers and More";

        String actualTitle = driver.getTitle();

        Assert.assertEquals(expetedTitle, actualTitle);

        user = new User("entsova@gmail.com", "ABC123", "Sarah", "Smith",
                "123-456-7890");

        invalidUser = new User("123456", "mjiuig", "Ika", "Jr", "000-000-9999");
    }

    @AfterClass
    public static void tearDown() {

        System.out.println("Start tearDown");

        driver.quit();
    }
}
