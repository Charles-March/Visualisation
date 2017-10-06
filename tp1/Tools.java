package tp1;

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
}
