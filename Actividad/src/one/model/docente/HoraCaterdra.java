package one.model.docente;

/**
 *
 * @author decar
 */
public class HoraCaterdra extends Docente {

    private String ultimoTitulo;
    private int numHoras;
    private int valorContrato;
    private int salario;

    // DOCUMENTAR
    public HoraCaterdra(int idPersona, String nombrePersona, String apePersona,
            String fechaNacimiento, String cuidadNacimiento, String genero,
            int estrato, String areaFormacion, String tituloProfesional,
            String unidadAcademica, String ultimoTitulo, int numHoras,
            int valorContrato, int salario) {
        super(idPersona, nombrePersona, apePersona, fechaNacimiento, cuidadNacimiento, genero, estrato, areaFormacion, tituloProfesional, unidadAcademica);
        this.ultimoTitulo = ultimoTitulo;
        this.numHoras = numHoras;
        this.valorContrato = valorContrato;
        this.salario = salario;
    }

    // DOCUMENTAR
    public String getUltimoTitulo() {
        return ultimoTitulo;
    }

    public void setUltimoTitulo(String ultimoTitulo) {
        this.ultimoTitulo = ultimoTitulo;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
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
                + "\nUltimoTitulo: " + this.ultimoTitulo
                + "\nNumHoras: " + this.numHoras
                + "\nValorContrato: " + this.valorContrato
                + "\nSalario: " + this.salario
                + informacionAdicional();
    }
}
