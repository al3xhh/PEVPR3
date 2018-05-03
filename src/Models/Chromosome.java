package Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import Mutation.MutationAlgorithm;

/**
 * Abstract class which represents a chromosome.
 * 
 * @author Group 06.
 *
 */
public class Chromosome {
	
	/**
	 * Boolean matrix, in each position it has an array with alleles.
	 */
	private Tree _gens;
	
	/**
	 *  Integer array with the length of each alleles array.
	 */
	private static final int _length = 26;
	
	/**
	 * Chromosome aptitude.
	 */
	private double _aptitude;
	
	/**
	 * Chromosome score.
	 */
	private double _score;
	
	/**
	 * Chromosome aggregate score.
	 */
	private double _aggregateSocore;
	
	/**
	 * 
	 */
	private MutationAlgorithm _mutation;
	
	private int _maxDepth;
	
	private static ArrayList<String> _terminals = new ArrayList<String>() {{
		add("A0");
		add("A1");
		add("D0");
		add("D1");
		add("D2");
		add("D3");
	}};
	
	private static ArrayList<String> _functions = new ArrayList<String>() {{
		add("AND");
		add("OR");
		add("NOT");
		add("IF");
	}};
	
	public Chromosome(MutationAlgorithm mutation, int maxDepth, ArrayList<String>functions) {
		_mutation = mutation;
 		//_gens = new char[_length];
 		_maxDepth = maxDepth;
 		_functions = functions;
	}
	
	public int get_maxDepth() {
		return _maxDepth;
	}

	public void set_maxDepth(int _maxDepth) {
		this._maxDepth = _maxDepth;
	}

	public Chromosome() {
	}
	
	/**
	 * Initialize chromosome with random values.
	 */
	public void init() {
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random r = new Random();
		
		for (int i = 0; i < _length; i++) {
			int index = r.nextInt(alphabet.length());
			
			//_gens[i] = alphabet.charAt(index);
			alphabet = alphabet.replace(String.valueOf(alphabet.charAt(index)), "");
		}
	}

	/**
	 * Mutate the chromosome.
	 * 
	 * @param mutation mutation %.
	 */
	public void mutation(double mutation) {
		//if(Math.random() < mutation)
			//_mutation.mutation(this);
	}
	
		
	/**
	 * 
	 */
	public char[] cloneGens() {
		char []ret = new char[_length];
		
		//for(int i = 0; i < _length; i++)
			//ret[i] = _gens[i];
		
		return ret;
	}
	
	/**
	 * Create new child of each chromosome type.
	 * 
	 * @return new chromosome.
	 */
	public Chromosome getChild() {
		return new Chromosome(_mutation, _maxDepth, _functions);
	}
	
	/**
	 * Test the chromosome to calculate the aptitude.
	 * 
	 * @return chromosome aptitude.
	 */
	public double test() {
		return 0.0;
	}
	
	/**
	 * Calculate the phenotype.
	 * 
	 * @return chromosome phenotype.
	 */
	public String getPhenotype() {
		return "";		
	}

	/**
	 * Clone the chromosome.
	 */
	public Chromosome clone() {
		Chromosome chromosome = new Chromosome(_mutation, _maxDepth, _functions);
		char []gens = new char[_length];
		
		chromosome.setAggregateSocore(_aggregateSocore);
		chromosome.setAptitude(_aptitude);
		chromosome.setScore(_score);
		
		//for(int i = 0; i < _length; i++)
		//	gens[i] = _gens[i];
		
		//chromosome.setGens(gens);
		
		return chromosome;
	}
	
	public Tree getRandomTerminalNode(){
		ArrayList<Tree> nodes = new ArrayList<Tree>();
		Tree randomNode = null;
		
		getInOrder(nodes, _gens);
		
		randomNode = nodes.get(new Random().nextInt(nodes.size()));
		
		while (!_terminals.contains(randomNode.get_value()))
			randomNode = nodes.get(new Random().nextInt(nodes.size()));
		
		
		return randomNode;
	}
	
	public Tree getRandomFuncionalNode(){
		ArrayList<Tree> nodes = new ArrayList<Tree>();
		Tree randomNode = null;
		
		getInOrder(nodes, _gens);
		
		randomNode = nodes.get(new Random().nextInt(nodes.size()));
		
		while (!_functions.contains(randomNode.get_value()))
			randomNode = nodes.get(new Random().nextInt(nodes.size()));
		
		return randomNode;
	}
	
	public Tree getRandomNode(){
		ArrayList<Tree> nodes = new ArrayList<Tree>();
		Tree randomNode = null;
		
		getInOrder(nodes, _gens);
		
		randomNode = nodes.get(new Random().nextInt(nodes.size()));

		
		return randomNode;
	}
	
	private void getInOrder(ArrayList<Tree> inOrder, Tree tree){
		if (tree.is_isLeaf())
			inOrder.add(tree);
		else {
			//Added the left and center soon
			if (tree.get_leftChild() != null)
				getInOrder(inOrder, tree.get_leftChild());
			if (tree.get_centerChild() != null)
				getInOrder(inOrder, tree.get_centerChild());
			
			//added the current father
			inOrder.add(tree);
			
			//added de rigth son
			if (tree.get_rightChild() != null)
				getInOrder(inOrder, tree.get_rightChild());
		}
	}
	
	public String getRandomFunction(){
		
		return _functions.get(new Random().nextInt(_functions.size()));
	}
	
	public String getRandomTerminal(){
		
		return _terminals.get(new Random().nextInt(_terminals.size()));
	}
	
	public static ArrayList<String> get_terminals() {
		return _terminals;
	}

	public static ArrayList<String> get_functions() {
		return _functions;
	}

	//GETTERS//
	public Tree getGens() {
		return _gens;
	}
	
	public char getGen(int i) {
		//return _gens[i];
		return ' ';
	}
	
	public int getLength() {
		return _length;
	}
	
	public double getAptitude() {
		return _aptitude;
	}
	
	public double getScore() {
		return _score;
	}
	
	public double getAggregateSocore() {
		return _aggregateSocore;
	}
	
	//SETTERS//
	public void setGen(int i, char b) {
		//_gens[i] = b;
	}

	public void setGens(Tree gens) {
		_gens = gens;
	}

	public void setAptitude(double aptitude) {
		_aptitude = aptitude;
	}

	public void setScore(double score) {
		_score = score;
	}

	public void setAggregateSocore(double aggregateSocore) {
		_aggregateSocore = aggregateSocore;
	}
}
