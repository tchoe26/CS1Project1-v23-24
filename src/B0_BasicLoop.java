public class B0_BasicLoop extends World {
    

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.teleport(50, 50);

        plane.pausetime = 0;
        plane.trailWidth = 3;
        plane.isTrail=true;

        int redStarting = 10;
        int greenStarting = 255;
        int blueStarting = 10;

        

           
            System.out.println("test");

            for (int y=0; y<7; y=y+1) {

                for(int x=0;x<10;x=x+1)
                {
                    System.out.println(x);
                    plane.setColor(redStarting +3*x, greenStarting - 10*x, blueStarting + 20*x);
                    plane.square(80);
                    plane.teleport(plane.xpos + 90 , plane.ypos);

                }

                redStarting = redStarting + 20;
                greenStarting = greenStarting - 20;
                blueStarting = blueStarting + 10;
                plane.teleport(50, plane.ypos+90);


            }










    }
}
