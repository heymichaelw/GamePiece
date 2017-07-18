public class Main {

    public static void main(String[] args) {

        GamePiece testPiece = new GamePiece();
        System.out.println(testPiece.isFrozen());
        testPiece.freeze();
        System.out.println(testPiece.isFrozen());
        testPiece.unfreeze();
        System.out.println(testPiece.isFrozen());
        System.out.println(testPiece.getPositionX() + " , " + testPiece.getPositionY());
        testPiece.move();
        System.out.println(testPiece.getPositionX() + " , " + testPiece.getPositionY());
        testPiece.freeze();
        testPiece.move();
        System.out.println(testPiece.getPositionX() + " , " + testPiece.getPositionY());
    }
}
