package demo.domain.models;

public class Motocicleta implements Vehiculo{

    private String Matricula;
    private String Marca;
    private String Model;
    private String Color;
    private String AnoMatriculacion;
    private String DiametroRuedas;

    @Override
    public String getMatricula() {
        return null;
    }

    @Override
    public String getMarca() {
        return null;
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public String getAnoMatriculacion() {
        return null;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setAnoMatriculacion(String anoMatriculacion) {
        AnoMatriculacion = anoMatriculacion;
    }

    public String getDiametroRuedas() {
        return DiametroRuedas;
    }

    public void setDiametroRuedas(String diametroRuedas) {
        DiametroRuedas = diametroRuedas;
    }
}
