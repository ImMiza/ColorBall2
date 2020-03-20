package fr.miza.utils;

public enum GameColor {

    BLACK ("050505"),
    WHITE ("ECECEC"),
    BLUE ("37ADB0"),
    RED ("E53939");

    private String hex;
    GameColor(String hex) {
        this.hex = hex;
    }

    public String getHex() {
        return hex;
    }
}
