package item17;
/*Verifique se o valor de A é maior que 10 ou se a soma de A e B é igual
a 20. Se pelo menos uma dessas afirmações for verdadeira, imprima
"número válido". Caso contrário, verifique se A é igual a B. Se for
verdade, imprima "A é igual B". Se A e B forem diferentes de 10 e A for
menor que 10, imprima "A é menor que 10". Caso nenhuma das
afirmações anteriores seja verdadeira, imprima "número não válido".
*/
public class item17 {

	public static void main(String[] args) {
		int a =10;
		int b =10;
		if(a>10 || a+b ==20) {
			System.out.println("numero valido");
		}else if(a ==b ) {
			System.out.println("A igual a B");
		}
		if(a ==10 && b ==10 && a <10) {
			System.out.println("a menor que 10");
		}else {
			System.out.println("numero não valido");
		}
		

	}

}
