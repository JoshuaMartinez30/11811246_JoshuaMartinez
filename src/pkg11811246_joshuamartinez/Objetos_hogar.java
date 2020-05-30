package pkg11811246_joshuamartinez;

import java.awt.Color;

public class Objetos_hogar extends Objetos{
    private String descripcion_h, instrucciones;
    private int garantia;

    public Objetos_hogar() {
        super();
    }

    public Objetos_hogar(String descripcion_h, String instrucciones, int garantia, Color color, String descripcion, String marca, String tamaño, String calidad, Persona persona) {
        super(color, descripcion, marca, tamaño, calidad, persona);
        this.descripcion_h = descripcion_h;
        this.instrucciones = instrucciones;
        this.garantia = garantia;
    }

    public String getDescripcion_h() {
        return descripcion_h;
    }

    public void setDescripcion_h(String descripcion_h) {
        this.descripcion_h = descripcion_h;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    @Override
    public String toString() {
        return "Objetos_hogar{" + "descripcion_h=" + descripcion_h + ", instrucciones=" + instrucciones + ", garantia=" + garantia + '}';
    }
    
    
    
}
