package jareed.proyectoventas.models;

public class Productos {
    protected int cantidad;
    protected  String color;
    protected int talla;

    public Productos(int cantidad, String color, int talla) {
        this.cantidad = cantidad;
        this.color = color;
        this.talla = talla;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return "Productos{" +
                "cantidad=" + cantidad +
                ", color='" + color + '\'' +
                ", talla=" + talla +
                '}';
    }
}
