package pkg11811246_joshuamartinez;

import java.util.ArrayList;

public class Persona {
    private int identificacion;
    private String nombre;
    private int edad;
    private String Sexo;
    private String Estado_civil;
    private double Altura;
    private double peso;
    private String cargoo;
    private ArrayList m = new ArrayList();

    public Persona() {
    }

    public Persona(int identificacion, String nombre, int edad, String Sexo, String Estado_civil, double Altura, double peso, ArrayList m) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
        this.Sexo = Sexo;
        this.Estado_civil = Estado_civil;
        this.Altura = Altura;
        this.peso = peso;
        setM(m);
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargoo() {
        return cargoo;
    }

    public void setCargoo(String cargoo) {
        this.cargoo = cargoo;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getEstado_civil() {
        return Estado_civil;
    }

    public void setEstado_civil(String Estado_civil) {
        this.Estado_civil = Estado_civil;
    }
    
    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public ArrayList getM() {
        return m;
    }

    public void setM(ArrayList m) {
        this.m = m;
    }

    @Override
    public String toString() {
        return  nombre;
    }
}
