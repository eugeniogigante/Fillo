import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.*;
//https://codoid.com/fillo/
public class Test {

	public static void main(String[] args) throws FilloException {
		// TODO Auto-generated method stub
		Fillo fillo=new Fillo();
		Connection connection=(Connection) fillo.getConnection("C:/tmp/Books.xlsx");
		String strQuery="Select * from Sheet1 where ID=1 and name='Hanley Jodie'";
		Recordset recordset=connection.executeQuery(strQuery);
		 
		while(recordset.next()){
		System.out.println(recordset.getField("Email"));
		}
		 
		recordset.close();
		connection.close();

	}

	/*
	 * Fillo fillo=new Fillo();
Connection connection=fillo.getConnection("C:\\Test.xlsx");
String strQuery="Update Sheet1 Set Country='US' where ID=100 and name='John'";
 
connection.executeUpdate(strQuery);
 
connection.close();
	 * 
	 */
	
	/*
	 * 
	 * 
	 * Fillo fillo=new Fillo();
Connection connection=fillo.getConnection("C:\\Test.xlsx");
String strQuery="INSERT INTO sheet4(Name,Country) VALUES('Peter','UK')";
 
connection.executeUpdate(strQuery);
 
connection.close();
	 */
}
