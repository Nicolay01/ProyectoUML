package one.model;

/**
 *
 * @author decar
 */
public class GestorPersonas {

    private static int contadorID = 0;
    private final Persona[] personas;
    private final int cantElementos;
    private int contador = 0;

    public static int getContadorID() {
        return contadorID;
    }

    // DOCUMENTAR
    public GestorPersonas(int cantElementos) {
        this.cantElementos = cantElementos;
        this.personas = new Persona[this.cantElementos];
    }

    // DOCUMENTAR
    public Persona[] getPersonas() {
        return this.personas;
    }

    public int getCantElementos() {
        return this.cantElementos;
    }

    public int getContador() {
        return this.contador;
    }

    // DOCUMENTAR estos metodos
    public boolean tope() {
        return contador == cantElementos;
    }

    public boolean vacio() {
        return contador < 0;
    }

    public boolean agregarPersona(Persona persona) {
        if (tope()) {
            return false;
        } else {
            personas[contador] = persona;
            contador++;
            contadorID = contador;
            return true;
        }
    }

    public boolean eliminarPersona(int posicion) {
        if (vacio()) {
            return false;
        } else {
            personas[contador] = null;
            contador--;
            contadorID = contador;
            return true;
        }
    }

    public Persona buscarPersona(int posicion) {
        if (vacio()) {
            return null;
        } else {
            return personas[posicion];
        }
    }
}