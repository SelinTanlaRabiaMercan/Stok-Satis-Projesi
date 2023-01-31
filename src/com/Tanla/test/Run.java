package com.Tanla.test;

import javax.swing.SwingUtilities;

import com.Tanla.fe.AnaPencereFE;

public class Run {

	public static void main(String[] args) {

		/*
		 * RunnableArayüzün anonim bir uygulamasının bir örneğini oluşturuyorsunuz ve 
		 * invokeLateronu bir kuyruğa koyacak olan öğesine iletiyorsunuz. Başka bir iş parçacığı, 
		 * Olay Gönderme İş Parçacığı, Çalıştırılabilirleri bu kuyruktan çıkarır ve 
		 * runyöntemlerini çağırır
		 * */
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new AnaPencereFE();
				
			}
		});
	}

}
