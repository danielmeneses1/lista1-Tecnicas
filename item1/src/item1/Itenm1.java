package item1;

/*
 * 1) Verifique se A é maior que 10, se verdade imprima: "A > 10" e verifique
se o A mais B é igual a 20, se verdade imprima: "A + B == 20". Caso a
segunda afirmação não seja verdadeira, imprima: "número não válido".
 * */

public class Itenm1 {

	public static void main(String[] args) {
		int a = 11;
		int b =9;
		
		if(a>10) {
			System.out.println("a>10");
		}
		
		if(a+b ==20) {
			System.out.println("a+b == 20");
		}else {
			System.out.println("Numero não valido");
		}
	}

}
