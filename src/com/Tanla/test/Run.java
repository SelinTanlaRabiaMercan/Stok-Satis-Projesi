package com.Tanla.test;

import javax.swing.SwingUtilities;

import com.Tanla.fe.AnaPencereFE;

public class Run {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new AnaPencereFE();
				
			}
		});
	}

}
