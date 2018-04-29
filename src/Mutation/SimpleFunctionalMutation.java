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
		
		functionalNode.set_value(newFunctionalValue);
	}

}
