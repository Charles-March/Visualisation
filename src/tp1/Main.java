package tp1;

public class Main {

	public static void main(String argv[]) {
		double[] dataset =Tools.generate_tab(32, 1, 10);
		Reconstruction.printT("dataset",dataset);
		double[] data_out = Decomposition.decomposition(dataset,"1.0", Tools.log2(dataset.length));
		double[] details=data_out.clone();
		Reconstruction.printT("dataout",data_out);
		data_out=Reconstruction.reconstruit(data_out);
		Reconstruction.printT("data_out",data_out);
		System.out.println("Erreur :" + CalculErreur.Erreur(dataset,data_out));
		Tools.export(dataset, data_out,details);
		}
	}
	
