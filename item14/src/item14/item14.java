package item14;
/*Verifique se o valor de A é maior que 10. Se for verdade, imprima "A >
10". Além disso, verifique se a soma de A e B é igual a 20. Se essa
afirmação também for verdadeira, imprima "A + B == 20". Caso a
segunda afirmação não seja verdadeira, imprima "número não válido".*/
public class item14 {

	public static void main(String[] args) {
		
		int a= 10;
		int b =10;
		
		if(a>10) {
			System.out.println("a>10");
		}
		
		if(a + b ==20) {
			System.out.println("A + B");
		} else {
			System.out.println("numero nao valido");
		}

	}

}
