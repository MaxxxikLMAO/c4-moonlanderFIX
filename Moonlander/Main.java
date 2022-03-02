package Moonlander;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final Scanner sc = new Scanner(System.in);
        final LanderControls controls = new LanderControls(sc);


        try {
            final var lander = new LunarLanding(
                    controls,
                    5000,
                    500
            );

            lander.land();
            sc.close();

        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
