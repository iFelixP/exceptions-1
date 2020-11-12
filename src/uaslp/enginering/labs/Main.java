package uaslp.enginering.labs;

public class Main {

    public static void main(String[] args) {
        otro();
    }

    public static void otro() {
        try {
            System.out.println("A0");
            move();
            System.out.println("A1");
        } catch (PhantomCollisionException e) {
            System.out.println("A2");
            e.printStackTrace();
        } catch (WallCollisionException e) {
            System.out.println("A3");
            e.printStackTrace();
        }

        System.out.println("A4");
    }

    private static void stopMovement() {

    }

    private static void die() {

    }

    public static void move() throws PhantomCollisionException, WallCollisionException {
        setPosition(getX() + 1, getY());

        if (hasCollisions(Phantom.class)) {
            throw new PhantomCollisionException();
        }

        if (hasCollisions(Wall.class)) {
            throw new WallCollisionException();
        }

    }

    public static void setPosition(int x, int y) {

    }

    public static int getX() {
        return 0;
    }

    public static int getY() {
        return 0;
    }

    public static boolean hasCollisions(Class c) {
        boolean booleanForTest = false;

        return booleanForTest;
    }


}
