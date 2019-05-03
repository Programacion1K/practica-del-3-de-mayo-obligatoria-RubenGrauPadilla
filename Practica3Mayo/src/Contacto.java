import java.util.Objects;

public class Contacto {
    private final String nombre;
    private final int numeroTelefono;

    public Contacto(String nombre, int numeroTelefono) {
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return numeroTelefono == contacto.numeroTelefono &&
                Objects.equals(nombre, contacto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, numeroTelefono);
    }

    @Override
    public String toString() {
        return "{" +
                 nombre + '\'' +
                ", numeroTelefono=" + numeroTelefono +
                '}';
    }
}
