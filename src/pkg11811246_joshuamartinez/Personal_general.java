package pkg11811246_joshuamartinez;

import java.util.ArrayList;

public class Personal_general extends Persona{
    
    private String ocupacion, horario;
    private int tiempo;
    private double sueldo;

    public Personal_general() {
        super();
    }

    public Personal_general(String ocupacion, String horario, int tiempo, double sueldo, int identificacion, String nombre, int edad, String Sexo, String Estado_civil, double Altura, double peso, ArrayList m) {
        super(identificacion, nombre, edad, Sexo, Estado_civil, Altura, peso, m);
        this.ocupacion = ocupacion;
        this.horario = horario;
        this.tiempo = tiempo;
        this.sueldo = sueldo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
    
}
