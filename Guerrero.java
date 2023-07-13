public class Guerrero extends Personaje{
    private int fuerzaDeAtaque;

    public Guerrero(int fuerzaDeAtaque, String nombre, int nivel, int puntosDeVida){
        super(nombre, nivel, puntosDeVida);
        this.fuerzaDeAtaque = fuerzaDeAtaque;
    }
    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(nombre + " realiza un poderoso ataque a " + objetivo.getNombre());
    }
}