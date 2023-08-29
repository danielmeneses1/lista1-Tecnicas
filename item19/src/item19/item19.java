package item19;
/*Verifique se o valor de A é maior que 10. Se for verdade, imprima "A >
10". Caso contrário, imprima "A <= 10". Em seguida, verifique se a soma
de A e B é igual a 20. Se essa afirmação for verdadeira, imprima "A + B
== 20". Caso contrário, imprima "A + B != 20*/
public class item19 {

	public static void main(String[] args) {
		int a =10;
		int b =10;
		
		if(a>10) {
			System.out.println("A > 10");
		} else {
			System.out.println("A<=10");
		}
		if(a +b ==20) {
			System.out.println("A + B==20");
		} else {
			System.out.println("A + B !=20");
		}
	}

}
