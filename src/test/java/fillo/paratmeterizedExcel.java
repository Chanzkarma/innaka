package fillo;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;

public class paratmeterizedExcel {

	public static void main(String[] args) throws FilloException {

		Fillo fillo = new Fillo();
		Connection con = fillo.getConnection("C:/Users/vikramt/Desktop/excel for selenium/test.xlsx");

//		String strQuery = "INSERT INTO sheet1(id,name,age) VALUES('678','UKg','66')";
//		con.executeUpdate(strQuery);
		
		String strQuery1="Update Sheet1 Set age='32' where ID='1' and name='vikram'"; 
		con.executeUpdate(strQuery1);

//		String strQuery2="Delete into Sheet1  "
	}
}