package Moonlander;

import java.util.Scanner;

public class LanderControls implements ILanderControls {
    private Scanner sc;

    public LanderControls(Scanner sc) {

    }

    public void ILanderControls(final Scanner sc) {
        this.sc = sc;
    }

    @Override
    public int getSecondsOfFuelBurn(int altitude, int velocity) {
        System.out.println("Altitude: " + altitude);
        System.out.println("Velocity: " + velocity);
        return sc.nextInt();
    }
}
