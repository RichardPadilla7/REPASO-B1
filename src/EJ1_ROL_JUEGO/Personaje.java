package EJ1_ROL_JUEGO;

public class Personaje {

    private String nombre;
    private String telefono;
    private int anioNacimiento;

    public Personaje(String nombre, String telefono, int anioNacimiento){
        this.nombre = nombre;
        this.telefono = telefono;
        this.anioNacimiento = anioNacimiento;
    }

    public String getNombre(){
        return nombre;
    }

    public int getAnioNacimiento(){
        return anioNacimiento;
    }

    public  String getTelefono(){
        return telefono;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
}
