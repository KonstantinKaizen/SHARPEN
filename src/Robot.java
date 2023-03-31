import java.awt.*;
import java.awt.event.InputEvent;

public class Robot {

    public static boolean CHINA = false;

    public static int inc_x = 0;
    public static int inc_y = 0;


    public static java.awt.Robot robot;

    static {
        try {
            robot = new java.awt.Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }


    public static void leftClick(int x,int y) throws InterruptedException {
        robot.mouseMove(x, y);
        Thread.sleep(100);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(60);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    public static void rightClick(int x,int y) throws InterruptedException {
        robot.mouseMove(x, y);
        Thread.sleep(100);
        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        Thread.sleep(60);
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
    }

    public static void cleanStone() throws InterruptedException {
        if(CHINA) robot.mouseMove(Sharp_Util.sharp_x-72-inc_x, Sharp_Util.sharp_y+129+inc_y);
        else robot.mouseMove(Sharp_Util.sharp_x-137, Sharp_Util.sharp_y-317);
        Thread.sleep(300);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(100);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(200);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(100);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    public static void upgrade() throws InterruptedException {

        if(CHINA) robot.mouseMove(Sharp_Util.sharp_x-50, Sharp_Util.sharp_y+372);
        else robot.mouseMove(Sharp_Util.sharp_x-23, Sharp_Util.sharp_y-43);
        Thread.sleep(50);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(50);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(Sharp_Util.sharp_x+10, Sharp_Util.sharp_y+10);
    }



    public static void equpPodzemka() throws InterruptedException {
        robot.mouseMove(Sharp_Util.inventory_x+94, Sharp_Util.inventory_y+311);
        Thread.sleep(300);
        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        Thread.sleep(100);
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
    }

    public static void equpNebeska() throws InterruptedException {
        robot.mouseMove(Sharp_Util.inventory_x+133, Sharp_Util.inventory_y+312);
        Thread.sleep(300);
        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        Thread.sleep(100);
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
    }







}
