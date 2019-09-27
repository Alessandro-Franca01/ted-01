package visao;
import modelo.Retangulo;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double area01, area02, moldura;
		moldura = 0;
		float bs, alt;
		Retangulo r01, r02;
		System.out.println("Digite a base do 1° retangulo: ");
		bs = input.nextFloat();
		System.out.println("Digite a altura do 1° retangulo: ");
		alt = input.nextFloat();
		r01 = new Retangulo(bs, alt);
		area01 = r01.calcArea();
		System.out.println("A area do 1° retangulo é: "+area01);
		
		System.out.println("Digite a base do 2° retangulo: ");
		bs = input.nextFloat();
		System.out.println("Digite a altura do 2° retangulo: ");
		alt = input.nextFloat();
		r02 = new Retangulo(bs, alt);
		area02 = r02.calcArea();
		System.out.println("A area do 2° retangulo é: "+area02);

		if (area01 > area02) {
			moldura = area01 - area02;
		}
		if (area02 > area01) {
			moldura = area02 - area01;
		}
		System.out.println("A area da moldura é: "+moldura+" metros quadrados");
	}

}
