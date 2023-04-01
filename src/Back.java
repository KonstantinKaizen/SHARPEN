import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Back extends JPanel implements ActionListener  {

    static JTextField podzemka = new JTextField("0",3);

    static JTextField nebeska = new JTextField("0",3);
    static JTextField miraj = new JTextField("0",5);

    static JTextField area_1 = new JTextField("0",2);
    static JTextField area_2 = new JTextField("0",2);
    static JTextField area_3 = new JTextField("0",2);
    static JTextField area_4= new JTextField("0",2);
    static JTextField area_5 = new JTextField("0",2);
    static JTextField area_6 = new JTextField("0",2);
    static JTextField area_7 = new JTextField("0",2);
    static JTextField area_8 = new JTextField("0",2);

    //2 ряд

    static JTextField area_9 = new JTextField("0",2);
    static JTextField area_10 = new JTextField("0",2);
    static JTextField area_11 = new JTextField("0",2);
    static JTextField area_12 = new JTextField("0",2);
    static JTextField area_13 = new JTextField("0",2);
    static JTextField area_14 = new JTextField("0",2);
    static JTextField area_15 = new JTextField("0",2);
    static JTextField area_16 = new JTextField("0",2);

    // 3 ряд

    static JTextField area_17 = new JTextField("0",2);
    static JTextField area_18 = new JTextField("0",2);
    static JTextField area_19 = new JTextField("0",2);
    static JTextField area_20 = new JTextField("0",2);
    static JTextField area_21 = new JTextField("0",2);
    static JTextField area_22 = new JTextField("0",2);
    static JTextField area_23 = new JTextField("0",2);
    static JTextField area_24 = new JTextField("0",2);



    static JButton start = new JButton("start");

    static JCheckBox china = new JCheckBox("China");

    static JCheckBox russia = new JCheckBox("funline");

    static JCheckBox russia_off = new JCheckBox("ru_off");

    static JCheckBox comeback = new JCheckBox("comeback");


    static String[] items = {
            "М",
            "Н",
            "П"
    };


    static JLabel one = new JLabel("+1");
    static JComboBox one_choice = new JComboBox(items);

    static JLabel two = new JLabel("+2");
    static JComboBox two_choice = new JComboBox(items);

    static JLabel three = new JLabel("+3");
    static JComboBox three_choice = new JComboBox(items);

    static JLabel four = new JLabel("+4");
    static JComboBox four_choice = new JComboBox(items);

    static JLabel five = new JLabel("+5");
    static JComboBox five_choice = new JComboBox(items);

    static JLabel six = new JLabel("+6");
    static JComboBox six_choice = new JComboBox(items);

    static JLabel seven = new JLabel("+7");
    static JComboBox seven_choice = new JComboBox(items);

    static JLabel eight = new JLabel("+8");
    static JComboBox eight_choice = new JComboBox(items);

    static JLabel nine = new JLabel("+9");
    static JComboBox nine_choice = new JComboBox(items);





    public Back(){



        this.setLayout(null);

        one.setBackground(Color.BLUE);
        one.setFont(new Font("Dialog",Font.PLAIN,20));
        one.setLocation(10,130);
        one.setSize(30,30);
        this.add(one);

        one_choice.setBackground(Color.LIGHT_GRAY);
        one_choice.setFont(new Font("Dialog",Font.PLAIN,20));
        one_choice.setLocation(10,170);
        one_choice.setSize(45,30);
        one_choice.addActionListener(e -> {
            SharpMethods.sharp_method_1 = ((JComboBox<?>) e.getSource()).getSelectedIndex();
            System.out.println(SharpMethods.sharp_method_1);
        });
        this.add(one_choice);



        two.setBackground(Color.BLUE);
        two.setFont(new Font("Dialog",Font.PLAIN,20));
        two.setLocation(60,130);
        two.setSize(30,30);
        this.add(two);

        two_choice.setBackground(Color.LIGHT_GRAY);
        two_choice.setFont(new Font("Dialog",Font.PLAIN,20));
        two_choice.setLocation(60,170);
        two_choice.setSize(45,30);
        two_choice.addActionListener(e -> {
            SharpMethods.sharp_method_2 = ((JComboBox<?>) e.getSource()).getSelectedIndex();
            System.out.println(SharpMethods.sharp_method_2);
        });
        this.add(two_choice);


        three.setBackground(Color.BLUE);
        three.setFont(new Font("Dialog",Font.PLAIN,20));
        three.setLocation(110,130);
        three.setSize(30,30);
        this.add(three);

        three_choice.setBackground(Color.LIGHT_GRAY);
        three_choice.setFont(new Font("Dialog",Font.PLAIN,20));
        three_choice.setLocation(110,170);
        three_choice.setSize(45,30);
        three_choice.addActionListener(e -> {
            SharpMethods.sharp_method_3 = ((JComboBox<?>) e.getSource()).getSelectedIndex();
            System.out.println(SharpMethods.sharp_method_3);
        });
        this.add(three_choice);



        four.setBackground(Color.BLUE);
        four.setFont(new Font("Dialog",Font.PLAIN,20));
        four.setLocation(160,130);
        four.setSize(30,30);
        this.add(four);

        four_choice.setBackground(Color.LIGHT_GRAY);
        four_choice.setFont(new Font("Dialog",Font.PLAIN,20));
        four_choice.setLocation(160,170);
        four_choice.setSize(45,30);
        four_choice.addActionListener(e -> {
            SharpMethods.sharp_method_4 = ((JComboBox<?>) e.getSource()).getSelectedIndex();
            System.out.println(SharpMethods.sharp_method_4);
        });
        this.add(four_choice);

        five.setBackground(Color.BLUE);
        five.setFont(new Font("Dialog",Font.PLAIN,20));
        five.setLocation(210,130);
        five.setSize(30,30);
        this.add(five);

        five_choice.setBackground(Color.LIGHT_GRAY);
        five_choice.setFont(new Font("Dialog",Font.PLAIN,20));
        five_choice.setLocation(210,170);
        five_choice.setSize(45,30);
        five_choice.addActionListener(e -> {
            SharpMethods.sharp_method_5 = ((JComboBox<?>) e.getSource()).getSelectedIndex();
            System.out.println(SharpMethods.sharp_method_5);
        });
        this.add(five_choice);


        six.setBackground(Color.BLUE);
        six.setFont(new Font("Dialog",Font.PLAIN,20));
        six.setLocation(260,130);
        six.setSize(30,30);
        this.add(six);

        six_choice.setBackground(Color.LIGHT_GRAY);
        six_choice.setFont(new Font("Dialog",Font.PLAIN,20));
        six_choice.setLocation(260,170);
        six_choice.setSize(45,30);
        six_choice.addActionListener(e -> {
            SharpMethods.sharp_method_6 = ((JComboBox<?>) e.getSource()).getSelectedIndex();
            System.out.println(SharpMethods.sharp_method_6);
        });
        this.add(six_choice);



        seven.setBackground(Color.BLUE);
        seven.setFont(new Font("Dialog",Font.PLAIN,20));
        seven.setLocation(310,130);
        seven.setSize(30,30);
        this.add(seven);

        seven_choice.setBackground(Color.LIGHT_GRAY);
        seven_choice.setFont(new Font("Dialog",Font.PLAIN,20));
        seven_choice.setLocation(310,170);
        seven_choice.setSize(45,30);
        seven_choice.addActionListener(e -> {
            SharpMethods.sharp_method_7 = ((JComboBox<?>) e.getSource()).getSelectedIndex();
            System.out.println(SharpMethods.sharp_method_7);
        });
        this.add(seven_choice);


        eight.setBackground(Color.BLUE);
        eight.setFont(new Font("Dialog",Font.PLAIN,20));
        eight.setLocation(360,130);
        eight.setSize(30,30);
        this.add(eight);

        eight_choice.setBackground(Color.LIGHT_GRAY);
        eight_choice.setFont(new Font("Dialog",Font.PLAIN,20));
        eight_choice.setLocation(360,170);
        eight_choice.setSize(45,30);
        eight_choice.addActionListener(e -> {
            SharpMethods.sharp_method_8 = ((JComboBox<?>) e.getSource()).getSelectedIndex();
            System.out.println(SharpMethods.sharp_method_8);
        });
        this.add(eight_choice);


        nine.setBackground(Color.BLUE);
        nine.setFont(new Font("Dialog",Font.PLAIN,20));
        nine.setLocation(410,130);
        nine.setSize(30,30);
        this.add(nine);

        nine_choice.setBackground(Color.LIGHT_GRAY);
        nine_choice.setFont(new Font("Dialog",Font.PLAIN,20));
        nine_choice.setLocation(410,170);
        nine_choice.setSize(45,30);
        nine_choice.addActionListener(e -> {
            SharpMethods.sharp_method_9 = ((JComboBox<?>) e.getSource()).getSelectedIndex();
            System.out.println(SharpMethods.sharp_method_9);
        });
        this.add(nine_choice);












        china.setBackground(Color.LIGHT_GRAY);
        china.setFont(new Font("Dialog",Font.PLAIN,20));
        china.setLocation(410,50);
        china.setSize(80,50);
        china.addActionListener(e -> {

                start.setBackground(Color.red);
                russia.setSelected(false);
                russia_off.setSelected(false);
                comeback.setSelected(false);
            try {
                Graphic.loadImages_CN();
                Robot.CHINA = true;
                System.out.println("CN images loaded");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }


        });
        this.add(china);


        russia.setBackground(Color.LIGHT_GRAY);
        russia.setFont(new Font("Dialog",Font.PLAIN,20));
        russia.setLocation(510,50);
        russia.setSize(80,50);
        russia.addActionListener(e -> {

            start.setBackground(Color.BLUE);
            china.setSelected(false);
            russia_off.setSelected(false);
            comeback.setSelected(false);
            try {
                Graphic.loadImages_RUS();
                Robot.CHINA = false;
                System.out.println("RUS images loaded");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

        });
        this.add(russia);


        russia_off.setBackground(Color.LIGHT_GRAY);
        russia_off.setFont(new Font("Dialog",Font.PLAIN,20));
        russia_off.setLocation(510,120);
        russia_off.setSize(80,50);
        russia_off.addActionListener(e -> {

            start.setBackground(Color.CYAN);
            china.setSelected(false);
            russia.setSelected(false);
            comeback.setSelected(false);
            try {
                Robot.inc_x = 20;
                Robot.inc_y = 10;
                Robot.CHINA = true;
                Graphic.loadImages_RUS_OF();

                System.out.println("ru_off images loaded");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

        });
        this.add(russia_off);


        comeback.setBackground(Color.LIGHT_GRAY);
        comeback.setFont(new Font("Dialog",Font.PLAIN,20));
        comeback.setLocation(510,180);
        comeback.setSize(80,50);
        comeback.addActionListener(e -> {

            start.setBackground(Color.orange);
            china.setSelected(false);
            russia.setSelected(false);
            russia_off.setSelected(false);
            try {
                Robot.inc_x = 20;
                Robot.inc_y = 10;
                Robot.CHINA = true;
                Graphic.loadImages_comeback_pw();

                System.out.println("comeback images loaded");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

        });
        this.add(comeback);


        podzemka.setBackground(Color.GREEN);
        podzemka.setFont(new Font("Dialog",Font.PLAIN,24));
        podzemka.setLocation(410,10);
        podzemka.setSize(35,30);
        this.add(podzemka);

        nebeska.setBackground(Color.CYAN);
        nebeska.setFont(new Font("Dialog",Font.PLAIN,24));
        nebeska.setLocation(460,10);
        nebeska.setSize(45,30);
        this.add(nebeska);

        miraj.setBackground(Color.WHITE);
        miraj.setFont(new Font("Dialog",Font.PLAIN,24));
        miraj.setLocation(520,10);
        miraj.setSize(75,30);
        this.add(miraj);





        //JTextField area_1 = new JTextField(2);
        area_1.setBackground(Color.orange);
        area_1.setFont(new Font("Dialog",Font.PLAIN,24));
        area_1.setLocation(10,10);
        area_1.setSize(30,30);
        this.add(area_1);


        area_2.setBackground(Color.orange);
        area_2.setFont(new Font("Dialog",Font.PLAIN,24));
        area_2.setLocation(60,10);
        area_2.setSize(30,30);
        this.add(area_2);

        area_3.setBackground(Color.orange);
        area_3.setFont(new Font("Dialog",Font.PLAIN,24));
        area_3.setLocation(110,10);
        area_3.setSize(30,30);
        this.add(area_3);

        area_4.setBackground(Color.orange);
        area_4.setFont(new Font("Dialog",Font.PLAIN,24));
        area_4.setLocation(160,10);
        area_4.setSize(30,30);
        this.add(area_4);

        area_5.setBackground(Color.orange);
        area_5.setFont(new Font("Dialog",Font.PLAIN,24));
        area_5.setLocation(210,10);
        area_5.setSize(30,30);
        this.add(area_5);

        area_6.setBackground(Color.orange);
        area_6.setFont(new Font("Dialog",Font.PLAIN,24));
        area_6.setLocation(260,10);
        area_6.setSize(30,30);
        this.add(area_6);

        area_7.setBackground(Color.orange);
        area_7.setFont(new Font("Dialog",Font.PLAIN,24));
        area_7.setLocation(310,10);
        area_7.setSize(30,30);
        this.add(area_7);

        area_8.setBackground(Color.orange);
        area_8.setFont(new Font("Dialog",Font.PLAIN,24));
        area_8.setLocation(360,10);
        area_8.setSize(30,30);
        this.add(area_8);

        //2 ряд

        area_9.setBackground(Color.orange);
        area_9.setFont(new Font("Dialog",Font.PLAIN,24));
        area_9.setLocation(10,50);
        area_9.setSize(30,30);
        this.add(area_9);

        area_10.setBackground(Color.orange);
        area_10.setFont(new Font("Dialog",Font.PLAIN,24));
        area_10.setLocation(60,50);
        area_10.setSize(30,30);
        this.add(area_10);

        area_11.setBackground(Color.orange);
        area_11.setFont(new Font("Dialog",Font.PLAIN,24));
        area_11.setLocation(110,50);
        area_11.setSize(30,30);
        this.add(area_11);

        area_12.setBackground(Color.orange);
        area_12.setFont(new Font("Dialog",Font.PLAIN,24));
        area_12.setLocation(160,50);
        area_12.setSize(30,30);
        this.add(area_12);

        area_13.setBackground(Color.orange);
        area_13.setFont(new Font("Dialog",Font.PLAIN,24));
        area_13.setLocation(210,50);
        area_13.setSize(30,30);
        this.add(area_13);

        area_14.setBackground(Color.orange);
        area_14.setFont(new Font("Dialog",Font.PLAIN,24));
        area_14.setLocation(260,50);
        area_14.setSize(30,30);
        this.add(area_14);

        area_15.setBackground(Color.orange);
        area_15.setFont(new Font("Dialog",Font.PLAIN,24));
        area_15.setLocation(310,50);
        area_15.setSize(30,30);
        this.add(area_15);

        area_16.setBackground(Color.orange);
        area_16.setFont(new Font("Dialog",Font.PLAIN,24));
        area_16.setLocation(360,50);
        area_16.setSize(30,30);
        this.add(area_16);


        //3 ряд
        area_17.setBackground(Color.orange);
        area_17.setFont(new Font("Dialog",Font.PLAIN,24));
        area_17.setLocation(10,90);
        area_17.setSize(30,30);
        this.add(area_17);

        area_18.setBackground(Color.orange);
        area_18.setFont(new Font("Dialog",Font.PLAIN,24));
        area_18.setLocation(60,90);
        area_18.setSize(30,30);
        this.add(area_18);

        area_19.setBackground(Color.orange);
        area_19.setFont(new Font("Dialog",Font.PLAIN,24));
        area_19.setLocation(110,90);
        area_19.setSize(30,30);
        this.add(area_19);

        area_20.setBackground(Color.orange);
        area_20.setFont(new Font("Dialog",Font.PLAIN,24));
        area_20.setLocation(160,90);
        area_20.setSize(30,30);
        this.add(area_20);

        area_21.setBackground(Color.orange);
        area_21.setFont(new Font("Dialog",Font.PLAIN,24));
        area_21.setLocation(210,90);
        area_21.setSize(30,30);
        this.add(area_21);

        area_22.setBackground(Color.orange);
        area_22.setFont(new Font("Dialog",Font.PLAIN,24));
        area_22.setLocation(260,90);
        area_22.setSize(30,30);
        this.add(area_22);

        area_23.setBackground(Color.orange);
        area_23.setFont(new Font("Dialog",Font.PLAIN,24));
        area_23.setLocation(310,90);
        area_23.setSize(30,30);
        this.add(area_23);

        area_24.setBackground(Color.orange);
        area_24.setFont(new Font("Dialog",Font.PLAIN,24));
        area_24.setLocation(360,90);
        area_24.setSize(30,30);
        this.add(area_24);








        start.setFont(new Font("Dialog",Font.PLAIN,24));
        start.setLocation(260,300);
        start.setSize(100,50);
        start.addActionListener(e -> {
            try {
                Sharp_Util.startSharp();
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        });









        this.add(start);





        this.setBackground(Color.GRAY);


    }






    @Override
    public void actionPerformed(ActionEvent e) {








    }
}
