import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public  class Graphic {


    public static BufferedImage inventory_window;
    public static BufferedImage sharp_window;
    public static BufferedImage zero;
    public static BufferedImage one;
    public static BufferedImage two;
    public static BufferedImage three;

    public static BufferedImage four;

    public static BufferedImage five;
    public static BufferedImage six;
    public static BufferedImage seven;

    public static BufferedImage eight;

    public static BufferedImage nine;

    public static BufferedImage upgrade_button;



    public static void loadImages_CN() throws IOException {

        File file = new File("CN\\+0.png");

        if(file.exists()) System.out.println("file exist");
        else System.out.println("file not exist");


        inventory_window = ImageIO.read(new File("CN\\inventory_window.png"));
        sharp_window = ImageIO.read(new File("CN\\sharp_window.png"));


        upgrade_button = ImageIO.read(new File("CN\\upgrade_button.png"));

        zero = ImageIO.read(new File("CN\\+0.png"));
        one = ImageIO.read(new File("CN\\+1.png"));
        two = ImageIO.read(new File("CN\\+2.png"));
        three = ImageIO.read(new File("CN\\+3.png"));
        four = ImageIO.read(new File("CN\\+4.png"));
        five = ImageIO.read(new File("CN\\+5.png"));
        six = ImageIO.read(new File("CN\\+6.png"));
        seven = ImageIO.read(new File("CN\\+7.png"));
        eight = ImageIO.read(new File("CN\\+8.png"));


    }

    public static void loadImages_RUS() throws IOException {

        inventory_window = ImageIO.read(new File("RUS\\inventory_window.png"));
        sharp_window = ImageIO.read(new File("RUS\\sharp_window.png"));


        upgrade_button = ImageIO.read(new File("RUS\\upgrade_button.png"));

        zero = ImageIO.read(new File("RUS\\+0.png"));
        one = ImageIO.read(new File("RUS\\+1.png"));
        two = ImageIO.read(new File("RUS\\+2.png"));
        three = ImageIO.read(new File("RUS\\+3.png"));
        four = ImageIO.read(new File("RUS\\+4.png"));
        five = ImageIO.read(new File("RUS\\+5.png"));
        six = ImageIO.read(new File("RUS\\+6.png"));
        //four = ImageIO.read(new File("C:\\Users\\CHYEAH\\Desktop\\SHARPEN\\+4.png"));
        //five = ImageIO.read(new File("C:\\Users\\CHYEAH\\Desktop\\SHARPEN\\+5.png"));



        System.out.println("rus images");


    }

    public static void loadImages_RUS_OF() throws IOException{


        inventory_window = ImageIO.read(new File("RU_OFF\\inventory_window.png"));

        sharp_window = ImageIO.read(new File("RU_OFF\\sharp_window.png"));

        upgrade_button = ImageIO.read(new File("RU_OFF\\upgrade_button.png"));

        zero = ImageIO.read(new File("RU_OFF\\+0.png"));
        one = ImageIO.read(new File("RU_OFF\\+1.png"));
        two = ImageIO.read(new File("RU_OFF\\+2.png"));
        three = ImageIO.read(new File("RU_OFF\\+3.png"));
        four = ImageIO.read(new File("RU_OFF\\+4.png"));
        five = ImageIO.read(new File("RU_OFF\\+5.png"));
        six = ImageIO.read(new File("RU_OFF\\+6.png"));
        seven = ImageIO.read(new File("RU_OFF\\+7.png"));
        eight = ImageIO.read(new File("RU_OFF\\+8.png"));
        nine = ImageIO.read(new File("RU_OFF\\+9.png"));



        System.out.println("rus off images");
    }



}
