package model;

public class ArcadeGame extends Game {
    private int estimatedDuration;

    private int numberOfPlayer;

    private Boolean pocket;

    public ArcadeGame() {
    }

    public ArcadeGame(int estimatedDuration, int numberOfPlayer, Boolean pocket) {
        this.estimatedDuration = estimatedDuration;
        this.numberOfPlayer = numberOfPlayer;
        this.pocket = pocket;
    }

    public int getEstimatedDuration() {
        return estimatedDuration;
    }

    public void setEstimatedDuration(int estimatedDuration) {
        this.estimatedDuration = estimatedDuration;
    }

    public int getNumberOfPlayer() {
        return numberOfPlayer;
    }

    public void setNumberOfPlayer(int numberOfPlayer) {
        this.numberOfPlayer = numberOfPlayer;
    }

    public Boolean getPocket() {
        return pocket;
    }

    public void setPocket(Boolean pocket) {
        this.pocket = pocket;
    }

    @Override
    public void trying(){
        System.out.println("Trying " + getTitle() + ". Estimated duration: "+estimatedDuration);
    }
}
