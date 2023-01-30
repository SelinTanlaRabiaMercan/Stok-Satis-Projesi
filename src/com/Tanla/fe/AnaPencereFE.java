package com.Tanla.fe;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import com.Tanla.interfaces.FEInterfaces;

public class AnaPencereFE extends JFrame implements FEInterfaces{

	private void AnaPencereFE() {
		initPencere();

	}
	@Override
	public void initPencere() {
		JTabbedPane tabs=initTabs();
		JMenuBar bars=initBar();
		
		//add(tabs);
		//setJMenuBar(bars);
		
		setTitle("Satış ve Stok Programı");
		pack();//otomatik size içinmiş
		setVisible(true);
		setLocationRelativeTo(null);//pencere merkezde dursun
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	@Override
	public JPanel initPanel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JMenuBar initBar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JTabbedPane initTabs() {
		// TODO Auto-generated method stub
		return null;
	}

}
