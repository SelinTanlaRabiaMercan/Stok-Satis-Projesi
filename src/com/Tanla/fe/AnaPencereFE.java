package com.Tanla.fe;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import com.Tanla.Utilities.Menuler;
import com.Tanla.interfaces.FEInterfaces;

public class AnaPencereFE extends JFrame implements FEInterfaces{

	
	public AnaPencereFE() {
		initPencere();
	}
	@Override
	public void initPencere() {
		
		//JTabbedPane tabs=initTabs();
		JMenuBar bars=initBar();
		
		//add(tabs);
		setJMenuBar(bars);
		
		setTitle("Satış ve Stok Programı");
		//pack();//otomatik size içinmiş
		setSize(600, 250);
		setVisible(true);
		setLocationRelativeTo(null);//pencere merkezde dursun
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	@Override
	public JPanel initPanel() {
		JPanel panel=new JPanel();
		return panel;
	}

	@Override
	public JMenuBar initBar() {
		JMenuBar bar=Menuler.initBar();
		return bar;
	}

	@Override
	public JTabbedPane initTabs() {
		// TODO Auto-generated method stub
		return null;
	}

}
