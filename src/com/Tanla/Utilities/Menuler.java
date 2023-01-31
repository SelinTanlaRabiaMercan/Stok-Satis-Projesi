package com.Tanla.Utilities;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

import com.Tanla.fe.AnaPencereFE;
import com.Tanla.fe.KategoriEkleFE;
import com.Tanla.fe.UrunEkleFE;

public class Menuler {
	
	public static JMenuBar initBar() {
		JMenuBar bar=new JMenuBar();
		JMenu dosyaMenu=new JMenu("Dosya");
		bar.add(dosyaMenu);
		JMenuItem cikisItem=new JMenuItem("Kapat");
		dosyaMenu.add(cikisItem);
		
		
		JMenu UrunlerMenu=new JMenu("ÜRÜNLER");
		bar.add(UrunlerMenu);
		JMenuItem UrunEkle=new JMenuItem("Ürün Ekle");
		UrunlerMenu.add(UrunEkle);
		JMenuItem UrunSil=new JMenuItem("Ürün Sil");
		UrunlerMenu.add(UrunSil);
		JMenuItem UrunDuzenle=new JMenuItem("Ürün Düzenle");
		UrunlerMenu.add(UrunDuzenle);
		JMenuItem UrunListele=new JMenuItem("Ürünleri Listele");
		UrunlerMenu.add(UrunListele);
		UrunlerMenu.addSeparator();//listenin arasına çizgi atar
		JMenuItem KategoriEkle=new JMenuItem("Kategori Ekle");
		UrunlerMenu.add(KategoriEkle);
		JMenuItem KategoriDuzenle=new JMenuItem("Kategori Düzenle");
		UrunlerMenu.add(KategoriDuzenle);
		
		UrunEkle.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						new UrunEkleFE();
						
					}
				});
				
			}
		});
		KategoriEkle.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						new KategoriEkleFE();
						
					}
				});
				
			}
		});
		
		return bar;
	}

}
