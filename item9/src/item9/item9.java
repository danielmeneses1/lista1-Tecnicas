package item9;
/*Verifique se A é maior que 10 e verifique se A mais B é igual a 20, se
verdadeiro, imprima: "A + B == 20''. Caso as afirmações não forem
verdadeiras imprima: "número não válido".*/
public class item9 {

	public static void main(String[] args) {
		int a = 11;
		int b = 9;
		
		if(a>10 || a+b ==20) {
			System.out.println("A + B ==20");
		}else {
			System.out.println("Numero não valida");
		}
	}

}
