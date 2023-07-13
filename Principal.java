public class Principal {
    public static void main(String[] args) {

        Personaje guerrero = new Guerrero(50, "Castulo", 100, 20);
        Mago mago = new Mago(500, "Naranjito", 80, 15);
        Arquero arquero = new Arquero(100, "Filomeno", 90, 18);

        // Simular combate
        guerrero.atacar(mago);
        mago.recibirDanio(10);
        arquero.atacar(guerrero);
        guerrero.recibirDanio(15);
        mago.lanzarHechizos(arquero);
        arquero.recibirDanio(20);
    }
}
