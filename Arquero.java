public class Arquero extends Personaje {

    private int lanzarFlechas;

    public Arquero(int lanzarFlechas, String nombre, int nivel, int puntosDeVida){
        super(nombre, nivel, puntosDeVida);
        this.lanzarFlechas = lanzarFlechas;
    }
    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(nombre + " dispara una flecha precisa a " + objetivo.getNombre());
    }
}
