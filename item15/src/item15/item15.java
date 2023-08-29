package item15;
/*Verifique se o valor de A é menor que 10. Se essa afirmação for
verdadeira, imprima "A < 10". Em seguida, verifique se a soma de A e B
é igual a 20. Se essa afirmação for verdadeira, imprima "A + B == 20".
Caso nenhuma das afirmações seja verdadeira, imprima "número não
válido".*/

public class item15 {

	public static void main(String[] args) {
		int a =10;
		int b =10;
		
		if(a<10) {
			System.out.println("A < 10");
		}else if(a+b ==20)
		{
			System.out.println("A + B == 20");
		}else {
			System.out.println("Numero não valido");
		}
	}

}
