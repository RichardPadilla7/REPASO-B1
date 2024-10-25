//Richard Padilla
package EJ1_ROL_JUEGO;

public class Main {
    public static void main(String[] args){

        Personaje personaje1 = new Personaje("Richard", "0987654321",2004);
        System.out.println(personaje1.getNombre()); //Consultar la informacion usando solo getters
        System.out.println(personaje1.getTelefono());
        System.out.println(personaje1.getAnioNacimiento());

        personaje1.setTelefono("0123456789"); //Cambiar la informacion usando solo setters
        System.out.println("El nuevo telefono es: " + personaje1.getTelefono());
        //No se modifica nada mas que el telefono

    }
}
