import br.com.igorgaspar.model.ClacularValores;

public class HelloWord {
    
    public static void main(String[] args) {

        ClacularValores calcular = new ClacularValores();

        int resultado = calcular.calcularValores(5, 5);
        System.out.println("The result is: "+ resultado);
    }
}
