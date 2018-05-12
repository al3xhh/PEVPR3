package Init;

import java.util.ArrayList;

import Models.Tree;

public interface InitTechnic {
	
	public Tree init(int maxDepth, ArrayList<String> terminals, ArrayList<String> functions);
	
	public Tree initMutation(int maxDepth, ArrayList<String> terminations, ArrayList<String> functions, Tree node);
}
