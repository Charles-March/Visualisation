package tp1;

public class Decomposition {

	public static float[] decomposition(float[] data_in, String arg, int left){
		float[] data_out = new float[data_in.length];
		switch (arg){
			case "1":
				data_out = algo(data_in, 1, left);
				break;
			default:
				data_out = algo(data_in, 1, left);
		}
				
		return data_out;
	}
	
	public static float[] algo (float[] data_in, int rank, int left){
		int size_of_data = data_in.length;
		float[] data_out = new float[size_of_data];
		data_out = data_in;
		// composition de la premiere partie des données
		System.out.println(size_of_data);
		System.out.println("rank est " + rank);
		System.out.println("rank" + size_of_data/(2*rank));
		for(int i=0; i < (size_of_data/(2*rank)); i++){
			data_out[i] = (float) 0.5*(data_in[2*i] + data_in[2*i+1]);
		}
		// composition de la seconde partie des données
		int j = 0;
		for(int i = size_of_data/(2*rank); i < size_of_data/rank; i++){
			data_out[i] = (float) 0.5*(data_in[2*j] - data_in[2*j+1]);
			j++;
		}
		if (left == 1){
			return data_out;
		} else {
			rank = rank + 1;
			left = left - 1;
			return (algo(data_out, rank, left));
		}
	}
}
