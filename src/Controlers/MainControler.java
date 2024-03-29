package Controlers;

import java.util.ArrayList;

import Crossover.Crossover;
import Crossover.CrossoverAlgorithm;
import Init.InitTechnic;
import Init.InitTechnicFactory;
import Models.Chromosome;
import Models.GeneticAlgorithm;
import Models.Population;
import Mutation.MutationAlgorithm;
import Mutation.MutationFactory;
import Selection.SelectionAlgorithm;
import Selection.SelectionFactory;

import Views.Observer;

/**
 * Controller class.
 * 
 * @author Group 06
 *
 */
public class MainControler {
	
	/**
	 * Genetic algorithm attribute.
	 */
	private GeneticAlgorithm _ga;
	
	/**
	 * Constructor.
	 */
	public MainControler() {
		_ga = new GeneticAlgorithm();
	}
	
	/**
	 * Set observer.
	 * 
	 * @param observer which represents main view.
	 */
	public void setObserver(Observer observer) {
		_ga.setObserver(observer);
	}
	
	/**
	 * Run the genetic algorithm.
	 * 
	 * @param populationSize population size.
	 * @param generationNumber number of generation to iterate.
	 * @param selection selection's algorithm type.
	 * @param cross cross %.
	 * @param mutation mutation %.
	 * @param function problem to maximize of minimize.
	 * @param elitism elitism %:
	 * @param precision precision %.
	 * @param n iterations number for problem 5.
	 * @param truncation percentage of truncation selection.
	 */
	public void run(int populationSize, int generationNumber, String selection, int maxDepth, double truncation, int tournamentN, double cross, String initTechnic, 
					String mutationAlgorithm, double mutation, String mutationInitTechnic, double elitism, ArrayList<String> operators, double weight) {
		
		Chromosome []chromosomes = new Chromosome[populationSize];
		
		for(int i = 0; i < populationSize; i++)
			chromosomes[i] = new Chromosome(MutationFactory.getMutationAlgorithm(mutationAlgorithm), maxDepth, operators, InitTechnicFactory.getInitTechnic(initTechnic), weight);
		
		Population population = new Population(populationSize, generationNumber, elitism, chromosomes, "min");
		SelectionAlgorithm selectionAlgorithm = SelectionFactory.getSelectionAlgorithm(selection, truncation, tournamentN);
		
		_ga.setGenerationNumber(generationNumber);
		_ga.setPopulation(population);
		_ga.setSelectionAlgorithm(selectionAlgorithm);
		_ga.setCrossOverAlgorithm(new Crossover());
		_ga.setCross(cross);
		_ga.setMutation(mutation);
		_ga.run();
	}
}
