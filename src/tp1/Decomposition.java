package tp1;

public class Decomposition {
	

	public static float[] decomposition(float[] data_in, String[] args){
		float[] data_out = new float[data_in.length];
		switch (args[0]){
			case "1":
				data_out = algo(data_in, 1);
				System.out.println(data_out);
				break;
		}
				
		return data_out;
	}
	
	public static float[] algo (float[] data_in, int rank){
		int size_of_data = data_in.length;
		float[] data_out = new float[size_of_data];
		// composition de la premiere partie des données
		for(int i=0; i < size_of_data/2*rank; i++){
			data_out[i] = 1/2*(data_in[2*i] + data_in[2*i+1]);
		}
		// composition de la seconde partie des données
		for(int i = size_of_data/2*rank; i < size_of_data; i++){
			data_out[i] = 1/2*(data_in[2*i] - data_in[2*i+1]);
		}
		return data_out;
	}
}
