package learnings.by.ali;

import javax.jws.WebService;

@WebService
public class Orders {
	
	public String sendPO (String item, String customer) {
		return "you were successful";
	}
}
