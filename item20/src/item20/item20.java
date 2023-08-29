package item20;
/*Verifique se o valor de A é maior que 10 ou se a soma de A e B é igual
a 20. Se pelo menos uma dessas afirmações for verdadeira, imprima
"números válidos". Caso contrário, imprima "número não válido". Em
qualquer caso, imprima "Sejam bem-vindos à disciplina de Técnicas de
Programação"*/
public class item20 {

	public static void main(String[] args) {
		int a =10;
		int b =10;
		
		if(a>10||a+b ==20) {
			System.out.println("Numeros validos");
		}else {
			System.out.println("numero não valido");
		}
		System.out.println("Sejam bem-vindos à disciplina de Técnicas de Programação");

	}

}
