package Mutation;

import Init.InitTechnic;
import Models.Chromosome;

public interface MutationAlgorithm {
	
	public void mutation(Chromosome chromosome, InitTechnic initTechnic);
}
