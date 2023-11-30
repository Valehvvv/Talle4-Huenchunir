package Model;


public class Player {
    private String nombre;
    private int numero;
    private String posicion;

    public Player(String nombre, int numero, String posicion){
        this.nombre = nombre;
        this.numero = numero;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public String getPosicion() {
        return posicion;
    }
}
