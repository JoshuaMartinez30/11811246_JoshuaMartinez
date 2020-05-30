package pkg11811246_joshuamartinez;

import java.awt.Color;

public class Ropa extends Objetos{
    String talla, tela, pais;

    public Ropa(String talla, String tela, String pais, Color color, String descripcion, String marca, String tamaño, String calidad, String persona) {
        super(color, descripcion, marca, tamaño, calidad, persona);
        this.talla = talla;
        this.tela = tela;
        this.pais = pais;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Ropa{" + "talla=" + talla + ", tela=" + tela + ", pais=" + pais + '}';
    }
    
    
}
