package tp1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Tools {
	public static int log2(int a){
		int b=0;
		for(int i=0;a>1;i++){
			b++;
			a/=2;
		}
		return b;
	}
	
	public static void main(String[] args){
		System.out.println(Math.pow(2, 7)+ " " +log2(128));
	}
	
	public static double[] generate_tab(int taille,int min, int max){
		double[] tab = new double[taille];
			for(int i=0;i<taille;i++){
				tab[i]= min + (int)(Math.random() * max); 
			}
		return tab;
	}
	
	public static boolean export(double[] dataIn, double[] dataOut,double[] details){
		try {
			PrintWriter writerCoef = new PrintWriter("CoefDetails.csv", "UTF-8");
			PrintWriter writerGraph = new PrintWriter("Erreur.csv","UTF-8");
			HashMap<Double, Integer> map=new HashMap<Double,Integer>();
			for(int i=0;i<details.length;i++){
				if(map.containsKey(details[i])){
					map.put(details[i], map.get(details[i]+1));
				}
				else{
					map.put(details[i], 1);
				}
			}
			System.out.println(map.size());
			Iterator it = map.entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
		        System.out.print(pair.getKey()+",");
		        writerCoef.print(pair.getKey()+",");
		        it.remove(); // avoids a ConcurrentModificationException
		    }
		    
		    writerCoef.println();
		    
		    Iterator it2 = map.entrySet().iterator();
		    while (it2.hasNext()) {
		        Map.Entry pair = (Map.Entry)it2.next();
		        writerCoef.print(pair.getValue()+",");
		        System.out.print(pair.getValue()+",");
		        it2.remove(); // avoids a ConcurrentModificationException
		    }
		    writerCoef.println();
		    writerCoef.close();
			/*
			for(int i=0;i<dataIn.length;i++){
				writer.print(dataIn[i]+",");
				
			}
			writer.println("");
			for(int i=0;i<dataOut.length;i++){
				writer.print(dataOut[i]+",");
				
			}
			writer.println("");	
			
			writer.close();
			*/
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return false;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return false;
		}
		
		
		return true;
	}
}
