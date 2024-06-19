package Matriz;

import java.util.Scanner;

public class Matriz01 {

	public static void main(String[] args) {
	 char matrizA [][] = {
		{'a','b','c','d',},
		{'e', 'f','g','h'},
		{'i', 'j', 'k','l'},
		{'m', 'n','o','p'},
         
	 };
	 for(char[]letra:matrizA) {
		 for(char coluna: letra);
		 System.out.print(letra + "\t");
	 }
	 System.out.println();
	}

}
