package fillo;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class filloGetField {
	
	public static void main(String[] args) throws FilloException {
		Fillo fillo = new Fillo();
		Connection con = fillo.getConnection("C:/Users/vikramt/Desktop/excel for selenium/test.xlsx");
		
		
		String strQuery = "Select * from Sheet1 where name = 'peter'";
		Recordset  rs = con.executeQuery(strQuery);
		
		while (rs.next()) {
			System.out.println(rs.getField("id"));
			System.out.println(rs.getField("name"));
			System.out.println(rs.getField("age"));
		}
		
		
//		String strQuery = "INSERT INTO sheet1(id,name,age) VALUES('678','UKg','66')";
//		con.executeUpdate(strQuery);
		
//		String strQuery1="Update Sheet1 Set age='32' where ID='1' and name='vikram'"; 
//		con.executeUpdate(strQuery1);

	}

}
