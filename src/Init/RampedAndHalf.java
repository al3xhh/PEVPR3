package Init;

import java.util.ArrayList;
import java.util.Random;

import Models.Tree;

public class RampedAndHalf implements InitTechnic {
	
	@Override
	public Tree init(int maxDepth, int depth, ArrayList<String> terminations, ArrayList<String> functions) {
		Tree tree = new Tree(null, depth, true, false, -1);
		
		get(maxDepth, depth, terminations, functions, tree);
		
		return tree;
	}
	
	public Tree initMutation(int maxDepth, ArrayList<String> terminations, ArrayList<String> functions, Tree node){
		Tree tree = new Tree(node.get_father(), node.get_depth(), false, false, node.get_position());
		
		get(maxDepth, node.get_depth(), terminations, functions, tree);
		
		return tree;
	}
	
	private void get(int maxDepth, int depth, ArrayList<String> terminations, ArrayList<String> functions, Tree node) {
		if (depth < maxDepth) {
			InitTechnic init;
			
			if(depth < (maxDepth / 2))
				init = new Full();
			else
				init = new Grow();
			
			String function = functions.get(new Random().nextInt(functions.size()));
			Tree childL = init.init(maxDepth, depth, terminations, functions);
			Tree childR = null, childC = null;
			
			node.set_value(function);
			node.set_leftChild(childL);
			
			if(!function.equals("NOT")) {
				childR = init.init(maxDepth, depth, terminations, functions);
				node.set_rightChild(childR);
			}
			
			if(function.equals("IF")) {
				childC = init.init(maxDepth, depth, terminations, functions);
				node.set_centerChild(childC);
				node.set_nodesNumber(childL.get_nodesNumber() + childC.get_nodesNumber() + childR.get_nodesNumber());
			}		
			else if (!function.equals("NOT"))
				node.set_nodesNumber(childL.get_nodesNumber() + childR.get_nodesNumber());
			else
				node.set_nodesNumber(childL.get_nodesNumber());
			
		} 
		else {
			node.set_isLeaf(true);
			node.set_nodesNumber(1);
			node.set_value(terminations.get(new Random().nextInt(terminations.size())));
		}
	}
}
