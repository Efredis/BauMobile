package com.Baumobile;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class BauMobileTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		//Declaración de variables
		WebDriver driver;
		DesiredCapabilities cap = new DesiredCapabilities();
		
		//Declaración de Capabilities
		cap.setCapability("deviceName", "GalaxyS3");
		cap.setCapability("platformName", "Android");
		cap.setCapability("noReset", true);
		cap.setCapability("app", "C:\\TestApk\\Android-NativeDemoApp-0.2.1.apk");
		cap.setCapability("appPackage", "com.wdiodemoapp");
		cap.setCapability("noSign", true);
		cap.setCapability("autoGrantPermissions", true);
		
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Login\"]/android.view.View/android.widget.TextView\r\n")).click();
		System.out.println("Se hace click al ícono de login");
		Thread.sleep(2000);
		
		//Se realiza el SignUp
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"button-sign-up-container\"]/android.view.View/android.widget.TextView\r\n")).click();
		System.out.println("Se hace click al signup");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input-email\"]")).clear();
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input-email\"]")).sendKeys("Efredis@gmail.com");
		System.out.println("Se ingresa el email del usuario a registrar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input-password\"]")).clear();
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input-password\"]")).sendKeys("1deMarzo");
		System.out.println("Se ingresa el password que registrará el usuario");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input-repeat-password\"]")).clear();
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input-repeat-password\"]")).sendKeys("1deMarzo");
		System.out.println("Se ingresa la confirmación del password que registrará el usuario");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"button-SIGN UP\"]/android.view.View/android.widget.TextView\r\n")).click();
		System.out.println("Se hace click al boton de SignIn");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.Button\r\n")).click();
		System.out.println("Se hace click al botón OK de confirmación de registro");
		Thread.sleep(2000);
		
		//Se realiza el Login
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"button-login-container\"]/android.view.View/android.widget.TextView\r\n")).click();
		System.out.println("Se hace click al login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input-email\"]")).clear();
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input-email\"]")).sendKeys("Efredis@gmail.com");
		System.out.println("Se ingresa el email del usuario registrado");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input-password\"]")).clear();
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input-password\"]")).sendKeys("1deMarzo");
		System.out.println("Se ingresa el password registrado");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"button-LOGIN\"]/android.view.View")).click();
		System.out.println("Se hace click al botón del login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.Button\r\n")).click();
		System.out.println("Se hace click al botón OK de confirmación de ingreso");
		Thread.sleep(2000);
		
		//Se rellena el formulario
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Forms\"]/android.view.View/android.widget.TextView\r\n")).click();
		System.out.println("Click al icono de Forms");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"text-input\"]")).clear();
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"text-input\"]")).sendKeys("Bienvenido al cuarto piso");
		System.out.println("Se ingresa un texto libre solicitado");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Switch[@content-desc=\"switch\"]")).click();
		System.out.println("Se hace click al suiche de activación");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"select-Dropdown\"]")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[2]\r\n")).click();
	    System.out.println("Se elige la segunda opción de la lista");
		Thread.sleep(2000);			
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"button-Active\"]/android.view.View/android.widget.TextView\r\n")).click();
		System.out.println("Se hace click al botón de activación");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.Button[3]\r\n")).click();
		System.out.println("Se hace click al botón OK");
		Thread.sleep(2000);
		
		//Sección WebView
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"WebView\"]/android.view.View/android.widget.TextView")).click();
		System.out.println("Se hace click al ícono de WebView");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Search\"]")).click();
		System.out.println("Se hace click a la 'lupa' de buscar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"text-input\"]")).clear();
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Search\"]")).click();
		System.out.println("Se hace click a la 'lupa' de buscar");
		Thread.sleep(2000);

	
		driver.quit();
	}
	
	

}

