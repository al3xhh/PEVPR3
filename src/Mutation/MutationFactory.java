package Mutation;

import Init.Full;
import Init.InitTechnic;

public class MutationFactory {
	
	public static MutationAlgorithm getMutationAlgorithm(String algorithm) {
		if (algorithm.equals("Simple Terminal"))
			return new SimpleTerminalMutation();
		else if (algorithm.equals("Simple Functional"))
			return new SimpleFunctionalMutation();
		else if (algorithm.equals("Tree"))
			return new TreeMutation();
		else if (algorithm.equals("Permutation")){
			return new Permutation();
		}
		else 
			return null;
	}
}
