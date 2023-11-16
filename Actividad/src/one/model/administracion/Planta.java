package one.model.administracion;

/**
 *
 * @author decar
 */
public abstract class Planta extends Administrativos {

    public final String fechaVinculacion;

    // DOCUMENTAR
    public Planta(int idPersona, String nombrePersona, String apePersona, 
            String fechaNacimiento, String cuidadNacimiento, String genero, 
            int estrato, String dependencia, String titulo, String fechaVinculacion) {
        super(idPersona, nombrePersona, apePersona, fechaNacimiento, cuidadNacimiento, genero, estrato, dependencia, titulo);
        this.fechaVinculacion = fechaVinculacion;
    }
    
    // DOCUMENTAR
    public String getFechaVinculacion() {
        return fechaVinculacion;
    }

    // DOCUMENTAR
    public abstract String mostrarDatosAdminPlanta();
    
    @Override
    public String toString() {
        return super.toString()
                + "\nFechaVinculacion: " + this.fechaVinculacion;
    }
}
