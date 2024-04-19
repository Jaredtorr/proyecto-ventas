package jareed.proyectoventas.models;

public class Pantalones extends  Productos{
    private String tipo;

    public Pantalones(int cantidad, String color, int talla, String tipo) {
        super(cantidad, color, talla);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pantalones{" +
                "tipo='" + tipo + '\'' +
                ", cantidad=" + cantidad +
                ", color='" + color + '\'' +
                ", talla=" + talla +
                '}';
    }
}
