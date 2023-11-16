package one.model.docente;

/**
 *
 * @author decar
 */
public class TiempoCompleto extends Docente {

    private String categoria;
    private int puntos;
    private int salario;

    public TiempoCompleto(int idPersona, String nombrePersona, String apePersona,
            String fechaNacimiento, String cuidadNacimiento, String genero,
            int estrato, String areaFormacion, String tituloProfesional,
            String unidadAcademica, String categoria, int puntos, int salario) {
        super(idPersona, nombrePersona, apePersona, fechaNacimiento, cuidadNacimiento, genero, estrato, areaFormacion, tituloProfesional, unidadAcademica);
        this.categoria = categoria;
        this.puntos = puntos;
        this.salario = salario;
    }

    // DOCUMENTAR 
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
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
                + "\ncategoria: " + this.categoria
                + "\nPuntos: " + this.puntos
                + "\nSalario: " + this.salario
                + informacionAdicional();
    }
}
