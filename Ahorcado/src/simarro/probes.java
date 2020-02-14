package simarro;

import java.util.Scanner;

public class probes {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
	String palabra,letraLetra="";
	char letra;
	System.out.print("Introduzca una palabra: ");
	palabra=entrada.next();
	System.out.print("La palabra letra por letra es: ");
	for(int i=0;i<palabra.length();i++) {
		letraLetra=letraLetra+palabra.charAt(i);
	}
	System.out.print(letraLetra);
	System.out.print("\nIntroduzca una letra: ");
	letra=entrada.next().charAt(0);
	for(int i=0;i<palabra.length();i++) {
		if(letraLetra.charAt(i)==letra) {
			letraLetra=letraLetra.replace(letraLetra.charAt(i),'-');
		
	}
	}
	System.out.print(letraLetra);

	}

}
