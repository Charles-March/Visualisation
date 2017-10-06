package tp1;

import java.util.LinkedList;

public class Reconstruction {

	public static float[] reconstruit(float[] T){
		if(T==null) return null;
		if(T.length == 1 ) return null;
		
		printT(T);
		System.out.println("------------");
		//PREMIERE ETAPE
		
		float[] T1 = new float[1];
		T1[0] = T[0];
		float[] T2 = new float[T1.length*2];
		T2[0]=T1[0]+T[1];
		T2[1]=T1[0]-T[1];
		T1=T2.clone();
		//TOTALE
		printT(T1);
		System.out.println("-------------");
		for(int i=2;i<T.length;){
			T2= new float[T1.length*2];
			for(int j=0;j<T1.length && i<T.length;j++){
				
				T2[2*j]=T1[j]+T[i];
				T2[(2*j)+1]=T1[j]-T[i];	
				i++;
			}
			T1=T2.clone();
		}
		printT(T1);
		return T1;
		
	}
	
	public static void reconstruitD(float[] T,int details){
		if(T==null) return ;
		if(T.length == 1 ) return ;
	
		

	}
	
	public static void printT(float[] T){
		for(int i=0;i<T.length;i++)System.out.println(T[i]+" ");
	}
	//9 7 3 5
	
	public static void main(String[] args){
		float[] T= new float[4];
		T[0]=6;
		T[1]=2;
		T[2]=1;
		T[3]=-1;
		reconstruit(T);
	}
}
