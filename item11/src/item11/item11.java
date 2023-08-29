package item11;
/*Verifique se A é maior que 10 se não for verifique se A mais B é igual a
20, imprima: "A + B == 20''. Caso A não seja maior que 10 e A mais B
for diferente de 20, imprima: "número não válido".*/
public class item11 {

	public static void main(String[] args) {
		int a =10;
		int b = 10;
		
		if(a + b ==20) {
			System.out.println("A + B ==20");
		}
		if(a<=10 || a + b !=20) {
			System.out.println("Numero não valido");
		}
	}

}
