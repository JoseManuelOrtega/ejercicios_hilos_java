package com;

public class LanzadorHilosNew {
	public static void main(String [] args) throws Exception {
		Thread h = new Thread(new Hilo("nuevo"));
		h.start();
		try {
			System.out.println(h.getName() + "--->" + h.getState());
			Thread.sleep(50);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
