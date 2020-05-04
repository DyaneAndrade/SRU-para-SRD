import java.util.Scanner;

public class SRUSRD {

	public static void main(String[] args) {
		//SRU (x, y) para SRD (x, y)
		
		Scanner s = new Scanner(System.in);
		int Xmaxu, Ymaxu, Xmaxd, Ymaxd;
		
		System.out.println("Quais são os valores de Xmax e Ymax de SRU?");
		Xmaxu = s.nextInt();
		Ymaxu = s.nextInt();
		
		System.out.println("Quais são os valores de Xmax e Ymax de SRD?");
		Xmaxd = s.nextInt();
		Ymaxd = s.nextInt();
		
		s.close();
		
		int xd, xu = 0, yd, yu = 0;
		
		xd = (xu * Xmaxd)/Xmaxu;
		yd = ((yu * (-Ymaxd)/Ymaxu)) + Ymaxd;
		
		System.out.println(xd + " e " + yd);
	}

}
