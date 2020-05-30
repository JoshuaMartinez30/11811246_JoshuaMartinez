package pkg11811246_joshuamartinez;
public class TipoPersona {
    private String Tipo;

    public TipoPersona() {
    }

    public TipoPersona(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    @Override
    public String toString() {
        return Tipo;
    }
    
    
}
