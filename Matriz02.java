package Matriz;

public class Matriz02 {

	public static void main(String[] args) {
		
		char matrizA[] [] = {
				{'*','*','*','*'},
				{'*','*','*'},
				{'*', '*',},
				{'*',},
		};
		for (char[]letra:matrizA) {
			for(char diagonal: letra) {
				System.out.print(diagonal + "\t");

			}
			System.out.println();
		}

}
}