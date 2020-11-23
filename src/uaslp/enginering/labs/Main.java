package uaslp.enginering.labs;

public class Main {

    public static void main(String[] args) {
        try {
            otro();
        }  catch(WallCollisionException e) {
            System.out.println("[X] WallCollisionException");
            e.printStackTrace();
        }
    }

    public static void otro() throws WallCollisionException{
        try {
            System.out.println("[0] otro");
            move(3);
            System.out.println("[1] otro");
        }  catch (PhantomCollisionException e) {
            System.out.println("[X] PhantomCollisionException");
        }  catch(ItemCollisionException e) {
            System.out.println("[X] ItemCollisionException");
        } finally {
            System.out.println("[2] otro");
        }

        System.out.println("[3] otro");
    }

    private static void stopMovement() {

    }

    private static void die() {

    }

    public static void move(int delta) throws PhantomCollisionException, WallCollisionException, ItemCollisionException {
        setPosition(getX() + 1, getY());

        if (hasCollisions(Phantom.class) || delta == 1) {
            throw new PhantomCollisionException();
        }

        if (hasCollisions(Wall.class) || delta == 2) {
            throw new WallCollisionException();
        }

        if (hasCollisions(Item.class) || delta == 3) {
            throw new ItemCollisionException();
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
