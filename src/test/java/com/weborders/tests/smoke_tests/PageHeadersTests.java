package com.weborders.tests.smoke_tests;

import com.weborders.pages.LoginPage;
import com.weborders.pages.OrderPage;
import com.weborders.pages.ViewAllOrdersPage;
import com.weborders.pages.ViewAllProductsPage;
import com.weborders.utilities.ApplicationConstants;
import com.weborders.utilities.ConfigurationReader;
import com.weborders.utilities.TestBase;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PageHeadersTests extends TestBase {

    /*
     LoginPage loginPage = new LoginPage();
        ViewAllProductsPage viewAllProductsPage = new ViewAllProductsPage();
        ViewAllOrdersPage viewAllOrdersPage = new ViewAllOrdersPage();
        OrderPage orderPage = new OrderPage();

        loginPage.login(ConfigurationReader.getProperty("username"),
                ConfigurationReader.getProperty("password"));
        assertEquals(viewAllOrdersPage.header.getText(), ApplicationConstants.LIST_OF_ALL_ORDERS);
        viewAllOrdersPage.viewAllProductsLink.click();
        assertEquals(viewAllProductsPage.header.getText(), ApplicationConstants.LIST_OF_ALL_PRODUCTS);
        viewAllProductsPage.orderLink.click();
        assertEquals(orderPage.header.getText(), ApplicationConstants.ORDER);

     */
    @Test
    public void pageHeadersTest(){

        pages.login().login(ConfigurationReader.getProperty("username"),
                ConfigurationReader.getProperty("password"));
        assertEquals(pages.viewAllOrders().header.getText(), ApplicationConstants.LIST_OF_ALL_ORDERS);
        pages.viewAllOrders().viewAllProductsLink.click();
        assertEquals(pages.viewAllProducts().header.getText(), ApplicationConstants.LIST_OF_ALL_PRODUCTS);
        pages.viewAllProducts().orderLink.click();
        assertEquals(pages.order().header.getText(), ApplicationConstants.ORDER);


    }

}




