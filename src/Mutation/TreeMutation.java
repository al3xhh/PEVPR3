package Mutation;

import Init.InitTechnic;
import Models.Chromosome;
import Models.Tree;

public class TreeMutation implements MutationAlgorithm {

	@Override
	public void mutation(Chromosome chromosome, InitTechnic initTechnic) {
		Tree node = chromosome.getRandomNode();
		Tree father = node.get_father();
		
		while (node.is_isRoot())
			node = chromosome.getRandomNode();
		
		if (node.get_position() == 0)
			father.set_leftChild(initTechnic.init(chromosome.get_maxDepth() - node.get_depth(), chromosome.get_terminals(), chromosome.get_functions()));
		else if (node.get_position() == 1)
			father.set_centerChild(initTechnic.init(chromosome.get_maxDepth() - node.get_depth(), chromosome.get_terminals(), chromosome.get_functions()));
		else 
			father.set_rightChild(initTechnic.init(chromosome.get_maxDepth() - node.get_depth(), chromosome.get_terminals(), chromosome.get_functions()));
		
	}

}
