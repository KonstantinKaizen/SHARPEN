import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {




    public static int width = 620;
    public static int height = 400;
    public static JFrame frame;


    public Main(){
        frame = new JFrame();
        frame.setTitle("Sharp");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(width,height);
        frame.setLocationRelativeTo(null);
        frame.add(new Back());
        frame.setVisible(true);
        frame.setResizable(false);
        //frame.setBackground(Color.CYAN);





    }

    public static void main(String[] args) throws Exception {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });
        System.out.println("Finish");
        Thread.sleep(1000000);





/*
        //BufferedImage image = ImageIO.read(new File("C:\\Users\\CHYEAH\\Desktop\\SHARPEN\\Capture.png"));

        Robot.leftClick(54,17);
        Thread.sleep(1000);



            isOnScreen.findImage_result inventory_result = isOnScreen.findImage(Graphic.inventory_window);

            if (!inventory_result.result) {
                System.out.println("inventory window  FALSE");
            } else {
                //System.out.println("inventory window  TRUE");
                Robot.rightClick(inventory_result.x_pos+Items.item_1.x_pos, inventory_result.y_pos+Items.item_1.y_pos);
                Thread.sleep(1000);

            }

        System.out.println(Sharp_Util.determine_sharpening_level());

        if (!inventory_result.result) {
            System.out.println("inventory window  FALSE");
        } else {
            //System.out.println("inventory window  TRUE");
            Robot.rightClick(inventory_result.x_pos+Items.item_2.x_pos, inventory_result.y_pos+Items.item_2.y_pos);
            Thread.sleep(1000);

        }

        System.out.println(Sharp_Util.determine_sharpening_level());


        if (!inventory_result.result) {
            System.out.println("inventory window  FALSE");
        } else {
            //System.out.println("inventory window  TRUE");
            Robot.rightClick(inventory_result.x_pos+Items.item_3.x_pos, inventory_result.y_pos+Items.item_3.y_pos);
            Thread.sleep(1000);

        }

        System.out.println(Sharp_Util.determine_sharpening_level());








        isOnScreen.findImage_result sharp_result = isOnScreen.findImage(Graphic.sharp_window);

        if (!sharp_result.result) {
            System.out.println("sharp window  FALSE");
        } else {
            System.out.println("sharp window  TRUE");
            Thread.sleep(1000);
            Robot.leftClick(sharp_result.x_pos, sharp_result.y_pos);

        }



        isOnScreen.findImage_result zero = isOnScreen.findImage(Graphic.zero);

        if (!zero.result) {
            System.out.println("sharp window  FALSE");
        } else {
            System.out.println("sharp window  TRUE");
            Thread.sleep(1000);
            Robot.leftClick(zero.x_pos, zero.y_pos);

        }

        */





    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}