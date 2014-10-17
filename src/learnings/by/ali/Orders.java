package learnings.by.ali;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService (name="OrdersWS", serviceName = "MyOrders", portName = "MyOrdersPort", targetNamespace = "www.myorder.com")
public class Orders {
	List<String> allPOs = new ArrayList<String>();
	{
		allPOs.add ("Temp 1");
		allPOs.add ("Temp 2");
		allPOs.add ("Temp 3");
	}
	
	/*@WebResult (name = "yourPONumber")
	public String sendPO (@WebParam (name = "products") String item, @WebParam (name = "custName")String customer) {
		String poNumber = new BigInteger(130, new SecureRandom()).toString ();
		
		allPOs.add (poNumber);
		
		return poNumber;
	}*/
	
	@WebMethod (action = "displayAllPOs", operationName = "displayAllPOs")
	@WebResult (name = "listOfPOs")
	public List<String> showAllPOs () throws DBException {
		int ii = 1;
		if (ii == 0) {
			throw new DBException("DB Down", "Your request could not be processed.");
		}
		return allPOs;
	}
	
	/*public String sendPOv2 (PurchaseOrder order) {
		String poNumber = new BigInteger(130, new SecureRandom()).toString ();
		
		allPOs.add (poNumber);
		
		return poNumber;
		
	}*/
	
	
}
