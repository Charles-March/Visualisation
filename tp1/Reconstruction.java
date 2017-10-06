package tp1;

public class Reconstruction {

	public static double[] reconstruit(double[] T){
		if(T==null) return null;
		if(T.length == 1 ) return null;
		
		//printT(T);
		System.out.println("------------");
		//PREMIERE ETAPE
		
		double[] T1 = new double[1];
		T1[0] = T[0];
		double[] T2 = new double[T1.length*2];
		T2[0]=T1[0]+T[1];
		T2[1]=T1[0]-T[1];
		T1=T2.clone();
		//TOTALE
		//printT(T1);
		System.out.println("-------------");
		for(int i=2;i<T.length;){
			T2= new double[T1.length*2];
			for(int j=0;j<T1.length && i<T.length;j++){
				
				T2[2*j]=T1[j]+T[i];
				T2[(2*j)+1]=T1[j]-T[i];	
				i++;
			}
			T1=T2.clone();
		}
		//printT(T1);
		return T1;
		
	}
	
	public static void reconstruitD(double[] T,int details){
		if(T==null) return ;
		if(T.length == 1 ) return ;
	
		

	}
	
	public static void printT(double[] T){
		for(int i=0;i<T.length;i++)System.out.println(T[i]+" ");
	}
	
	public static void printT(String header, double[] T){
		System.out.println(header);
		for(int i=0;i<T.length;i++)System.out.println(T[i]+" ");
	}
	//9 7 3 5
	
	public static void main(String[] args){
		double[] T= new double[4];
		T[0]=6;
		T[1]=2;
		T[2]=1;
		T[3]=-1;
		reconstruit(T);
	}
}
