package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JFrame;

import controller.porder.PorderMainJframeUI;

public class Tool extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void save(Object s,String filename)
	{
		
		try {
			
			FileOutputStream fos=new FileOutputStream(filename);
			try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
				oos.writeObject(s);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static Object read(String filename)
	{
		Object o=null;
		
		try {
			FileInputStream fis=new FileInputStream(filename);
			try (ObjectInputStream ois = new ObjectInputStream(fis)) {
				o=ois.readObject();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return o;
	}
	
	public static void gotoPorderMain()
	{
		PorderMainJframeUI pordermain=new PorderMainJframeUI();
		pordermain.setVisible(true);
		
	
		
	}
	
	
	

}
