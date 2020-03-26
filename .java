package com.triangulo;

import java.util.Scanner;

public class TrianguloRetangulo {

	public static void main(String[] args) {
			
		Scanner valor = new Scanner (System.in);
		
			int x, z = 0;
			x = valor.nextInt();
			
			for (int i=0; i<=x; i++)
			{
				for (int y=0; y<=i; y++)
				{
					if (i==0|| y==0||z==0)
					System.out.print("* ");
				}
				System.out.print ("\n");
			}
		}
	}
