package one.model;

/**
 *
 * @author decar
 */
public abstract class Persona {

    private final int idPersona;
    private final String nombrePersona;
    private final String apePersona;
    private final String fechaNacimiento;
    private final String cuidadNacimiento;
    private final String genero;
    private final String tipo;
    private int estrato;

    // DOCUMENTAR
    public Persona(int idPersona, String nombrePersona, String apePersona, String fechaNacimiento, String cuidadNacimiento, String genero, int estrato) {
        this.idPersona = idPersona;
        this.nombrePersona = nombrePersona;
        this.apePersona = apePersona;
        this.fechaNacimiento = fechaNacimiento;
        this.cuidadNacimiento = cuidadNacimiento;
        this.genero = genero;
        this.estrato = estrato;
        this.tipo = this.getClass().getName();
    }

    public int getIdPersona() {
        return idPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public String getApePersona() {
        return apePersona;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getCuidadNacimiento() {
        return cuidadNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    // Desde aqui complementar todo el codigo faltante
    public String informacionAdicional() {
        return "\n---Informacion Adicional---"
                + "\nEPS: " + calcularEPS()
                + "\nPension: " + calculaPension()
                + "\nARL: " + calculaARL()
                + "\nSENA: " + calcularSENA()
                + "\nCajas: " + calcularCajas()
                + "\nICBF: " + calculaICBF()
                + "\nAuxilio: " + calculaAuxilio();
    }

    // realmente esto debe ser abstract
    public abstract void mostrarDG();

    public abstract int calcularEPS();

    public abstract int calculaPension();

    public abstract int calculaARL();

    public abstract int calcularSENA();

    public abstract int calcularCajas();

    public abstract int calculaICBF();

    public abstract int calculaAuxilio();

    @Override
    public String toString() {
        return this.getClass().getName()
                + "\nNombre: " + this.nombrePersona
                + "\nApellido: " + this.apePersona
                + "\nFechaNacimiento: " + this.fechaNacimiento
                + "\nCuiadadNacimiento: " + this.cuidadNacimiento
                + "\nGenero: " + this.genero
                + "\nEstrato: " + this.estrato
                + "\nId: " + this.idPersona;
    }
}
