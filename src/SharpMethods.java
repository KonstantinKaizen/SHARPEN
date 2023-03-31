public class SharpMethods {

    // 0 = miraj 1 = nebeska 2 = podzemka

    public static int sharp_method_1 = 0;
    public static int sharp_method_2 = 0;
    public static int sharp_method_3 = 0;
    public static int sharp_method_4 = 0;
    public static int sharp_method_5 = 0;
    public static int sharp_method_6 = 0;
    public static int sharp_method_7 = 0;
    public static int sharp_method_8 = 0;
    public static int sharp_method_9 = 0;

    public static int risk_chance = 2;




    public static void miraj_sharp() throws InterruptedException {


        if (risk_chance > 0) {

            Robot.cleanStone();
            risk_chance--;

        }


        if(Items.miraj<1) return;
        Robot.upgrade();
        Items.miraj--;
        Items.miraj_used++;
        System.out.println("RISK CHANCE : "+risk_chance);

    }

    public static void nebeska_sharp() throws InterruptedException{

        if(risk_chance>0){
            Robot.cleanStone();
            risk_chance--;
        }

        if(Items.miraj<1 || Items.nebeska<1) return;
        Robot.equpNebeska();
        Thread.sleep(200);
        Robot.upgrade();
        Thread.sleep(400);
        Robot.cleanStone();

        Items.miraj--;
        Items.miraj_used++;

        Items.nebeska--;
        Items.nebeska_used++;

        risk_chance = 2;

    }

    public static void podzemka_sharp() throws InterruptedException{

        if(risk_chance>0){
            Robot.cleanStone();
            risk_chance--;
        }

        if(Items.miraj<1 || Items.podzemka<1) return;
        Robot.equpPodzemka();
        Thread.sleep(200);
        Robot.upgrade();
        Thread.sleep(400);
        Robot.cleanStone();

        Items.miraj--;
        Items.miraj_used++;

        Items.podzemka--;
        Items.podzemka_used++;
        risk_chance = 2;

    }





    public static void sharp_1() throws InterruptedException {

        if(sharp_method_1 == 0) {
            miraj_sharp();
            return;
        }
        if(sharp_method_1 == 1) {
            nebeska_sharp();
            return;
        }
        if(sharp_method_1 == 2) {
            podzemka_sharp();
            return;

        }
        System.out.println("error");


    }


    public static void sharp_2() throws InterruptedException {
        if(sharp_method_2 == 0) {
            miraj_sharp();
            return;
        }
        if(sharp_method_2 == 1) {
            nebeska_sharp();
            return;
        }
        if(sharp_method_2 == 2) {
            podzemka_sharp();
            return;

        }
        System.out.println("error");
    }

    public static void sharp_3() throws InterruptedException {
        if(sharp_method_3 == 0) {
            miraj_sharp();
            return;
        }
        if(sharp_method_3 == 1) {
            nebeska_sharp();
            return;
        }
        if(sharp_method_3 == 2) {
            podzemka_sharp();
            return;

        }
        System.out.println("error");
    }

    public static void sharp_4() throws InterruptedException {
        if(sharp_method_4 == 0) {
            miraj_sharp();
            return;
        }
        if(sharp_method_4 == 1) {
            nebeska_sharp();
            return;
        }
        if(sharp_method_4 == 2) {
            podzemka_sharp();
            return;

        }
        System.out.println("error");
    }

    public static void sharp_5() throws InterruptedException {
        if(sharp_method_5 == 0) {
            miraj_sharp();
            return;
        }
        if(sharp_method_5 == 1) {
            nebeska_sharp();
            return;
        }
        if(sharp_method_5 == 2) {
            podzemka_sharp();
            return;

        }
        System.out.println("error");
    }
    public static void sharp_6() throws InterruptedException {
        if(sharp_method_6 == 0) {
            miraj_sharp();
            return;
        }
        if(sharp_method_6 == 1) {
            nebeska_sharp();
            return;
        }
        if(sharp_method_6 == 2) {
            podzemka_sharp();
            return;

        }
        System.out.println("error");
    }
    public static void sharp_7() throws InterruptedException {
        if(sharp_method_7 == 0) {
            miraj_sharp();
            return;
        }
        if(sharp_method_7 == 1) {
            nebeska_sharp();
            return;
        }
        if(sharp_method_7 == 2) {
            podzemka_sharp();
            return;

        }
        System.out.println("error");
    }
    public static void sharp_8() throws InterruptedException {
        if(sharp_method_8 == 0) {
            miraj_sharp();
            return;
        }
        if(sharp_method_8 == 1) {
            nebeska_sharp();
            return;
        }
        if(sharp_method_8 == 2) {
            podzemka_sharp();
            return;

        }
        System.out.println("error");
    }

    public static void sharp_9() throws InterruptedException {
        if(sharp_method_9 == 0) {
            miraj_sharp();
            return;
        }
        if(sharp_method_9 == 1) {
            nebeska_sharp();
            return;
        }
        if(sharp_method_9 == 2) {
            podzemka_sharp();
            return;

        }
        System.out.println("error");
    }
}
