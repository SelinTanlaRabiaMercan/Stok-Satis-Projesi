package com.Tanla.fe;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import com.Tanla.dal.CategoryDal;
import com.Tanla.entity.CategoryContract;
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
		JPanel panel = new JPanel(new GridLayout(3, 2));
		//id
		/*
		JLabel lblid =new JLabel("id : ",JLabel.RIGHT);
		panel.add(lblid);
		JComboBox cmbid=new JComboBox(new CategoryDal().GetAllparentId().toArray());
		cmbid.insertItemAt("id seçin",0);
		cmbid.setSelectedIndex(0);
		panel.add(cmbid);
		*/
		//adı
		JLabel lblAd =new JLabel("Adı : ",JLabel.RIGHT);
		panel.add(lblAd);
		JTextField txtAd=new JTextField(10);
		panel.add(txtAd);
		//parent id
		JLabel lblParentId =new JLabel("Parent Id : ",JLabel.RIGHT);
		panel.add(lblParentId);
		JComboBox cmbParentId=new JComboBox( new CategoryDal().GetAllparentId().toArray());
		panel.add(cmbParentId);
		cmbParentId.insertItemAt("Kategori seçin",0);
		cmbParentId.setSelectedIndex(0);
		//kaydet buton
		JButton btnKaydet =new JButton("Kaydet");
		panel.add(btnKaydet);
		
		btnKaydet.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CategoryContract categoryContract=new CategoryContract();
				
				if(cmbParentId.getSelectedIndex()!=0) {
					CategoryContract categoryContract2=(CategoryContract) cmbParentId.getSelectedItem();

					//categoryContract.setId(categoryContract2.getId());
					categoryContract.setName(txtAd.getText());
					categoryContract.setParentId(categoryContract2.getId());
					
					new CategoryDal().Insert(categoryContract);
					JOptionPane.showMessageDialog(null, categoryContract.getName()+" kayıt başarılı");
				}else {
				//	categoryContract.setId(cmbid.getSelectedIndex());
					categoryContract.setName(txtAd.getText());
					categoryContract.setParentId(cmbParentId.getSelectedIndex());
					
					new CategoryDal().Insert(categoryContract);
					JOptionPane.showMessageDialog(null, categoryContract.getName()+" kayıt başarılı");
					//cmbParentId.addItem(new CategoryDal().GetAllparentId());
					
				}
			}
		});
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
