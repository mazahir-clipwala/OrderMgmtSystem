package learnings.by.ali;

public class DBException extends Exception {
	private String faultInfo;
	
	public DBException (String message, String faultInfo) {
		super (message);
		this.faultInfo = faultInfo;
	}

	public String getFaultInfo() {
		return faultInfo;
	}
}
