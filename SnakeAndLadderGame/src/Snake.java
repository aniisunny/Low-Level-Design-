package src;

public class Snake extends SpecialEntity {

    public Snake(int start, int end) {

        super(start, end);
    }

    @Override
    public String getID() {

        return "L_" + this.getStartPosition() + "_" + this.getEndPosition();
    }
}