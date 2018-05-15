package Mutation;

import Init.InitTechnic;
import Models.Chromosome;
import Models.Tree;

public class SimpleFunctionalMutation implements MutationAlgorithm {

	@Override
	public void mutation(Chromosome chromosome, InitTechnic initTechnic) {
		Tree functionalNode = chromosome.getRandomFuncionalNode();
		String newFunctionalValue = chromosome.getRandomFunction();
		
		while (newFunctionalValue.equals(functionalNode.get_value()))
				newFunctionalValue = chromosome.getRandomFunction();
		
		if (newFunctionalValue.equals("IF")){
			Tree childAux = new Tree(functionalNode, functionalNode.get_depth() + 1, false, false, 1);
			functionalNode.set_centerChild(initTechnic.initMutation(chromosome.get_maxDepth(), chromosome.get_terminals(), chromosome.get_functions(), childAux));
			
			if (functionalNode.get_rightChild() == null){
				childAux = new Tree(functionalNode, functionalNode.get_depth() + 1, false, false, 2);
				functionalNode.set_rightChild(initTechnic.initMutation(chromosome.get_maxDepth(), chromosome.get_terminals(), chromosome.get_functions(), childAux));
			}
		}
		if (newFunctionalValue.equals("AND") || newFunctionalValue.equals("OR")){
			functionalNode.set_centerChild(null);
			
			if (functionalNode.get_rightChild() == null){
				Tree childAux = new Tree(functionalNode, functionalNode.get_depth() + 1, false, false, 2);
				functionalNode.set_rightChild(initTechnic.initMutation(chromosome.get_maxDepth(), chromosome.get_terminals(), chromosome.get_functions(), childAux));
			}
		}
		if (newFunctionalValue.equals("NOT")){
			functionalNode.set_centerChild(null);
			functionalNode.set_rightChild(null);
		}
		
		functionalNode.set_value(newFunctionalValue);
	}

}
