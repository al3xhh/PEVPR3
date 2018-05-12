package Init;

public class InitTechnicFactory {
	
	public static InitTechnic getInitTechnic(String initTechnic) {
		if (initTechnic.equals("Full"))
			return new Full();
		else if (initTechnic.equals("Grow"))
			return new Grow();
		else
			return null;//new Full();
	}
}
