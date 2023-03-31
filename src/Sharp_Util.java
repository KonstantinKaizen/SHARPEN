import javax.swing.*;

public class Sharp_Util {

    public static int errors = 0;


    public static int inventory_x = 0;
    public static int inventory_y = 0;
    public static int sharp_x = 0;
    public static int sharp_y = 0;




    public static int determine_sharpening_level() throws Exception {
        System.out.println("delay-start");



        while(true) {
            if (isOnScreen.findImage(Graphic.zero, 3).result) {
                System.out.println("its 0");
                return 0;
            }


            if (isOnScreen.findImage(Graphic.one, 3).result) {
                System.out.println("its 1");
                return 1;
            }


            if (isOnScreen.findImage(Graphic.two, 3).result) {
                System.out.println("its 2");
                return 2;
            }


            if (isOnScreen.findImage(Graphic.three, 3).result) {
                System.out.println("its 3");
                return 3;
            }


            if (isOnScreen.findImage(Graphic.four, 3).result) {
                System.out.println("its 4");
                return 4;
            }


            if (isOnScreen.findImage(Graphic.five, 3).result) {
                System.out.println("its 5");
                return 5;
            }
            if (isOnScreen.findImage(Graphic.six, 3).result) {
                System.out.println("its 6");
                return 6;
            }

            if (isOnScreen.findImage(Graphic.seven, 3).result) {
                System.out.println("its 7");
                return 7;
            }

            if (isOnScreen.findImage(Graphic.eight, 3).result) {
                System.out.println("its 8");
                return 8;
            }

            if (isOnScreen.findImage(Graphic.nine, 3).result) {
                System.out.println("its 9");
                return 9;
            }
            System.out.println("Ошибка определение уровня заточки");
            errors++;
        }


    }

    public static void startSharp() throws Exception {

        Items.podzemka_used = 0;
        Items.miraj_used = 0;
        Items.nebeska_used = 0;
        errors = 0;


        Items.get_item_req_level();
        if(Items.podzemka<1 || Items.nebeska<1 || Items.miraj<1){
            JOptionPane.showMessageDialog(Main.frame,"ОШИБКА - Нехватка предметов для заточки");
            return;
        }
        Robot.leftClick(69,17);
        Thread.sleep(500);


            isOnScreen.findImage_result inventory_result = isOnScreen.findImage(Graphic.inventory_window);
            inventory_x = inventory_result.x_pos;
            inventory_y = inventory_result.y_pos;
            isOnScreen.findImage_result sharp_result = isOnScreen.findImage(Graphic.sharp_window);
            sharp_x = sharp_result.x_pos;
            sharp_y = sharp_result.y_pos;


        if (!sharp_result.result) {
            JOptionPane.showMessageDialog(Main.frame,"ОШИБКА - cant find sharp window");
            return;
        }
        if (!inventory_result.result) {
            JOptionPane.showMessageDialog(Main.frame,"ОШИБКА - cant find inventory window");
            return;
        }

        System.out.println("all windows found");

        System.out.println(SharpMethods.sharp_method_1+" "+SharpMethods.sharp_method_2+" "+SharpMethods.sharp_method_3+" "+SharpMethods.sharp_method_4);
        System.out.println("METHODS ^");



        Items.addItemsToList();

        for (Items item :Items.items_list) {


            Robot.rightClick(item.x_pos+inventory_result.x_pos,item.y_pos+inventory_result.y_pos); // выбрать итем
            Thread.sleep(250);
            item.sharp_level = determine_sharpening_level(); // узнать его уровень заточки



            sharpItem(item); // заточить итем




        }

        System.out.print("req level: ");

        int i1 = 0;

        for (Items item :Items.items_list) {

            System.out.print(item.sharp_req_level+" ");

            i1++;

            if(i1 == 8) {
                System.out.println(" ");
                System.out.print("           ");
                i1 = 0;
            }


        }

        System.out.println(" ");
        System.out.print("current level: ");


        int i = 0;
        for (Items item :Items.items_list) {




            System.out.print(item.sharp_level+" ");
            i++;

            if(i == 8) {
                System.out.println(" ");
                System.out.print("               ");
                i = 0;
            }

        }

        JOptionPane.showMessageDialog(Main.frame,"миражей : "+Items.miraj_used+ " небесок : "+Items.nebeska_used+" подземок : "+Items.podzemka_used+
                " errors : "+errors);








    }

    public static void sharpItem(Items item) throws Exception {

        while(item.sharp_req_level>item.sharp_level ){

            if(Items.miraj<1) return;

            if(item.sharp_level == 0) {
                SharpMethods.sharp_1();
            } else if(item.sharp_level == 1) {
                SharpMethods.sharp_2();
            } else if(item.sharp_level == 2) {
                SharpMethods.sharp_3();
            } else if(item.sharp_level == 3) {
                SharpMethods.sharp_4();
            } else if(item.sharp_level == 4) {
                SharpMethods.sharp_5();
            } else if(item.sharp_level == 5) {
                SharpMethods.sharp_6();
            } else if(item.sharp_level == 6) {
                SharpMethods.sharp_7();
            } else if(item.sharp_level == 7) {
                SharpMethods.sharp_8();
            } else if(item.sharp_level == 8) {
                SharpMethods.sharp_9();
            }

            while(!isOnScreen.findImage(Graphic.upgrade_button).result){
                Thread.sleep(75);
                System.out.println("waiting for upgrade button");
            }



            Thread.sleep(75);
            item.sharp_level = determine_sharpening_level();



        }





    }


}
