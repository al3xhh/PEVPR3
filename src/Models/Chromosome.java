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
	private char[] _gens;
	
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
	
	public Chromosome(MutationAlgorithm mutation) {
		_mutation = mutation;
 		_gens = new char[_length];
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
			
			_gens[i] = alphabet.charAt(index);
			alphabet = alphabet.replace(String.valueOf(alphabet.charAt(index)), "");
		}
	}

	/**
	 * Mutate the chromosome.
	 * 
	 * @param mutation mutation %.
	 */
	public void mutation(double mutation) {
		if(Math.random() < mutation)
			_mutation.mutation(this);
	}
	
		
	/**
	 * 
	 */
	public char[] cloneGens() {
		char []ret = new char[_length];
		
		for(int i = 0; i < _length; i++)
			ret[i] = _gens[i];
		
		return ret;
	}
	
	/**
	 * Create new child of each chromosome type.
	 * 
	 * @return new chromosome.
	 */
	public Chromosome getChild() {
		return new Chromosome(_mutation);
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
		Chromosome chromosome = new Chromosome(_mutation);
		char []gens = new char[_length];
		
		chromosome.setAggregateSocore(_aggregateSocore);
		chromosome.setAptitude(_aptitude);
		chromosome.setScore(_score);
		
		for(int i = 0; i < _length; i++)
			gens[i] = _gens[i];
		
		chromosome.setGens(gens);
		
		return chromosome;
	}
	
	//GETTERS//
	public char[] getGens() {
		return _gens;
	}
	
	public char getGen(int i) {
		return _gens[i];
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
		_gens[i] = b;
	}

	public void setGens(char[] gens) {
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
