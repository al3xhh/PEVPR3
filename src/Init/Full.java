package Init;

import java.util.ArrayList;
import java.util.Random;

import Models.Tree;

public class Full implements InitTechnic {

	@Override
	public Tree init(int maxDepth, ArrayList<String> terminations, ArrayList<String> functions) {
		Tree tree = new Tree(null, 1, true, false, -1);
		
		get(maxDepth, 1, terminations, functions, tree);
		
		return tree;
	}
	
	private void get(int maxDepth, int depth, ArrayList<String> terminations, ArrayList<String> functions, Tree node) {
		if (depth < maxDepth) {
			String function = functions.get(new Random().nextInt(functions.size()));
			Tree childL = new Tree(node, depth + 1, false, false, 2);
			
			get(maxDepth, depth + 1, terminations, functions, childL);
			node.set_leftChild(childL);
			
			if(!function.equals("NOT")) {
				Tree childR = new Tree(node, depth + 1, false, false, 0);
				get(maxDepth, depth + 1, terminations, functions, childR);
				node.set_rightChild(childR);
			}
			
			if(function.equals("IF")) {
				Tree childC = new Tree(node, depth + 1, false, false, 1);
				get(maxDepth, depth + 1, terminations, functions, childC);
				node.set_centerChild(childC);
			}
			
			node.set_value(function);
		} 
		else {
			node.set_isLeaf(true);
			node.set_value(terminations.get(new Random().nextInt(terminations.size())));
		}
	}
}
