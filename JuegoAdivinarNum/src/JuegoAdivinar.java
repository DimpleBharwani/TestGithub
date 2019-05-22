public class JuegoAdivinar {
    Player p1;
    Player p2;
    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        int adivinarp1 = 0;
        int adivinarp2 = 0;
        boolean p1isRight = false;
        boolean p2isRight = false;
        int numero = (int)(Math.random() * 10);
        System.out.println("Estoy pensando en un n�mero entre 0 y 9...");
        while (true) {
            System.out.println("El n�mero que hay que adivinar es " + numero);
            p1.adivinar();
            p2.adivinar();
            adivinarp1 = p1.number;
            System.out.println("Player 1 adivin� " + adivinarp1);
            adivinarp2 = p2.number;
            System.out.println("Player 2 adivin� " + adivinarp2);
            if (adivinarp1 == numero) {
                p1isRight = true;
            }
            if (adivinarp2 == numero) {
                p2isRight = true;
            }
            if (p1isRight || p2isRight) {
                System.out.println("Tenemos un ganador!");
                System.out.println("Player 1 acert�? " + p1isRight);
                System.out.println("Player 2 acert�? " + p2isRight);
                System.out.println("Game is over.");
                break; // juego acabado, asi que se sale del loop
            } else {
                // seguimos porque nadie acert�
                System.out.println("Hay que intentarlo de nuevo");
            } // end if/else
        } // end loop
    } // end method
} // end class