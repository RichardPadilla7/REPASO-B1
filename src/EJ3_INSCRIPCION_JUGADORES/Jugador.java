package EJ3_INSCRIPCION_JUGADORES;

public class Jugador {

    private String nombre;
    private int anioNacimiento, nCamiseta;

    public Jugador(String nombre, int anioNacimiento, int nCamiseta){
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
        this.nCamiseta = nCamiseta;
    }
    // getters
    public String getNombre(){
        return nombre;
    }

    public int getAnioNacimiento(){
        return anioNacimiento;
    }

    public int getnCamiseta(){
        return nCamiseta;
    }

    public void setnCamiseta(int nCamiseta){
        this.nCamiseta = nCamiseta;
    }

    public void modificarNumeroCamiseta(String nombre, int nuevoNumeroCamiseta) {
        if (this.nombre.equals(nombre)) {
            System.out.println("Nombre: " + getNombre());
            System.out.println("Año de nacimiento: " + getAnioNacimiento());
            System.out.println("Numero de camiseta: " + getnCamiseta());
        } else {
            System.out.println("El nombre del jugador no coincide");
        }
    }

    public double calcularVenta(int cantidad){
        double total = 25.00 * cantidad;
        return total;
    }
}
