public class Mago extends Personaje {

    private int lanzarHechizos;

    public Mago(int lanzarHechizos, String nombre, int nivel, int puntosDeVida){
        super(nombre, nivel, puntosDeVida);
        this.lanzarHechizos = lanzarHechizos;
    }
    public void lanzarHechizos(Personaje objetivo) {
        System.out.println(nombre + " lanza un hechizo a " + objetivo.getNombre());
    }
}
