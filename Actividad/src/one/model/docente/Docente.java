package one.model.docente;

import one.model.Persona;

/**
 *
 * @author decar
 */
public abstract class Docente extends Persona {

    private String areaFormacion;
    private String tituloProfesional;
    private String unidadAcademica;

    // DOCUMENTAR
    public Docente(int idPersona, String nombrePersona, String apePersona, 
            String fechaNacimiento, String cuidadNacimiento, String genero, 
            int estrato, String areaFormacion, String tituloProfesional,
            String unidadAcademica) {
        super(idPersona, nombrePersona, apePersona, fechaNacimiento, cuidadNacimiento, genero, estrato);
        this.areaFormacion = areaFormacion;
        this.tituloProfesional = tituloProfesional;
        this.unidadAcademica = unidadAcademica;
    }   
    
    // DOCUMENTAR
    public String getAreaFormacion() {
        return areaFormacion;
    }

    public void setAreaFormacion(String areaFormacion) {
        this.areaFormacion = areaFormacion;
    }

    public String getTituloProfesional() {
        return tituloProfesional;
    }

    public void setTituloProfesional(String tituloProfesional) {
        this.tituloProfesional = tituloProfesional;
    }

    public String getUnidadAcademica() {
        return unidadAcademica;
    }

    public void setUnidadAcademica(String unidadAcademica) {
        this.unidadAcademica = unidadAcademica;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nAreaFormacion: " + this.areaFormacion
                + "\nTituloProfesional: " + this.tituloProfesional
                + "\nUnidadAcademica: " + this.unidadAcademica;
    }
}
