package src;

public class Ladder extends SpecialEntity {

    public Ladder(int start, int end) {

        super(start, end);
    }

    @Override
    public String getID() {

        return "L_" + this.getStartPosition() + "_" + this.getEndPosition();
    }
}