package Init;

import java.util.Random;

import Models.Tree;

public class Full implements InitTechnic {

	@Override
	public Tree init(int maxDepth, String[] terminations, String[] functions) {
		Tree tree = new Tree(null, 1, true, false, -1);
		
		get(maxDepth, 1, terminations, functions, tree);
		
		return tree;
	}
	
	private void get(int maxDepth, int depth, String[] terminations, String[] functions, Tree node) {
		if (depth < maxDepth) {
			String function = functions[new Random().nextInt(functions.length) - 1];
			Tree childR = new Tree(node, depth + 1, false, false, 2);
			
			get(maxDepth, depth + 1, terminations, functions, childR);
			
			if(!function.equals("NOT")) {
				Tree childL = new Tree(node, depth + 1, false, false, 0);
				get(maxDepth, depth + 1, terminations, functions, childL);
			}
			
			if(function.equals("IFF")) {
				Tree childC = new Tree(node, depth + 1, false, false, 1);
				get(maxDepth, depth + 1, terminations, functions, childC);
			}
			
			node.set_value(function);
		} 
		else {
			node.set_isLeaf(true);
			node.set_value(terminations[new Random().nextInt(terminations.length) - 1]);
		}
	}
}
