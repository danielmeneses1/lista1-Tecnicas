package item12;

/*) Verifique se A é maior que 10 imprima: "A > 10" ou verifique se A mais
B é igual a 20, imprima: "A + B == 20'', caso as afirmações não sejam
verdadeiras, imprima: "números não válidos". Sejam as afirmações
anteriores falsas ou verdadeiras imprima: “Sejam bem-vindos à
disciplina de Técnicas de Programação”*/

public class item12 {

	public static void main(String[] args) {
		int a =10;
		int b =10;
		
		if(a>10) {
			System.out.println("A > 10");
		} else if(a + b == 20) {
			System.out.println("A + B ==20");
		} else {
			System.out.println("Numeros invalidos");
		}
		
		System.out.println("Sejam bem-vindos à disciplina de tecnicas de programção");
	}

}
