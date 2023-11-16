package one.model.administracion;

import one.model.Persona;

/**
 *
 * @author decar
 */
public abstract class Administrativos extends Persona {

    private String dependencia;
    private String titulo;

    // DOCUMENTAR
    public Administrativos(int idPersona, String nombrePersona, String apePersona,
            String fechaNacimiento, String cuidadNacimiento, String genero,
            int estrato, String dependencia, String titulo) {
        super(idPersona, nombrePersona, apePersona, fechaNacimiento, cuidadNacimiento, genero, estrato);
        this.dependencia = dependencia;
        this.titulo = titulo;
    }

    // DOCUMENTAR
    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nDependecia: " + this.dependencia
                + "\nTitulo: " + this.titulo;
    }
}
