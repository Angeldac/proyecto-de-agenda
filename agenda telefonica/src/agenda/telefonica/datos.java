package agenda.telefonica;


public class datos {
       private int telefono;
 private String nombre,correo;

    public datos(int telefono, String nombre, String correo) {
        this.telefono = telefono;
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return this. telefono;
    }
    
}
