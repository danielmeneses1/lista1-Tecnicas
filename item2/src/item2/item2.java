package item2;

/*2) Verifique se A é menor que 10, se verdade imprima: "A < 10", e verifique
se o A mais B é igual a 20, se verdade imprima: "A + B == 20". Caso
nenhumas das afirmação não seja verdadeira, imprima: "número não
válido", (obs: apenas uma impressão é permitida na saída do programa).*/

public class item2 {

	public static void main(String[] args) {
		int a = 11;
		int b = 9;
		
		if(a<10) {
			System.out.println("A<10");
		} else if(a+b == 20) {
			System.out.println("A + B == 20");
		}else {
			System.out.println("Número não valido");
		}
		
		
		

	}

}
