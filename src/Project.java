public class Project extends World {
    double pos;
    public void go() {
        plane.pausetime = 0;
        plane.trailWidth = 30;

        //make 3 rows of 40 sine waves
        boolean lol = true;
        if (lol)   {
            for (int temp2=0; temp2<3; temp2++) {
                for (int temp=0; temp<40; temp++) {
                        sineWave(100+ 250*temp2, (10*temp), plane.random(0,255), plane.random(0,255),plane.random(0,255));
                }
            }
        }
    }

    //sineWave method creates a sinewave with parameters for midline, HS, and color
    public void sineWave(int height, int horizontalShift, int redValue, int greenValue, int blueValue) {
        for (pos = 0; pos < 1000; pos++) {
            //(working in degrees) let yValue be sin of plane.xpos in px
            double posDegree = (Math.toDegrees(pos-horizontalShift));
            double yValue = Math.toDegrees(Math.sin(posDegree * 0.0003));

            //teleport the plane to plane.xpos, midline (int height) plus 1.5*yValue
            plane.teleport(pos, height + (1.5 * yValue));
            plane.setPixelColor(redValue, greenValue, blueValue);
            System.out.println(yValue);

            //pretty unnecessary loop to make the trail vertically thicker
            plane.teleport(plane.xpos, plane.ypos - 2);
            for (int thick = 0; thick < 5; thick++) {
                plane.setPixelColor(redValue, greenValue, blueValue);
                plane.teleport(plane.xpos, plane.ypos + 1);
            }


        }
    }



}
