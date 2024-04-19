package jareed.proyectoventas.models;

public class Camisas extends Productos{
    private String tela;

    public Camisas(int cantidad, String color, int talla, String tela) {
        super(cantidad, color, talla);
        this.tela = tela;
    }

    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    @Override
    public String toString() {
        return "Camisas{" +
                "tela='" + tela + '\'' +
                ", cantidad=" + cantidad +
                ", color='" + color + '\'' +
                ", talla=" + talla +
                '}';
    }
}
