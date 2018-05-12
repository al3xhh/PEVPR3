package Mutation;

import Init.InitTechnic;
import Models.Chromosome;
import Models.Tree;

public class TreeMutation implements MutationAlgorithm {

	@Override
	public void mutation(Chromosome chromosome, InitTechnic initTechnic) {
		Tree node = chromosome.getRandomNode();
		
		while (node.is_isRoot())
			node = chromosome.getRandomNode();
		
		Tree father = node.get_father();
		
		if (node.get_position() == 0)
			father.set_leftChild(initTechnic.initMutation(chromosome.get_maxDepth(), chromosome.get_terminals(), chromosome.get_functions(), node));
		else if (node.get_position() == 1)
			father.set_centerChild(initTechnic.initMutation(chromosome.get_maxDepth(), chromosome.get_terminals(), chromosome.get_functions(), node));
		else 
			father.set_rightChild(initTechnic.initMutation(chromosome.get_maxDepth(), chromosome.get_terminals(), chromosome.get_functions(), node));	
	}
}
