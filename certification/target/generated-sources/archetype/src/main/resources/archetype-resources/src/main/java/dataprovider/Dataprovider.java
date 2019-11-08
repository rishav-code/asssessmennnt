#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dataprovider;

import org.testng.annotations.DataProvider;

import ${package}.constant.FilePath;
import ${package}.util.ProvideData;
/**
 * DataProvider class
 * 
 * @author rishav.kumar
 *
 */
public class Dataprovider {
	@DataProvider(name = "Dpdninput")
	public Object[][] getData() {
		ProvideData provideData = new ProvideData(FilePath.TESTDATA_FILE, 0);
		Object[][] getData = provideData.provideData();
		return getData;
	}


}
