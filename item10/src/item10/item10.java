package item10;
/*Verifique se A é maior que 10 se não for imprima: "número menor que
10". Verifique se A mais B é igual a 20 se não for verdade imprima
"número diferente de 20".*/

public class item10 {

	public static void main(String[] args) {
		int a = 11;
		int b = 9;
		
		if(a>10) {
			System.out.println("a > 10");
		} else {
			System.out.println("Bumero menor que 10");
		}
		
		if(a+b == 20) {
			System.out.println("A + B ==20");
		} else {
			System.out.println("Numero diferente de 20");
		}
		

	}

}
