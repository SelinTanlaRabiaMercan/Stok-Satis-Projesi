package com.Tanla.fe;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

import com.Tanla.interfaces.FEInterfaces;


public class UrunEkleFE extends JDialog implements FEInterfaces{

	public UrunEkleFE() {
		
		initPencere();
	}

	@Override
	public void initPencere() {
		JPanel panel = initPanel();
		panel.setBorder(BorderFactory.createTitledBorder("Ürün Kaydet"));//en üstteki çizgi şeyi
		add(panel);
		
		setTitle("Ürün Ekle");
		//setSize(300, 250);
		pack();
		setModalityType(DEFAULT_MODALITY_TYPE);//pencereyi kapatmadan alttaki pencereye geçemezsin
		setLocationRelativeTo(null);//pencere merkezde dursun
		setVisible(true);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		
	}

	@Override
	public JPanel initPanel() {
		JPanel panel = new JPanel(new GridLayout(5, 2));
		//adı
		JLabel lblAd =new JLabel("Adı : ",JLabel.RIGHT);
		panel.add(lblAd);
		JTextField txtAd=new JTextField(10);
		panel.add(txtAd);
		//kategori id
		JLabel lblKategoriId =new JLabel("Kategori Id : ",JLabel.RIGHT);
		panel.add(lblKategoriId);
		JComboBox cmbKategoriId =new JComboBox();
		panel.add(cmbKategoriId);
		//tarih
		JLabel lblTarih =new JLabel("Tarih : ",JLabel.RIGHT);
		panel.add(lblTarih);
		JDateChooser dtTarih=new JDateChooser();
		panel.add(dtTarih);
		//fiyat
		JLabel lblFiyat =new JLabel("Fiyat : ",JLabel.RIGHT);
		panel.add(lblFiyat);
		JTextField txtFiyat=new JTextField(10);
		panel.add(txtFiyat);
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
