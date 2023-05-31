package ejecutable;
import modelo.Camisa;

public class Test {
    public static void main(String[] args) {
        Camisa camisa = new Camisa();

        // Establecer el color de la camisa
        camisa.establecerColor("Amarillo");

        // Obtener y mostrar el color de la camisa
        String colorCamisa = camisa.obtenerColor();
        System.out.println("El color de la camisa es: " + colorCamisa);
    }
}