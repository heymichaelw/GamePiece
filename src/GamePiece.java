import java.util.Random;

public class GamePiece {
    public String name;
    public String color;
    private int positionX;
    private int positionY;
    private boolean frozen;
    private int minX;
    private int maxX;
    private int minY;
    private int maxY;

    public GamePiece() {
        this.positionX = 0;
        this.positionY = 0;
        this.minX = 0;
        this.maxX = 50;
        this.minY = 0;
        this.maxY = 100;
        this.frozen = false;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public int getMaxX() {
        return maxX;
    }


    public int getMaxY() {
        return maxY;
    }

    public int getMinX() {
        return minX;
    }

    public int getMinY() {
        return minY;
    }

    public void move(){
        if (!frozen){
            Random random = new Random();
            int thisMaxX = this.getMaxX();
            int thisMinX = this.getMinX();
            this.positionX = random.nextInt();
            if (this.positionX > thisMaxX){
                System.out.println("That's off the board!");
                this.positionX = thisMaxX;
            }
            if (this.positionX < thisMinX){
                System.out.println("That's off the board!");
                this.positionX = thisMinX;
            }
            int thisMinY = this.getMinY();
            int thisMaxY = this.getMaxY();
            this.positionY = random.nextInt();
            if (this.positionY > thisMaxY){
                System.out.println("That's off the board!");
                this.positionY = thisMaxY;
            }
            if (this.positionY < thisMinY){
                System.out.println("That's off the board!");
                this.positionY = thisMinY;
            }

        } else {
            System.out.println("You are frozen and cannot move!");
        }
    }

    public void freeze(){
        this.frozen = true;
    }

    public void unfreeze(){
        this.frozen = false;
    }
}
