package amazon;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonTestCasesTest extends AmazonTestCases{

    @BeforeMethod
    public void testChrome() {
        chrome();
    }
    @Test
    public void testsearchButton() {
        searchButton();
    }
    @Test
    public void testfindMenu() throws InterruptedException {
        findMenu();
    }
    @Test
    public void testsearchPrime() throws InterruptedException {
        searchPrime();

    }
    @Test
    public void testenterUserName() {
        enterUserName();

    }
    @Test
    public void testfindNewRelease(){
        findNewRelease();
    }
    @Test
    public void testfindLanguageDropDown(){
    findLanguageDropDown();
    }
    @Test
    public void testsearchBackToTopButton() throws InterruptedException {
        searchBackToTopButton();
    }
    @Test
    public void testfindyourAddress(){
        findyourAddress();
    }
    @Test
    public void testcheckMyCart() {
        checkMyCart();
    }
    @Test
    public void testsearchWomenFashion() {
        searchWomenFashion();
    }
    @Test
    public void testsearchCountry() {
        searchCountry();
    }
    @Test
    public void testchecklogoLink() {
        checklogoLink();
    }
    @Test
    public void testsearchCareers(){
        searchCareers();


    }
    @Test
    public void testfindHelp() {
        findHelp();
    }
    @Test
    public void testsearchSellOnAmazon() {
        searchSellOnAmazon();
    }
    @Test
    public void testsearchReturns() {
        searchReturns();
    }
    @Test
    public void testsearchSecureSignIn(){
        searchSecureSignIn();

    }
    @Test
    public void testsearchBestSellers() {
        searchBestSellers();
    }
    @Test
    public void testfindPressCenter() {
        findPressCenter();
    }
    @Test
    public void testsearchCustomerService(){
        searchCustomerService();
    }
    @Test
    public void testsearchGifts() {
        searchGifts();
    }
    @Test
    public void testsearchWholeFoods() {
        searchWholeFoods();
    }
    @Test
    public void testsearchTheBearGryllsStore() {
        searchTheBearGryllsStore();
    }@Test
    public void testfindYourOrders() {
        findYourOrders();
    }@Test
    public void testsearchTodayDeals() {
        searchTodayDeals();
    }
}