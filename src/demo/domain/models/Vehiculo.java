package demo.domain.models;

import javax.management.modelmbean.ModelMBean;
import java.awt.*;

public interface Vehiculo {

    public String getMatricula() {
        return Matricula;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModel() {
        return Model;
    }

    public String getColor() {
        return Color;
    }

    public String getAnoMatriculacion() {
        return AnoMatriculacion;
    }

}
