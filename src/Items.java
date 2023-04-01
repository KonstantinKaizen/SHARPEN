import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Items {

    public static List<Items> items_list = new ArrayList<>();

    public static boolean item_added_to_list = false;



    public static int podzemka = 0;
    public static int nebeska = 0;
    public static int miraj = 0;

    public static int miraj_used = 0;

    public static int podzemka_used = 0;

    public static int nebeska_used = 0;



    int x_pos;
    int y_pos;
    int sharp_level;
    int sharp_req_level;


    public Items(int x_pos, int y_pos, int sharp_level) {
        this.x_pos = x_pos;
        this.y_pos = y_pos;
        this.sharp_level = sharp_level;
    }


    public static Items item_1 = new Items(-98,197,0);

    public static Items item_2 = new Items(-98+38,197,0);
    public static Items item_3 = new Items(-98+76,197,0);
    public static Items item_4 = new Items(-98+114,197,0);
    public static Items item_5 = new Items(-98+152,197,0);
    public static Items item_6 = new Items(-98+190,197,0);
    public static Items item_7 = new Items(-98+228,197,0);
    public static Items item_8 = new Items(-98+266-10,197,0);
    //вторая строка
    public static Items item_9 = new Items(-98,197+38,0);
    public static Items item_10 = new Items(-98+38,197+38,0);
    public static Items item_11 = new Items(-98+76,197+38,0);
    public static Items item_12 = new Items(-98+114,197+38,0);
    public static Items item_13 = new Items(-98+152,197+38,0);
    public static Items item_14 = new Items(-98+190,197+38,0);
    public static Items item_15 = new Items(-98+228,197+38,0);
    public static Items item_16 = new Items(-98+266-10,197+38,0);

    // 3ряд

    public static Items item_17 = new Items(-98,197+76,0);
    public static Items item_18 = new Items(-98+38,197+76,0);
    public static Items item_19 = new Items(-98+76,197+76,0);
    public static Items item_20 = new Items(-98+114,197+76,0);
    public static Items item_21 = new Items(-98+152,197+76,0);
    public static Items item_22 = new Items(-98+190,197+76,0);
    public static Items item_23 = new Items(-98+228,197+76,0);
    public static Items item_24 = new Items(-98+266-10,197+76,0);







    public static void get_item_req_level(){

        item_1.sharp_req_level = Integer.parseInt(Back.area_1.getText());
        item_2.sharp_req_level = Integer.parseInt(Back.area_2.getText());
        item_3.sharp_req_level = Integer.parseInt(Back.area_3.getText());
        item_4.sharp_req_level = Integer.parseInt(Back.area_4.getText());
        item_5.sharp_req_level = Integer.parseInt(Back.area_5.getText());
        item_6.sharp_req_level = Integer.parseInt(Back.area_6.getText());
        item_7.sharp_req_level = Integer.parseInt(Back.area_7.getText());
        item_8.sharp_req_level = Integer.parseInt(Back.area_8.getText());

        item_9.sharp_req_level = Integer.parseInt(Back.area_9.getText());
        item_10.sharp_req_level = Integer.parseInt(Back.area_10.getText());
        item_11.sharp_req_level = Integer.parseInt(Back.area_11.getText());
        item_12.sharp_req_level = Integer.parseInt(Back.area_12.getText());
        item_13.sharp_req_level = Integer.parseInt(Back.area_13.getText());
        item_14.sharp_req_level = Integer.parseInt(Back.area_14.getText());
        item_15.sharp_req_level = Integer.parseInt(Back.area_15.getText());
        item_16.sharp_req_level = Integer.parseInt(Back.area_16.getText());

        item_17.sharp_req_level = Integer.parseInt(Back.area_17.getText());
        item_18.sharp_req_level = Integer.parseInt(Back.area_18.getText());
        item_19.sharp_req_level = Integer.parseInt(Back.area_19.getText());
        item_20.sharp_req_level = Integer.parseInt(Back.area_20.getText());
        item_21.sharp_req_level = Integer.parseInt(Back.area_21.getText());
        item_22.sharp_req_level = Integer.parseInt(Back.area_22.getText());
        item_23.sharp_req_level = Integer.parseInt(Back.area_23.getText());
        item_24.sharp_req_level = Integer.parseInt(Back.area_24.getText());

        podzemka = Integer.parseInt(Back.podzemka.getText());
        nebeska = Integer.parseInt(Back.nebeska.getText());
        miraj = Integer.parseInt(Back.miraj.getText());

        System.out.print(item_1.sharp_req_level);
        System.out.print(item_2.sharp_req_level);
        System.out.print(item_3.sharp_req_level);
        System.out.print(item_4.sharp_req_level);
        System.out.print(item_5.sharp_req_level);
        System.out.print(item_6.sharp_req_level);
        System.out.print(item_7.sharp_req_level);
        System.out.print(item_8.sharp_req_level);

        System.out.print("  "+podzemka);
        System.out.print("  "+nebeska);
        System.out.println("  "+miraj);

        System.out.print(item_9.sharp_req_level);
        System.out.print(item_10.sharp_req_level);
        System.out.print(item_11.sharp_req_level);
        System.out.print(item_12.sharp_req_level);
        System.out.print(item_13.sharp_req_level);
        System.out.print(item_14.sharp_req_level);
        System.out.print(item_15.sharp_req_level);
        System.out.println(item_16.sharp_req_level);








    }

    public static void addItemsToList(){

        if(!item_added_to_list) {
            items_list.add(item_1);
            items_list.add(item_2);
            items_list.add(item_3);
            items_list.add(item_4);
            items_list.add(item_5);
            items_list.add(item_6);
            items_list.add(item_7);
            items_list.add(item_8);

            items_list.add(item_9);
            items_list.add(item_10);
            items_list.add(item_11);
            items_list.add(item_12);
            items_list.add(item_13);
            items_list.add(item_14);
            items_list.add(item_15);
            items_list.add(item_16);

            items_list.add(item_17);
            items_list.add(item_18);
            items_list.add(item_19);
            items_list.add(item_20);
            items_list.add(item_21);
            items_list.add(item_22);
            items_list.add(item_23);
            items_list.add(item_24);


            item_added_to_list = true;
        }
    }




}
