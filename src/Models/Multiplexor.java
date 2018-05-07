package Models;

public class Multiplexor {
	
	public boolean getOutput(String control, String values){
		
		return String.valueOf(values.charAt(Integer.valueOf(String.valueOf(Integer.parseInt(control)), 2))).equals("0") ? false : true;
	}
	
}

