package thedrake;

public interface Tile {
    public boolean canStepOn();

    // Vrací True, pokud tato dlaždice obsahuje jednotku
    public boolean hasTroop();
}
