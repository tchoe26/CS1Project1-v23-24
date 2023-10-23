

public class A4_howITurn extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.startingAngle(0);

        plane.isTrail = true;
        plane.trailWidth = 10;

        plane.teleport(100, 100);
        plane.setColor(200, 0, 0);
       house();

        plane.teleport(100, 500);
        plane.setColor(200, 0, 0);
        plane.turn(90);
       house();

        plane.teleport(800, 500);
        plane.setColor(150, 150, 255);
        plane.turn(90);
       house();

        plane.teleport(800, 100);
        plane.setColor(200, 0, 0);
        plane.turn(90);
        house();
    }

    public void tri() {



        plane.move(100);
        plane.turn(120);

        plane.move(100);
        plane.turn(120);

        plane.move(100);

    }
    public void square() {

        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);

    }
    public void house() {

        tri();
        plane.turn(30);
        square();

    }



}
