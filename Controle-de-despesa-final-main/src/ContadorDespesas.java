package model;

public class ContadorDespesas {
    private static int totalDespesas = 0;

    public static void incrementar() {
        totalDespesas++;
    }

    public static int getTotalDespesas() {
        return totalDespesas;
    }
}