package tp1;

import java.util.Random;

public class Main {

	public static void main(String argv[]) {
		float[] dataset = new float[4];
//		Random r = new Random();
//		for( int i = 0; i < dataset.length; i++){
//			dataset[i] = r.nextFloat();
//		}
		dataset[0] = 9;
		dataset[1] = 7;
		dataset[2] = 3;
		dataset[3] = 5;
		
		for(int i=0; i < dataset.length; i++){
			System.out.println("dataset " + i + " : " + dataset[i]);
		}
		
		float[] data_out = Decomposition.decomposition(dataset, "2.0", 2);
		
		for(int i=0; i < data_out.length; i++){
			System.out.println("data_out " + i + " : " + data_out[i]);
		}
	}
	
}
