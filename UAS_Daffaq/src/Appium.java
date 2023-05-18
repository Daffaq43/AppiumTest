import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class Appium extends AppiumTest {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        AndroidDriver<AndroidElement> driver = capabilities();

        driver.findElementById("com.example.calculator:id/button_1").click();
        
        driver.findElementById("com.example.calculator:id/button_2").click();
//        
        driver.findElementById("com.example.calculator:id/button_multiply").click();
//        
        driver.findElementById("com.example.calculator:id/button_5").click();
//        
        driver.findElementById("com.example.calculator:id/button_equal").click();
//        
        driver.findElementById("com.example.calculator:id/button_C").click(); 
//        
        driver.findElementById("com.example.calculator:id/button_8").click();
//
        driver.findElementById("com.example.calculator:id/button_6").click();
//
        driver.findElementById("com.example.calculator:id/button_delete").click();
//
        driver.findElementById("com.example.calculator:id/button_2").click();
//        
        driver.findElementById("com.example.calculator:id/button_plus").click();
//        
        driver.findElementById("com.example.calculator:id/button_1").click();
//        
        driver.findElementById("com.example.calculator:id/button_3").click();
//        
        driver.findElementById("com.example.calculator:id/button_equal").click();

        

    }
}

