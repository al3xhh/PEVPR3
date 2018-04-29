package Mutation;

import Init.InitTechnic;
import Models.Chromosome;
import Models.Tree;

public class SimpleTerminalMutation implements MutationAlgorithm {

	@Override
	public void mutation(Chromosome chromosome, InitTechnic initTechnic) {
		Tree terminalNode = chromosome.getRandomTerminalNode();
		String newTerminalValue = chromosome.getRandomTerminal();
		
		while (newTerminalValue.equals(terminalNode.get_value()))
			newTerminalValue = chromosome.getRandomTerminal();
		
		terminalNode.set_value(newTerminalValue);
	}

}