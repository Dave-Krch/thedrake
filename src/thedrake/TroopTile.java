package thedrake;

public class TroopTile implements Tile {

    private final Troop troop;
    private final PlayingSide troop_side;
    private final TroopFace troop_face;

    // Konstruktor
    public TroopTile(Troop troop, PlayingSide side, TroopFace face) {
        this.troop = troop;
        this.troop_side = side;
        this.troop_face = face;
    }

    // Vrací barvu, za kterou hraje jednotka na této dlaždici
    public PlayingSide side() {
        return troop_side;
    }

    // Vrací stranu, na kterou je jednotka otočena
    public TroopFace face() {
        return troop_face;
    }

    // Jednotka, která stojí na této dlaždici
    public Troop troop() {
        return troop;
    }

    // Vrací False, protože na dlaždici s jednotkou se nedá vstoupit
    @Override
    public boolean canStepOn() {
        return false;
    }

    // Vrací True
    @Override
    public boolean hasTroop() {
        return true;
    }

    // Vytvoří novou dlaždici, s jednotkou otočenou na opačnou stranu
    // (z rubu na líc nebo z líce na rub)
    public TroopTile flipped() {
        TroopFace flipped_face;
        if(troop_face == TroopFace.AVERS)
            flipped_face = TroopFace.REVERS;
        else
            flipped_face = TroopFace.AVERS;

        return new TroopTile(troop, troop_side, flipped_face);
    }
}
