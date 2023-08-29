package item5;

/*Verifique se A é maior que 10 ou se A mais B é igual a 20, se verdade
imprima: "número válido". Caso as afirmações não sejam verdadeiras,
imprima: "número não válido".*/

public class item5 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		
		if(a > 10 || a + b== 20) {
			System.out.println("Numero Valido");
		} else {
			System.out.println("Numero não valido");
		}

	}

}
