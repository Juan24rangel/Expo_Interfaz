package modelo;

public class Camisa implements ColoresCamisa {
    private String color;

    public String obtenerColor() {
        return color;
    }

    public void establecerColor(String color) {
        this.color = color;
    }
}
