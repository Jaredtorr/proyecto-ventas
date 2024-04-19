package jareed.proyectoventas.models;

import java.util.ArrayList;

public class Administrador {
    public Administrador() {
    }

    private ArrayList<Productos> listProduc = new ArrayList<>();


    public boolean addProdc ( Productos producto){
        return listProduc.add(producto);
    }
    public Administrador(ArrayList<Productos> listProduc) {
        this.listProduc = listProduc;
    }

    public ArrayList<Productos> getListProduc() {
        return listProduc;
    }

    public void setListProduc(ArrayList<Productos> listProduc) {
        this.listProduc = listProduc;
    }
}
