package demo.domain.models;

public class Camion implements Vehiculo{

    private String Matricula;
    private String Marca;
    private String Model;
    private String Color;
    private String AnoMatriculacion;
    private String Tara;
    private String Longitud;


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

    public void setTara(String tara) {
        Tara = tara;
    }

    public void setLongitud(String longitud) {
        Longitud = longitud;
    }

    public String getTara() {
        return Tara;
    }

    public String getLongitud() {
        return Longitud;
    }

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
}
