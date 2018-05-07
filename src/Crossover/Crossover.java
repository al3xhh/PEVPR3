package Crossover;

import Models.Chromosome;
import Models.Population;
import Models.Tree;

public class Crossover implements CrossoverAlgorithm {

	@Override
	public void crossover(Population population, double crossOver) {
		int crossSelection[] = new int[population.getPopultionSize()];
		int selectedNum = 0;
		
		for(int i = 0; i < population.getPopultionSize(); i ++) {
			if(Math.random() < crossOver) {
				crossSelection[selectedNum] = i;
				selectedNum++;
			}
		}
		
		if(selectedNum % 2 == 1) selectedNum --;
		
		Chromosome parent1, parent2;
		
		for(int i = 0; i < selectedNum; i+= 2) {
			parent1 = population.getSingle(crossSelection[i]);
			parent2 = population.getSingle(crossSelection[i + 1]);
			
			Tree nodeP1 = parent1.getRandomNode();
			Tree nodeP2 = parent2.getRandomNode();
			
			if (nodeP1.get_position() == 0)
				nodeP1.get_father().set_leftChild(nodeP2);
			else if (nodeP1.get_position() == 1)
				nodeP1.get_father().set_centerChild(nodeP2);
			else
				nodeP1.get_father().set_rightChild(nodeP2);
			
			if (nodeP2.get_position() == 0)
				nodeP2.get_father().set_leftChild(nodeP1);
			else if (nodeP2.get_position() == 1)
				nodeP2.get_father().set_centerChild(nodeP1);
			else
				nodeP1.get_father().set_rightChild(nodeP1);
			
			parent1.setAptitude(parent1.test());
			parent2.setAptitude(parent2.test());
			
		}
	}

}
