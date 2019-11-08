package com.atmecs.scripts;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;

import com.atmecs.constant.FilePath;
import com.atmecs.constant.TimeOut;
import com.atmecs.testbase.TestBase;
import com.atmecs.util.ReadProp;

public class DemoScript extends TestBase {
	Properties baseClass;
	//PhpFlow flow;
	ReadProp property ;
	String url;
	@BeforeClass
	public void urlqw() {
		baseClass=ReadProp.loadProperty(FilePath.CONFIG_FILE);
		url=baseClass.getProperty("url2");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TimeOut.TIMEOUT_INSECONDS, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TimeOut.IMPLICIT_TIMEOUT_INSECONDS, TimeUnit.SECONDS);

}
}