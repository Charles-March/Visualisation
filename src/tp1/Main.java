package tp1;

import java.util.Random;

public class Main {

	public static void main(String argv[]) {
		float[] dataset = new float[16];
		Random r = new Random();
		for( int i = 0; i < dataset.length; i++){
			dataset[i] = r.nextFloat();
		}
		
		for(int i=0; i < dataset.length; i++){
			System.out.println("dataset " + i + " : " + dataset[i]);
		}
		
		float[] data_out = Decomposition.decomposition(dataset, "full", 4);
		
		for(int i=0; i < data_out.length; i++){
			System.out.println("data_out " + i + " : " + data_out[i]);
		}
	}
	
}
