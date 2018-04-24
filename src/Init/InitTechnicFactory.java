package Init;

public class InitTechnicFactory {
	
	public static InitTechnic getInitTechnic(String initTechnic) {
		if (initTechnic.equals("Full"))
			return new Full();
		else
			return new Full();
	}
}
