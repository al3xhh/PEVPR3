package Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import Init.InitTechnic;
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
	
	private double _weight;
	
	private static ArrayList<String> _terminals = new ArrayList<String>() {{
		add("A0");
		add("A1");
		add("D0");
		add("D1");
		add("D2");
		add("D3");
	}};
	
	private static ArrayList<String> _functions;
	
	private static InitTechnic _init;
	
	public Chromosome(MutationAlgorithm mutation, int maxDepth, ArrayList<String>functions, InitTechnic init, double weight) {
		_mutation = mutation;
		_functions = functions;
		_maxDepth = maxDepth;
		_init = init;
 		_gens = _init.init(_maxDepth, 1, _terminals, _functions);
 		_weight = weight;
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
	 * Mutate the chromosome.
	 * 
	 * @param mutation mutation %.
	 */
	public void mutation(double mutation) {
		if(Math.random() < mutation)
			_mutation.mutation(this, _init);
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
		return new Chromosome(_mutation, _maxDepth, _functions, _init, _weight);
	}
	
	/**
	 * Test the chromosome to calculate the aptitude.
	 * 
	 * @return chromosome aptitude.
	 */
	public double test() {
		Multiplexor mux = new Multiplexor();
		int hit = 0;
		
		for (int i = 0; i < Utils.combinations.length; i++) {
			if (mux.getOutput(Utils.combinations[i].substring(0, 2), Utils.combinations[i].substring(2, 6)) == getResult(this._gens, Utils.combinations[i]))
				hit++;
		}
		
		return (1 - hit / 64.0) + _weight * _gens.get_nodesNumber();
	}
	
	public int hits(){
		Multiplexor mux = new Multiplexor();
		int hit = 0;
		
		for (int i = 0; i < Utils.combinations.length; i++) {
			if (mux.getOutput(Utils.combinations[i].substring(0, 2), Utils.combinations[i].substring(2, 6)) == getResult(this._gens, Utils.combinations[i]))
				hit++;
		}
		
		return hit;
	}
	
	private boolean getResult(Tree tree, String muxVals){
		
		if ((tree.get_centerChild() == null || tree.get_leftChild() == null || tree.get_rightChild() == null) && tree.get_value().equals("IF"))
			System.err.println("asdkldasdlñaskdñas");
		
		if (tree.is_isLeaf()) {
			return getBinaryValue(muxVals, tree.get_value());
		}
					
		if (tree.get_value() == "AND")
			return getResult(tree.get_rightChild(), muxVals) && getResult(tree.get_leftChild(), muxVals);
		else if (tree.get_value() == "OR")
			return getResult(tree.get_rightChild(), muxVals) || getResult(tree.get_leftChild(), muxVals);
		else if (tree.get_value() == "NOT")
			return !getResult(tree.get_leftChild(), muxVals);
		else{
			if (getResult(tree.get_leftChild(), muxVals))
				return getResult(tree.get_centerChild(), muxVals);
			else
				return getResult(tree.get_rightChild(), muxVals);
		}
	}
	
	private boolean getBinaryValue(String muxVals, String terminal){
		if (terminal.equals("A0"))
			return muxVals.charAt(0) == '0' ? false : true;
		else if (terminal.equals("A1"))
			return muxVals.charAt(1) == '0' ? false : true;
		else if (terminal.equals("D0"))
			return muxVals.charAt(2) == '0' ? false : true;
		else if (terminal.equals("D1"))
			return muxVals.charAt(3) == '0' ? false : true;
		else if (terminal.equals("D2"))
			return muxVals.charAt(4) == '0' ? false : true;
		else if (terminal.equals("D3"))
			return muxVals.charAt(5) == '0' ? false : true;
		else
			return false;
	}
	/**
	 * Calculate the phenotype.
	 * 
	 * @return chromosome phenotype.
	 */
	public String getPhenotype() {
		StringBuffer phenotipe = new StringBuffer();
		getPhenotype(this._gens, phenotipe);	
		
		return phenotipe.toString();
	}
	
	private void getPhenotype(Tree tree, StringBuffer phenotipe) {
		if (tree.is_isLeaf())
			phenotipe.append(" " + tree.get_value() + " ");
		else{
			phenotipe.append("(" + tree.get_value());
			
			getPhenotype(tree.get_leftChild(), phenotipe);
			
			if (tree.get_centerChild() != null)
				getPhenotype(tree.get_centerChild(), phenotipe);
			if (tree.get_rightChild() != null)
				getPhenotype(tree.get_rightChild(), phenotipe);
			
			phenotipe.append(")");
		}
		
	}

	/**
	 * Clone the chromosome.
	 */
	public Chromosome clone() {
		Chromosome chromosome = new Chromosome(_mutation, _maxDepth, _functions, _init, _weight);
		
		chromosome.setAggregateSocore(_aggregateSocore);
		chromosome.setAptitude(_aptitude);
		chromosome.setScore(_score);
		chromosome.setGens(cloneGen(_gens, null));
		
		return chromosome;
	}
	
	public Tree cloneGen(Tree src, Tree father){
		Tree clone = new Tree(father, src.get_depth(), src.is_isRoot(), src.is_isLeaf(), src.get_position());
		clone.set_value(src.get_value());
		clone.set_nodesNumber(src.get_nodesNumber());
		if (!src.is_isLeaf()){
			clone.set_leftChild(cloneGen(src.get_leftChild(), clone));
			if (src.get_rightChild() != null)
				clone.set_rightChild(cloneGen(src.get_rightChild(), clone));
			if (src.get_centerChild() !=null)
				clone.set_centerChild(cloneGen(src.get_centerChild(), clone));
		}
		
		return clone;
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
			if (!tree.get_value().equals("IF")){
				//Added the center soon
				if (tree.get_leftChild() != null)
					getInOrder(inOrder, tree.get_leftChild());
				
				//added the current father
				inOrder.add(tree);
				
				//added de rigth son
				if (tree.get_rightChild() != null)
					getInOrder(inOrder, tree.get_rightChild());
			}
			else{
				//Added the left soon
				if (tree.get_leftChild() != null)
					getInOrder(inOrder, tree.get_leftChild());
				
				//added the current father
				inOrder.add(tree);
				
				//Added the center soon
				if (tree.get_centerChild() != null)
					getInOrder(inOrder, tree.get_centerChild());
				//added de rigth son
				if (tree.get_rightChild() != null)
					getInOrder(inOrder, tree.get_rightChild());
			}
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
