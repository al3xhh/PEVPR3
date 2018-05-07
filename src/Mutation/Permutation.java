package Mutation;

import Init.InitTechnic;
import Models.Chromosome;
import Models.Tree;

public class Permutation implements MutationAlgorithm {

	@Override
	public void mutation(Chromosome chromosome, InitTechnic initTechnic) {
		Tree node = chromosome.getRandomNode();
		
		while (node.get_value().equals("NOT"))
			node = chromosome.getRandomNode();
		
		Tree aux = node.get_leftChild();
		node.set_leftChild(node.get_rightChild());
		node.set_rightChild(aux);
	}

}
