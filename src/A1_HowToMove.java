public class A1_HowToMove extends World {


    //This is the method that your program looks for and executes when you 'run' it
    public void go() {



        System.out.println("skibiti bum bum bum bum yes yes yes yes");
        System.out.println("That window is called the dos window");
        plane.pausetime = 2;
        plane.pausetime = plane.pausetime + 1;
        boolean forLoop = false;

        for (int lol = 0; lol <20; lol = lol+1) {
            if (forLoop) {

                System.out.println("testing for loops lol funny lmao hehe");
                System.out.println(lol);
                forLoop = false;
            }
            else {

                System.out.println("testing but its a loop so its gonna alternate hehe");
                System.out.print(lol);
                forLoop = true;
            }


        }
        plane.startingAngle(0);
        plane.isTrail = false;
        plane.move(200);
        plane.isTrail = false;
        plane.move(100);
        plane.isTrail = true;
        plane.move(250);


    }

}

/*

Methods:
- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.

*/