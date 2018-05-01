import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class Page {
	
	public static float a [] = new float [3000000]; 
	
	public static HashMap<Integer, Float> page_rank = new HashMap<>();
	
	
	public static void make(){
		
		int c = 0;
		int i = 0 ;
		
		
		for ( i = 0; i < a.length; i++){
			page_rank.put(i, (float)a[i]); 
		}
		
		
		
		FileOutputStream f2;
		try {
			f2 = new FileOutputStream("pg2.ser");
			ObjectOutputStream object = new ObjectOutputStream(f2);
	        object.writeObject(page_rank);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
	}
	
	
	
public static void pagerank(){
		
		
		
		FileInputStream file;
		try {
			file = new FileInputStream("pg.ser");
			ObjectInputStream f = new ObjectInputStream(file);
	        
		a = (float[]) f.readObject();
		
		} catch (IOException | ClassNotFoundException e) {
		e.printStackTrace();
		}
		
		
		
		Set<Float> count = new HashSet<>();
		
				int i = 0 ;
		
				for( i = 0; i < a.length; i++)
					count.add(a[i]); 
		
	
	}
	
	
}
