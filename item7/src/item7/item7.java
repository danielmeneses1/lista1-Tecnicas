package item7;
/*
 * Verifique se A é maior que 10 ou se o A mais B é igual a 20, caso sejam
verdadeiras as afirmações imprima: "números válidos”. Caso a primeira
afirmação não seja verdadeira, imprima: "número não válido".*/
public class item7 {

	public static void main(String[] args) {
		int a =10;
		int b =10;
		
		if(a>10|| a+b==20) {
			System.out.println("Numero Validos");
		} else {
			System.out.println("Numero não valido");
		}

	}

}
