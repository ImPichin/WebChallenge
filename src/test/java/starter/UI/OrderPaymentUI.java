package starter.UI;

import org.openqa.selenium.By;

public class OrderPaymentUI {

    public static By BTN_NEXT = By.id("next_btn");
    public static By TXT_SAFEPAY_USERNAME = By.xpath("//input[@name=\"safepay_username\"]");
    public static By TXT_SAFEPAY_PASSWORD = By.xpath("//input[@name=\"safepay_password\"]");
    public static By BTN_PAY_NOW = By.id("pay_now_btn_SAFEPAY");
    public static By CHECK_BOX_SAVE_CHANGES = By.name("save_safepay");
    public static By TXT_THANK_YOU = By.xpath("//span[@class=\"roboto-regular ng-scope\"]");


}
