
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;




public class productA {

	
	
	static public float v = (float) 1;
	static public float ep = (float) 0.00001;
	static public float [] page = new float [300000];
	static public float [] V = new float [300000];
	
	
	
public static float products() {
		
		int x = 0;
		float p = 0; 
		
		int a  = 0 ; 
		int b = 1 ; 
		
		
		for ( a = 0, b = 1; b < DeserialiZe.L.size(); ){
			
			if(DeserialiZe.L.get(a) != DeserialiZe.L.get(b)){
				
				if (x < DeserialiZe.L.get(b)){
					page[DeserialiZe.I.get(x)] += (float) ((float) DeserialiZe.C.get(x) * (float) V[a]);
					x ++;
				}
				
				else{
					a ++; 
					b ++; 
				}
			}
			
			else if (DeserialiZe.L.get(a) == DeserialiZe.L.get(b)){
				a ++; 
				b ++;
			}
		}
		
		for(int i = 0; i < page.length; i++){
			
			p += (float) Math.abs(page[i] - V[i]);
			V[i] = (float) page[i];
			page[i] = (float) 0.0;
		}
		
		
		return p; 
	}
	
	public static void pagerank(){
		
		float d = (float) 1.0;
		int i = 1; 
		int j = 0;
		for(j = 0; j < V.length; j++){
			V[j] = (float) 1/3170333;
		}
			
		
		while(d >= ep){
			
			d = products(); 
			i++;
		}
		
		
		
		FileOutputStream f;
		try {
			f = new FileOutputStream("pg2.ser");
			ObjectOutputStream object = new ObjectOutputStream(f);
	        object.writeObject(V);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	

}
