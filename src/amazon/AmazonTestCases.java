package amazon;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import java.util.concurrent.TimeUnit;

public class AmazonTestCases {
    WebDriver driver;
    public String chromeDriver="webdriver.chrome.driver";
    public String chromeDriverPath="C:\\Users\\yeti\\IdeaProjects\\FirstProject\\LearnJava_WeekendAfternoon_Selenium_NY_Summer2020\\BrowserDriver\\windows\\chromedriver.exe";
    public String url="https://www.amazon.com/";
    String searchButton_Xpath="//*[@id=\"twotabsearchtextbox\"]";
    String element_toSearch="Iphone11 pro cases";
    String buttonSearch="//*[@id=\"nav-search\"]/form/div[2]/div/input";
    String menuXpath="//*[@id=\"nav-hamburger-menu\"]/i";
    String amazonMusic="//*[@id=\"hmenu-content\"]/ul[1]/li[3]/a/div";
    String primeXpath="//*[@id=\"nav-link-prime\"]/span";
    String signInXpath="//*[@id=\"ap_email\"]";
    String userEmail="danyetm1994@gmail.com";
    String continueXpath="//*[@id=\"continue\"]";
    String newReleaseXpath="//*[@id=\"nav-xshop\"]/a[4]";
    String newReleaseElement="//*[@id=\"zg_left_col1\"]/div[2]/div[2]/div/div[2]/a/div[1]/img";
    String languageDropDown="//*[@id=\"icp-nav-flyout\"]/span/span[2]/span";
    String backToTopXpath="//*[@id=\"navBackToTop\"]/div/span";
    String yourAddress="//*[@id=\"glow-ingress-line2\"]";
    String addressElement="//*[@id=\"GLUXZipUpdateInput\"]";
    String addressToSearch="75070";
    String apply="//*[@id=\"GLUXZipUpdate\"]/span/input";
    String checkCart="//*[@id=\"nav-cart\"]/span[2]";
    String womenFashion="//*[@id=\"0uOX5bFIcMyURZF5dB1_CA\"]/div[2]/div/ul/li[4]/span/a/img";
    String country="//*[@id=\"icp-touch-link-country\"]/span[2]";
    String countryDropDown="//*[@id=\"customer-preferences\"]/div/div/div/div[1]/div[2]/span/span/span/span";
    String countryElement="//*[@id=\"icp-selected-country_2\"]/div/div/div[2]/span";
    String countryWebSite="//*[@id=\"a-popover-1\"]/div/div[2]/span[2]/span/span/input";
    String logoLink="//*[@id=\"nav-logo\"]/a/span[1]";
    String amazonCareers="//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[1]/a";
    String careerInput="//*[@id=\"search_typeahead\"]";
    String careerElement="Accounting";
    String careerLocation="//*[@id=\"location-typeahead\"]";
    String locationElement="Plano, Texas";
    String searchCareer="//*[@id=\"search-button\"]/span";
    String getHelp="//*[@id=\"navFooter\"]/div[1]/div/div[7]/ul/li[9]/a";
    String sellOnAmazon="//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[3]/td[1]/a";
    String returns="//*[@id=\"nav-orders\"]/span[1]";
    String secureSignIn="//*[@id=\"a-autoid-0-announce\"]";
    String signInInput="//*[@id=\"ap_email\"]";
    String myEmail="danyetm1994@gmail.com";
    String secureSignContinue="//*[@id=\"continue\"]";
    String bestSellers="//*[@id=\"nav-xshop\"]/a[1]";
    String pressCenter="//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[5]/a";
    String customerService="//*[@id=\"nav-xshop\"]/a[2]";
    String serviceRequest="//*[@id=\"helpsearch\"]";
    String requestElement="question about delivery";
    String sendRequest="//*[@id=\"helpSearchSubmit\"]/span/input";
    String todayDeals="//*[@id=\"nav-xshop\"]/a[3]";
    String gifts="//*[@id=\"nav-xshop\"]/a[5]";
    String wholeFoods="//*[@id=\"nav-xshop\"]/a[6]";
    String theBearGryllsStore="//*[@id=\"nav-swmslot\"]/a";
    String yourOrders="/html/body/div[2]/div[4]/div[1]/div/div[1]/div[1]/a/div/div/div/div[2]/h3";


    public void chrome() {
    System.setProperty(chromeDriver,chromeDriverPath);
    driver = new ChromeDriver();
    driver.navigate().to(url);
    }

    public void searchButton() {
        driver.findElement(By.xpath(searchButton_Xpath)).sendKeys(element_toSearch);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(buttonSearch)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void findMenu() throws InterruptedException {
        driver.findElement(By.xpath(menuXpath)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(amazonMusic)).click();
        Thread.sleep(5000);



    }
    public void searchPrime() throws InterruptedException {
        driver.findElement(By.xpath(primeXpath)).click();
        Thread.sleep(5000);

    }
    public void enterUserName(){
        driver.findElement(By.xpath(signInXpath)).sendKeys(userEmail);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(continueXpath)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    public void findNewRelease(){
        driver.findElement(By.xpath(newReleaseXpath)).findElement(By.xpath(newReleaseElement)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    public void findLanguageDropDown() {
        driver.findElement(By.xpath(languageDropDown)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void searchBackToTopButton() throws InterruptedException {
        driver.findElement(By.xpath(backToTopXpath)).click();
        Thread.sleep(5000);
    }
    public void findyourAddress(){
        driver.findElement(By.xpath(yourAddress)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(addressElement)).sendKeys(addressToSearch);
        driver.findElement(By.xpath(apply)).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    public void checkMyCart() {
        driver.findElement(By.xpath(checkCart)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void searchWomenFashion() {
        driver.findElement(By.xpath(womenFashion)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void searchCountry() {
        driver.findElement(By.xpath(country)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(countryDropDown)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(countryElement)).click();
        driver.findElement(By.xpath(countryWebSite));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    public void checklogoLink() {
        driver.findElement(By.xpath(logoLink)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void searchCareers(){
        driver.findElement(By.xpath(amazonCareers)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(careerInput)).sendKeys(careerElement);
        driver.findElement(By.xpath(careerLocation)).sendKeys(locationElement);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(searchCareer)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    public void findHelp() {
        driver.findElement(By.xpath(getHelp)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void searchSellOnAmazon() {
        driver.findElement(By.xpath(sellOnAmazon)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void searchReturns() {
        driver.findElement(By.xpath( returns)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void searchSecureSignIn(){
        driver.findElement(By.xpath(secureSignIn)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(signInInput)).sendKeys(myEmail);
        driver.findElement(By.xpath(secureSignContinue)).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    public void searchBestSellers() {
        driver.findElement(By.xpath( bestSellers)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void findPressCenter() {
        driver.findElement(By.xpath(pressCenter)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void searchCustomerService(){
        driver.findElement(By.xpath(customerService)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(serviceRequest)).sendKeys(requestElement);
        driver.findElement(By.xpath(sendRequest)).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    public void searchGifts() {
        driver.findElement(By.xpath(gifts)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void searchWholeFoods() {
        driver.findElement(By.xpath(wholeFoods)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void searchTheBearGryllsStore() {
        driver.findElement(By.xpath(theBearGryllsStore)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void findYourOrders() {
        driver.findElement(By.xpath(yourOrders)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void searchTodayDeals() {
        driver.findElement(By.xpath(todayDeals)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @AfterMethod
    public void closeBrowser() {

        driver.close();
    }
}


