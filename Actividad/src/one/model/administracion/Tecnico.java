package one.model.administracion;

/**
 *
 * @author decar
 */
public class Tecnico extends Planta {

    private int nivel;
    private int salario;

    // DOCUMENTAR

    public Tecnico(int idPersona, String nombrePersona, String apePersona, 
            String fechaNacimiento, String cuidadNacimiento, String genero, 
            int estrato, String dependencia, String titulo, String fechaVinculacion
            , int nivel, int salario) {
        super(idPersona, nombrePersona, apePersona, fechaNacimiento, cuidadNacimiento, genero, estrato, dependencia, titulo, fechaVinculacion);
        this.nivel = nivel;
        this.salario = salario;
    }
    

    // DOCUMENTAR
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
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
    public String mostrarDatosAdminPlanta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }    
    
    @Override
    public String toString() {
        return super.toString()
                + "\nNivel: " + this.nivel
                + "\nSalario: " + this.salario
                + informacionAdicional();
    }
}
