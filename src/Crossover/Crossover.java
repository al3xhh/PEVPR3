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
			
			while(nodeP1.is_isRoot())
				nodeP1 = parent1.getRandomNode();
			
			while(nodeP2.is_isRoot())
				nodeP2 = parent2.getRandomNode();
			
			nodeP2.set_depth(nodeP1.get_depth());
			nodeP1.set_depth(nodeP2.get_depth());
			
			if (nodeP1.get_position() == 0){
				nodeP1.get_father().set_leftChild(nodeP2);
				nodeP2.set_position(0);
			}
			else if (nodeP1.get_position() == 1){
				nodeP1.get_father().set_centerChild(nodeP2);
				nodeP2.set_position(1);
			}
			else{
				nodeP1.get_father().set_rightChild(nodeP2);
				nodeP2.set_position(2);
			}
			
			
			nodeP1.set_nodesNumber(nodeP1.get_nodesNumber() + (nodeP2.get_nodesNumber() - nodeP1.get_nodesNumber()));
			
			if (nodeP2.get_position() == 0){
				nodeP2.get_father().set_leftChild(nodeP1);
				nodeP1.set_position(0);
			}
			else if (nodeP2.get_position() == 1){
				nodeP2.get_father().set_centerChild(nodeP1);
				nodeP1.set_position(1);
			}
			else {
				nodeP2.get_father().set_rightChild(nodeP1);
				nodeP1.set_position(2);
			}
			
			nodeP2.set_nodesNumber(nodeP2.get_nodesNumber() + (nodeP1.get_nodesNumber() - nodeP2.get_nodesNumber()));
			
			parent1.setAptitude(parent1.test());
			parent2.setAptitude(parent2.test());
			
		}
	}

}
