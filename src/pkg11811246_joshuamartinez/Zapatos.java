package pkg11811246_joshuamartinez;

import java.awt.Color;

public class Zapatos extends Objetos{
    private String  descripcion_z;
    private int talla, comodidad;

    public Zapatos() {
        super();
    }

    public Zapatos(int talla, String descripcion_z, int comodidad, Color color, String descripcion, String marca, String tamaño, String calidad, Persona persona) {
        super(color, descripcion, marca, tamaño, calidad, persona);
        this.talla = talla;
        this.descripcion_z = descripcion_z;
        this.comodidad = comodidad;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getDescripcion_z() {
        return descripcion_z;
    }

    public void setDescripcion_z(String descripcion_z) {
        this.descripcion_z = descripcion_z;
    }

    public int getComodidad() {
        return comodidad;
    }

    public void setComodidad(int comodidad) {
        this.comodidad = comodidad;
    }

    @Override
    public String toString() {
        return "Zapatos{" + "talla=" + talla + ", descripcion_z=" + descripcion_z + ", comodidad=" + comodidad + '}';
    }
    
    
}
