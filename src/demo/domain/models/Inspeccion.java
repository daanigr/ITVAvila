package demo.domain.models;

public class Inspeccion {

    private String Code;
    private String Date;
    private Boolean Resultado;
    private String Matricula;
    private String Dni;
    private Propietario propietario;


    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public Boolean getResultado() {
        return Resultado;
    }

    public void setResultado(Boolean resultado) {
        Resultado = resultado;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
}
