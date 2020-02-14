package simarro;

import java.util.Scanner;

public class Ahorcado {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int opcion,pierde=0,contador=0;
		String palabra="",palabraOculta="",resultado="";
		String nuevaPalabra,aux="";
		boolean comenzar=true,acabar=false,exito=false,completado=false,inicio=false;
		char letra;
		do {
		System.out.print("\n--------MENU--------");
		System.out.print("\n1. Introducir palabra");
		System.out.print("\n2. Adivinar palabra");
		System.out.print("\n3. Salir\n");
		opcion=entrada.nextInt();
		
			switch(opcion) {
			case 1:
				System.out.print("Introduzca la palabra: ");
				palabra=entrada.next();
				inicio=true;
				aux=palabra;
				break;
			case 2:
				if(inicio==false) {
					System.out.print("Error.Antes de empezar se ha de introducir una palabra\n");
					
				}else {
				 do {	
					 exito=false;
					if(pierde==0) {
					System.out.print("          _____________\n");
					System.out.print("          |/          |\n");
					System.out.print("          |            \n");
					System.out.print("          |            \n");
					System.out.print("          |            \n");
					System.out.print("          |            \n");
					System.out.print("          |            \n");
					System.out.print("          |            \n");
					System.out.print("          |            \n");
					System.out.print("          |            \n");
					System.out.print("          |            \n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("__________|__________\n");
					}else if(pierde==1) {
					System.out.print("          _____________\n");
					System.out.print("          |/         _|_\n");
					System.out.print("          |         |   | \n");
					System.out.print("          |         |___|\n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("__________|__________");
					}else if(pierde==2) {
					System.out.print("          _____________\n");
					System.out.print("          |/         _|_\n");
					System.out.print("          |         |   | \n");
					System.out.print("          |         |___|\n");
					System.out.print("          |           | \n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("__________|__________");
					}else if(pierde==3) {
					System.out.print("          _____________\n");
					System.out.print("          |/        _|_\n");
					System.out.print("          |        |   | \n");
					System.out.print("          |        |___| \n");
					System.out.print("          |     _____|  \n");
					System.out.print("          |    |        \n");
					System.out.print("          |    |        \n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("__________|__________");
					}else if(pierde==4) {
					System.out.print("          _____________\n");
					System.out.print("          |/        _|_\n");
					System.out.print("          |        |   | \n");
					System.out.print("          |        |___| \n");
					System.out.print("          |     _____|_____ \n");
					System.out.print("          |    |           |\n");
					System.out.print("          |    |           |\n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("__________|__________");
					}else if(pierde==5) {
					System.out.print("          _____________\n");
					System.out.print("          |/        _|_\n");
					System.out.print("          |        |   | \n");
					System.out.print("          |        |___| \n");
					System.out.print("          |     _____|_____ \n");
					System.out.print("          |    |     |     |\n");
					System.out.print("          |    |     |     |\n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("__________|__________");
					}else if(pierde==6) {
					System.out.print("          _____________\n");
					System.out.print("          |/        _|_\n");
					System.out.print("          |        |   | \n");
					System.out.print("          |        |___| \n");
					System.out.print("          |     _____|_____ \n");
					System.out.print("          |    |     |     |\n");
					System.out.print("          |    |     |     |\n");
					System.out.print("          |          |    \n");
					System.out.print("          |          |    \n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("__________|__________");
					}else if(pierde==7) {
					System.out.print("          _____________\n");
					System.out.print("          |/        _|_\n");
					System.out.print("          |        |   | \n");
					System.out.print("          |        |___| \n");
					System.out.print("          |     _____|_____ \n");
					System.out.print("          |    |     |     |\n");
					System.out.print("          |    |     |     |\n");
					System.out.print("          |          |    \n");
					System.out.print("          |        __|__    \n");
					System.out.print("          |       |      \n");
					System.out.print("          |       |       \n");
					System.out.print("          |       |       \n");
					System.out.print("          |              \n");
					System.out.print("          |              \n");
					System.out.print("__________|__________");	
					}else if(pierde==8) {
							System.out.print("Ohhh has perdido ohhh");
							completado=true;
					}
			if(contador==0) {
					for(int i=0;i<palabra.length();i++) {
						palabraOculta+='-';
						}
				
					}
				 
					
					System.out.print("\n"+palabraOculta+"\n");
					System.out.print("\nIntroduzca una letra: ");
					letra=entrada.next().charAt(0);	
					for(int i=0;i<palabra.length();i++) {
						if(palabra.charAt(i)==letra) {
							palabraOculta=palabraOculta.substring(0,i)+letra+palabraOculta.substring(i+1);
							exito=true;
						}
							
						
						
					}
					System.out.print("\n"+palabraOculta+"\n");
					if(exito==false) {
						pierde++;
					}
					contador++;
					
					if(palabraOculta.equals(aux)) {
						completado=true;
						 System.out.print("\n!Enhorabuena has acertado la palabra¡\n");
					}
					
					
					
					
					
					
					
					
					
					
				}while(completado==false);
				
				}
				break;
			case 3:
				System.out.print("!Hasta la proxima¡");
				acabar=true;
				break;
			default: 
				System.out.print("Introduzca una opcion correcta");
				break;
			}
	}while(acabar==false);

}
}