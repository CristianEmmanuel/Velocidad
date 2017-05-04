import Velocidad.Velocidad;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Velocidad v = new VelocidadRapida();

        System.out.println(" Ingrese la velocidad del jugador ");
        int velocidadActual = scanner.nextInt();
        v.setVelocidad(velocidadActual);
        System.out.println(v.getVelocidadActual());

    }
}
