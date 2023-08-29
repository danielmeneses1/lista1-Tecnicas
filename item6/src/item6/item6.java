package item6;
/*Verifique se A é maior que 10, se verdade imprima: "A > 10" caso não
seja, imprima: "A <= 10". Verifique se A mais B é igual a 20, se
verdadeiro, imprima: "A + B == 20”, caso não seja imprima: “A + B !=
20”.*/
public class item6 {

	public static void main(String[] args) {
		
		int a = 10;
		int b =10;
		if(a > 10) {
			System.out.println("A > 10");
		}else {
			System.out.println("A <= 10");
		}
		
		if(a+b ==20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("A + B != 20");
		}
	}

}
