package tp1;

public class Main {

	public static void main(String argv[]) {
		double[] dataset =Tools.generate_tab(128, 1, 10);
		Reconstruction.printT("dataset",dataset);
		double[] data_out = Decomposition.decomposition(dataset,"all", Tools.log2(dataset.length));
		Reconstruction.printT("dataout",data_out);
		data_out=Reconstruction.reconstruit(data_out);
		Reconstruction.printT("data_out",data_out);
		System.out.println("Erreur :" + CalculErreur.Erreur(dataset,data_out));
		
		}
	}
	
