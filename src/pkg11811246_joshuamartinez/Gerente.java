package pkg11811246_joshuamartinez;

import java.util.ArrayList;

public class Gerente extends Persona{
    private String usuario, contraseña, cargo;

    public Gerente() {
        super();
    }

    public Gerente(String usuario, String contraseña, String cargo, int identificacion, String nombre, int edad, String Sexo, String Estado_civil, double Altura, double peso, ArrayList m) {
        super(identificacion, nombre, edad, Sexo, Estado_civil, Altura, peso, m);
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.cargo = cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString();
    }

        
}
