package one.model.administracion;

import java.util.Date;

/**
 *
 * @author decar
 */
public class OPS extends Administrativos {

    private final String fechaVinculacion;
    private int numMeses;
    private int valorContrato;
    private int salario;

    public OPS(int idPersona, String nombrePersona, String apePersona, String fechaNacimiento, 
            String cuidadNacimiento, String genero, int estrato, 
            String dependencia, String titulo, String fechaVinculacion, int numMeses
            , int valorContrato, int salario) {
        super(idPersona, nombrePersona, apePersona, fechaNacimiento, cuidadNacimiento, genero, estrato, dependencia, titulo);
        this.fechaVinculacion = fechaVinculacion;
        this.numMeses = numMeses;
        this.valorContrato = valorContrato;
        this.salario = salario;
    }
    
    // DOCUMENTAR
    public String getFechaVinculacion() {
        return fechaVinculacion;
    }

    public int getNumMeses() {
        return numMeses;
    }

    public void setNumMeses(int numMeses) {
        this.numMeses = numMeses;
    }

    public int getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(int valorContrato) {
        this.valorContrato = valorContrato;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    // DOCUMENTAR
    @Override
    public void mostrarDG() {
        /* Voy a utilizar para mostrar informacion de este tipo de persona*/
        
    }

    @Override
    public int calcularEPS() {
        return (int) (salario * 0.0422);
    }

    @Override
    public int calculaPension() {
        return (int) (this.salario * 0.16);
    }

    @Override
    public int calculaARL() {
        return (int) (this.salario * 0.00522);
    }

    @Override
    public int calcularSENA() {
        return (int) (this.salario * 0.02);
    }

    @Override
    public int calcularCajas() {
        double porcentaje = 0.004 + 0.0012 * getEstrato();
        return (int) (this.salario * porcentaje);
    }

    @Override
    public int calculaICBF() {
        double porcentaje = 0.03 + 0.003 * getEstrato();
        return (int) (this.salario * porcentaje);
    }

    @Override
    public int calculaAuxilio() {
         return (int) (salario / 2 * 117.174);
    }
    
    @Override
    public String toString() {
        return super.toString()
                + "\nfechaVinculacion: " + this.fechaVinculacion
                + " numMeses: " + this.numMeses
                + " valorContrato: " + this.valorContrato
                + " salario: " + this.salario;
    }
}
