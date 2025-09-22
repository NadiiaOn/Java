package MedievalWitch;

public class Cave {

    private String moveNorth;
    private String moveSouth;
    private String moveWest;
    private String moveEast;


    public Cave(String moveNorth, String moveSouth, String moveWest, String moveEast) {
        this.moveNorth = moveNorth;
        this.moveSouth = moveSouth;
        this.moveWest = moveWest;
        this.moveEast = moveEast;

    }
    public String getMoveNorth() {
        return moveNorth;
    }

    public void setMoveNorth(String moveNorth) {
        this.moveNorth = moveNorth;
    }

    public String getMoveSouth() {
        return moveSouth;
    }

    public void setMoveSouth(String moveSouth) {
        this.moveSouth = moveSouth;
    }

    public String getMoveWest() {
        return moveWest;
    }

    public void setMoveWest(String moveWest) {
        this.moveWest = moveWest;
    }

    public String getMoveEast() {
        return moveEast;
    }

    public void setMoveEast(String moveEast) {
        this.moveEast = moveEast;
    }
}
