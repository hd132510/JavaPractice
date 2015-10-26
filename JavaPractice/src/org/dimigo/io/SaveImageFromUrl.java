/**
 * 
 */
package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 * <pre>
 * org.dimigo.io
 *   |_ SaveImageFromUrl
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 10. 26.
 * </pre>
 *
 * @author		: 김정혁
 * @version		: 1.0
 */
public class SaveImageFromUrl {
	
	public static void main(String[] args) { 
		
		String imageUrl = "https://static.dimigo.in/img/logobeta.png";
		URL url;
		try {
			url = new URL(imageUrl);
			
			try(InputStream is = url.openStream();
				OutputStream os = new FileOutputStream("files/logo.png")) {
				
				int result;
				byte[] buf = new byte[100];
				
				while((result = is.read(buf)) != -1) {
					os.write(buf, 0, result);
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			System.out.println("파일 생성 완료");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
