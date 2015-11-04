/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 *   |_ Runner
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 4.
 * </pre>
 *
 * @author		: 김정혁
 * @version		: 1.0
 */
public class Runner extends Thread {

	private String name;
	
	public Runner() {
		
	}
	
	public Runner(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		int d = 110;
		System.out.println(name + " 출발");
		
		while(d != 0) {
			d -= 10;
			System.out.println(name + " " + d + "미터");
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(name + " 골인");
	}

}
