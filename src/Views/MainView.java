/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import org.math.plot.Plot2DPanel;

import Controlers.MainControler;
import Models.Chromosome;

/**
 *
 * @author al3x_hh
 */
public class MainView extends javax.swing.JFrame implements Observer {

	private MainControler controller;

	/**
	 * Creates new form MainView
	 */
	public MainView() {
		initComponents();

		controller = new MainControler();
		controller.setObserver(this);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		this.setTitle("Practise 3");
		this.setPreferredSize(new Dimension(1600, 1500));
		this.setResizable(false);

		jLabel1 = new javax.swing.JLabel();
		populationSizeTF = new javax.swing.JTextField();
		jLabel11 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		generationNumberTF = new javax.swing.JTextField();
		nTF = new javax.swing.JTextField();
		truncTF = new javax.swing.JTextField();
		tournamentTF = new javax.swing.JTextField();
		heuristicTF = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jLabel15 = new javax.swing.JLabel();
		selectionModeCB = new javax.swing.JComboBox<>();
		jPanel1 = new javax.swing.JPanel();
		jPanel4 = new javax.swing.JPanel();
		jLabel5 = new javax.swing.JLabel();
		crossoverTF = new javax.swing.JTextField();
		jPanel2 = new javax.swing.JPanel();
		jLabel6 = new javax.swing.JLabel();
		mutationTF = new javax.swing.JTextField();
		jLabel7 = new javax.swing.JLabel();
		mutationModeCB = new javax.swing.JComboBox<>();
		jPanel3 = new javax.swing.JPanel();
		jPanel5 = new javax.swing.JPanel();
		eliteTF = new javax.swing.JTextField();
		jLabel8 = new javax.swing.JLabel();
		resetFieldsB = new javax.swing.JButton();
		runB = new javax.swing.JButton();
		chartP = new Plot2DPanel();
		jPanel6 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		resultsTA = new javax.swing.JTextArea();
		and = new JCheckBox("AND");
		or = new JCheckBox("OR");
		not = new JCheckBox("NOT");
		iff = new JCheckBox("IF");
		jLabel16 = new javax.swing.JLabel();
		initModeCB = new javax.swing.JComboBox<>();
		mutationInitModeCB  = new javax.swing.JComboBox<>();
		jLabel17 = new javax.swing.JLabel();
		depthTF = new javax.swing.JTextField();
		jLabel18 = new javax.swing.JLabel();
		operators = new ArrayList<>();
		
		jLabel16.setText("Init technic");
		jLabel17.setText("Max depth: ");

		// DEFAULTS VALUES
		populationSizeTF.setText("100");
		generationNumberTF.setText("220");
		crossoverTF.setText("0.75");
		mutationTF.setText("0.2");
		eliteTF.setText("0.75");
		heuristicTF.setText("0");
		truncTF.setText("0");
		tournamentTF.setText("5");

		// define the legend position
		chartP.addLegend("SOUTH");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setPreferredSize(new java.awt.Dimension(1600, 750));

		jLabel1.setText("Population size:");

		jLabel11.setText("N: ");
		jLabel11.setVisible(false);
		nTF.setVisible(false);

		jLabel12.setText("Trunc: ");
		jLabel12.setVisible(false);
		truncTF.setVisible(false);
		
		jLabel14.setText("N: ");
		jLabel14.setVisible(true);
		tournamentTF.setVisible(true);
		
		jLabel15.setText("N: ");
		jLabel15.setVisible(false);
		heuristicTF.setVisible(false);
		
		jLabel18.setText("Init technic: ");
		jLabel18.setVisible(false);
		mutationInitModeCB.setVisible(false);

		jLabel2.setText("Generation number:");

		jLabel3.setText("Selection:");

		selectionModeCB.setModel(new javax.swing.DefaultComboBoxModel<>(
				new String[] { "Rests", "Roulette", "Tournament", "Universal stochastic", "Truncation" }));

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Crossover"));
		jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Init technic"));

		jLabel5.setText("Crossover %:");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addComponent(jLabel16)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(initModeCB, javax.swing.GroupLayout.PREFERRED_SIZE, 120,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
						.addGap(0, 0, Short.MAX_VALUE)
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel16).addComponent(initModeCB, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))));
		
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel5)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(crossoverTF, javax.swing.GroupLayout.PREFERRED_SIZE, 120,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
						.addGap(0, 0, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel5).addComponent(crossoverTF, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))));

		jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Mutation"));
		jPanel2.setToolTipText("");

		jLabel6.setText("MutationB:");

		jLabel7.setText("Mutation %:");

		mutationModeCB.setModel(new javax.swing.DefaultComboBoxModel<>(
				new String[] { "Simple Terminal", "Simple Functional", "Tree", "Permutation" }));
		
		initModeCB.setModel(new javax.swing.DefaultComboBoxModel<>(
				new String[] { "Full", "Grow", "Ramped & Half" }));
		
		mutationInitModeCB.setModel(new javax.swing.DefaultComboBoxModel<>(
				new String[] { "Full", "Grow", "Ramped & Half" }));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel6).addComponent(jLabel7).addComponent(jLabel15).addComponent(jLabel18))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(mutationModeCB, 0, 120, Short.MAX_VALUE).addComponent(mutationTF)
								.addComponent(heuristicTF).addComponent(mutationInitModeCB, 0, 120, Short.MAX_VALUE))
						.addContainerGap()));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel6)
								.addComponent(mutationModeCB, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel7).addComponent(mutationTF,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel15).addComponent(heuristicTF,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel18).addComponent(mutationInitModeCB,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap()));

		jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Elite"));
		jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Operators"));

		eliteTF.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField5ActionPerformed(evt);
			}
		});

		jLabel8.setText("Elite %:");

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(jLabel8)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(eliteTF, javax.swing.GroupLayout.PREFERRED_SIZE, 120,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
						.addGap(0, 0, Short.MAX_VALUE)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel8).addComponent(eliteTF, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))));
		
		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addComponent(and).addComponent(or).addComponent(not).addComponent(iff)));
		jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
						.addGap(0, 0, Short.MAX_VALUE)
						.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(and).addComponent(or).addComponent(not).addComponent(iff))));

		resetFieldsB.setText("Reset fields");
		resetFieldsB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// DEFAULTS VALUES
				populationSizeTF.setText("100");
				generationNumberTF.setText("220");
				crossoverTF.setText("0.75");
				mutationTF.setText("0.2");
				eliteTF.setText("0.75");
				heuristicTF.setText("0");
				truncTF.setText("0");
				tournamentTF.setText("5");
			}
		});

		runB.setText("Run");
		runB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (populationSizeTF.getText().equals("") || generationNumberTF.getText().equals("")
						|| crossoverTF.getText().equals("") || mutationTF.getText().equals("")
						|| eliteTF.getText().equals("") || depthTF.getText().equals("") || operators.size() == 0) {
					JOptionPane.showMessageDialog(null, "You must introduce all the paramaters", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					try {
						controller.run(Integer.parseInt(populationSizeTF.getText()),
								Integer.parseInt(generationNumberTF.getText()),
								selectionModeCB.getSelectedItem().toString(),
								Integer.parseInt(depthTF.getText()),
								Double.parseDouble(truncTF.getText().toString()),
								Integer.parseInt(tournamentTF.getText().toString()),
								Double.parseDouble(crossoverTF.getText()),
								initModeCB.getSelectedItem().toString(),
								mutationModeCB.getSelectedItem().toString(), 
								Double.parseDouble(mutationTF.getText()),
								mutationInitModeCB.getSelectedItem().toString(),
								Double.parseDouble(eliteTF.getText()),
								operators);
					} catch (NumberFormatException e1) {
						JOptionPane.showMessageDialog(null, "Munber format exception", "Error",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});

		selectionModeCB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (selectionModeCB.getSelectedItem().toString().equals("Truncation")) {
					jLabel12.setVisible(true);
					truncTF.setVisible(true);
					jLabel14.setVisible(false);
					tournamentTF.setVisible(false);
				} else if (selectionModeCB.getSelectedItem().toString().equals("Tournament") || 
						selectionModeCB.getSelectedItem().toString().equals("Rests")) {
					jLabel12.setVisible(false);
					truncTF.setVisible(false);
					jLabel14.setVisible(true);
					tournamentTF.setVisible(true);
				} else {
					jLabel12.setVisible(false);
					truncTF.setVisible(false);
					jLabel14.setVisible(false);
					tournamentTF.setVisible(false);
				}
			}
		});

		mutationModeCB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (mutationModeCB.getSelectedItem().toString().equals("Heuristic")) {
					jLabel15.setVisible(true);
					heuristicTF.setVisible(true);
				} else {
					jLabel15.setVisible(false);
					heuristicTF.setVisible(false);
				}
				
				if (mutationModeCB.getSelectedItem().toString().equals("Tree")) {
					jLabel18.setVisible(true);
					mutationInitModeCB.setVisible(true);
				} else {
					jLabel18.setVisible(false);
					mutationInitModeCB.setVisible(false);
				}
			}
		});
		
		and.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(and.isSelected())
					operators.add("AND");
				else
					operators.remove("AND");
			}
		});
		
		or.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(and.isSelected())
					operators.add("OR");
				else
					operators.remove("OR");
			}
		});
		
		not.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(and.isSelected())
					operators.add("NOT");
				else
					operators.remove("NOT");
			}
		});
		
		iff.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(and.isSelected())
					operators.add("IF");
				else
					operators.remove("IF");
			}
		});

		/*
		 * chartP.setBorder(javax.swing.BorderFactory.createTitledBorder("Chart"));
		 * 
		 * javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		 * jPanel4.setLayout(jPanel4Layout); jPanel4Layout.setHorizontalGroup(
		 * jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		 * .addGap(0, 899, Short.MAX_VALUE) ); jPanel4Layout.setVerticalGroup(
		 * jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		 * .addGap(0, 0, Short.MAX_VALUE) );
		 */

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout
				.setHorizontalGroup(
						jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel6Layout.createSequentialGroup().addContainerGap()
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addContainerGap()));

		resultsTA.setEditable(false);
		resultsTA.setColumns(20);
		resultsTA.setRows(5);
		resultsTA.setBorder(javax.swing.BorderFactory.createTitledBorder("Results"));
		jScrollPane1.setViewportView(resultsTA);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(19, 19, 19)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addGroup(layout.createSequentialGroup()
										.addComponent(resetFieldsB, javax.swing.GroupLayout.PREFERRED_SIZE, 130,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(runB, javax.swing.GroupLayout.PREFERRED_SIZE, 130,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup()
										.addComponent(and)
										.addComponent(or)
										.addComponent(not)
										.addComponent(iff))
								.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(
										jPanel3, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(
										jPanel5, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addGroup(layout.createSequentialGroup().addGap(8, 8, 8)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel2).addComponent(jLabel3).addComponent(jLabel1)
												.addComponent(jLabel11).addComponent(jLabel12).addComponent(jLabel14).addComponent(jLabel17))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
												.addComponent(generationNumberTF)
												.addComponent(populationSizeTF)
												.addComponent(selectionModeCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(nTF).addComponent(truncTF).addComponent(tournamentTF).addComponent(depthTF)))
								.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGap(22, 22, 22)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(chartP, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jScrollPane1))
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addGroup(layout.createSequentialGroup().addContainerGap()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE))
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel1).addComponent(populationSizeTF,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel2).addComponent(generationNumberTF,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel3).addComponent(selectionModeCB,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel11).addComponent(nTF,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel17).addComponent(depthTF,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel12)
												.addComponent(truncTF, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel14)
												.addComponent(tournamentTF, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addComponent(chartP, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addGroup(layout.createSequentialGroup()
										.addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(layout.createSequentialGroup()
												.addComponent(and).addComponent(or).addComponent(not).addComponent(iff))
										.addGap(26, 26, 26)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(resetFieldsB).addComponent(runB)))
								.addComponent(jScrollPane1))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField5ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextField5ActionPerformed

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainView().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton resetFieldsB;
	private javax.swing.JButton runB;
	private javax.swing.JComboBox<String> selectionModeCB;
	private javax.swing.JComboBox<String> mutationModeCB;
	private javax.swing.JComboBox<String> initModeCB;
	private javax.swing.JComboBox<String> mutationInitModeCB;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JCheckBox and;
	private javax.swing.JCheckBox or;
	private javax.swing.JCheckBox not;
	private javax.swing.JCheckBox iff;
	private Plot2DPanel chartP;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextArea resultsTA;
	private javax.swing.JTextField populationSizeTF;
	private javax.swing.JTextField generationNumberTF;
	private javax.swing.JTextField nTF;
	private javax.swing.JTextField truncTF;
	private javax.swing.JTextField tournamentTF;
	private javax.swing.JTextField heuristicTF;
	private javax.swing.JTextField crossoverTF;
	private javax.swing.JTextField mutationTF;
	private javax.swing.JTextField eliteTF;
	private javax.swing.JTextField depthTF;
	private ArrayList<String> operators;
	// End of variables declaration//GEN-END:variables

	@Override
	public void updatePlot(double[] mean, double[] bestGeneration, double[] best, int generations, Chromosome result) {
		double[] x = new double[generations];

		for (int i = 0; i < generations; i++)
			x[i] = i + 1;

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				resultsTA.setText(null);
				resultsTA.setText(result.getPhenotype());
				chartP.removeAllPlots();
				chartP.addLinePlot("Absolute best", x, best);
				chartP.addLinePlot("Generation best", x, bestGeneration);
				chartP.addLinePlot("Generation mean", x, mean);
			}
		});
	}
}
