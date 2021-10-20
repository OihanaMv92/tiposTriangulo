package es.studium.tiposTriangulos;

import java.util.Scanner;

public class tiposTriangulos
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
        float lado1, lado2, lado3;
        System.out.println("Indicar longitud lado1:");
        lado1= teclado.nextInt();
        System.out.println("Indicar longitud lado2:");
        lado2= teclado.nextInt();
        System.out.println("Indicar longitud lado3:");
        lado3= teclado.nextInt();
        teclado.close();
        if ((lado1==lado2) && (lado2==lado3))
		{
			System.out.println("El Triangulo formado es equilatero");
		}
				else if ((lado1==lado2)&&(lado2!=lado3)||(lado1!=lado2)&&(lado2==lado3)||(lado1==lado3)&&(lado2!=lado3))
			{
					System.out.println("El Triangulo formado es isoscele");
			}
					else if ((lado1!=lado2)&&(lado2!=lado3)&&(lado1!=lado3))
					{
						System.out.println("El Triangulo formado es escaleno");
					}


        
	}
}
