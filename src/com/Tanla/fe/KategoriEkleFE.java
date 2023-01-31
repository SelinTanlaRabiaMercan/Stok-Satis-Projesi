package com.Tanla.fe;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import com.Tanla.interfaces.FEInterfaces;
import com.toedter.calendar.JDateChooser;

public class KategoriEkleFE extends JDialog implements FEInterfaces{

	public KategoriEkleFE() {
		initPencere();
	}

	@Override
	public void initPencere() {
		JPanel panel = initPanel();
		panel.setBorder(BorderFactory.createTitledBorder("Kategori Kaydet"));//en üstteki çizgi şeyi
		add(panel);
		
		setTitle("Kategori Ekle");
		//setSize(300, 250);
		pack();
		setModalityType(DEFAULT_MODALITY_TYPE);//pencereyi kapatmadan alttaki pencereye geçemezsin
		setLocationRelativeTo(null);//pencere merkezde dursun
		setVisible(true);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		
	}

	@Override
	public JPanel initPanel() {
		JPanel panel = new JPanel(new GridLayout(2, 2));
		//adı
		JLabel lblAd =new JLabel("Adı : ",JLabel.RIGHT);
		panel.add(lblAd);
		JTextField txtAd=new JTextField(10);
		panel.add(txtAd);
		//kaydet buton
		JButton btnKaydet =new JButton("Kaydet");
		panel.add(btnKaydet);
		//iptal buton
		JButton btnIptal =new JButton("Vazgeç");
		panel.add(btnIptal);
		
		return panel;
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
