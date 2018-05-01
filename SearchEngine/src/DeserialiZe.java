

import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Vector;


public class DeserialiZe {
	
	public static Vector<Integer> C = new Vector<>();
	public static Vector<Integer> L = new Vector<>();
	public static Vector<Integer> I = new Vector<>();
	
   
	public static void deserialize(){
    	
    	
    	
    	FileInputStream file;
		try {
			
			
			file = new FileInputStream("C.ser");
			ObjectInputStream f = new ObjectInputStream(file);
	        C = (Vector<Integer>) f.readObject();
	        
	        
	        
	        file = new FileInputStream("I.ser");
	        f = new ObjectInputStream(file);
	        I = (Vector<Integer>) f.readObject();
	        
	        
	        file = new FileInputStream("L.ser");
	        f = new ObjectInputStream(file);
	        L = (Vector<Integer>) f.readObject();
	        
	        
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
    }
}
