package item4;

/*Verifique se A é maior que 10 ou se A mais B é igual a 20, se verdade
imprima: "número válido". Caso as afirmações não sejam verdadeiras,
Verificar se A é igual B, caso verdade imprima: (A é igual B; A e B são
diferentes de 10; A é menor que 10) caso não seja verdade imprima:
"número não válido".*/

public class item4 {

	public static void main(String[] args) {
		
		int a =10;
		int b = 10;
		
		if(a>10 || a+b ==20) {
			System.out.println("Numero valido");
		} else if(a==b) {
			System.out.println("A é igual a B; A e B sao diferentes de 10; A é menor que 10");
		}
			else {System.out.println("Numero Invalido");
		}

	}

}
