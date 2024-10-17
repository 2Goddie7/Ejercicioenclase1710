public class llamarJugador {
    public static void main(String[] args) {
        jugador player1 = new jugador();

        player1.patear();
        player1.correr();
        System.out.println();

        jugador player2 = new jugador("Macaquinho",21,"Venezuela");

        player2.patearDos();
        player2.correrDos();
        player2.saltar(2);
    }
}
