package tp1;

public class CalculErreur {
	public static void Erreur(float[] T1, float T2[]){
		boolean same=true;
		int l= Math.min(T1.length,T2.length);
		if(T1.length != T2.length){
			same=false;
			System.out.println("Taille différente !");
		}
		float sum=0;
		for(int i=0;i<l;i++){
			sum += Math.pow((T1[i]*T1[i] - T2[i]*T2[i]),2);
		}
		
		if(!same){
			if(T1.length>T2.length){
				for(int i=l;i<T1.length;i++){
					sum+=(T1[i]*T1[i]);
				}
			}
			else{
				for(int i=l;i<T2.length;i++){
					sum+=(T2[i]*T2[i]);
				}
			}
		}
		System.out.println("Erreur : "+sum);
	}
	
	public static void main(String[] args){
		float[] T= new float[4];
		float[] T2= new float[4];
		T[0]=6; 	T[1]=2; 	T[2]=1; 	T[3]=-1;
		T2[0]=6; 	T2[1]=2; 	T2[2]=4;	T2[3]=-1;
		Erreur(T, T2);
	}

}
