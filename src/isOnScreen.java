import java.awt.*;
import java.awt.image.BufferedImage;

public class isOnScreen {


    public static class findImage_result{

         boolean result;
         int x_pos;
         int y_pos;


        public findImage_result(boolean result, int x_pos, int y_pos) {
            this.result = result;
            this.x_pos = x_pos;
            this.y_pos = y_pos;
        }

        public findImage_result(boolean result) {
            this.result = result;
        }
    }





    public static findImage_result findImage(BufferedImage bi) throws Exception {

        int x_pos = 0;
        int y_pos = 0;

        BufferedImage image = null;
        try {
            image = new java.awt.Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        for(int x = 0; x< image.getWidth()/2;x++){
            for(int y = 0; y< image.getHeight()/2;y++){

                boolean invalid = false;
                int k = x,l = y;
                for(int a = 0;a<bi.getWidth();a++){
                    l = y;
                    for(int b = 0;b<bi.getHeight();b++){

                        int red_image;
                        int green_image;
                        int blue_image;


                        //int argb = bi.getRGB(a, b);
                        //int alpha = (bi.getRGB(a, b) >> 24) & 0xff;
                        int red_bi = (bi.getRGB(a, b) >> 16) & 0xff;
                        int green_bi = (bi.getRGB(a, b) >>  8) & 0xff;
                        int blue_bi = (bi.getRGB(a, b) ) & 0xff;
                        //System.out.println(k+" "+l);
                        //System.out.println(image.getHeight()+" "+ image.getWidth());


                        int argb_image = image.getRGB(k, l);
                        red_image = (argb_image >> 16) & 0xff;
                        green_image = (argb_image >> 8) & 0xff;
                        blue_image = (argb_image) & 0xff;



                        if(red_bi-8 < red_image && red_image < red_bi+8 &&
                                green_bi-8 < green_image && green_image < green_bi+8 &&
                                blue_bi-8 < blue_image && blue_image < blue_bi+8
                        ){



                            //if(bi.getRGB(a, b) == image.getRGB(k, l)){


                            x_pos = k;
                            y_pos = l;

                            l++;

                        }
                        else{


                            invalid = true;
                            break;
                        }
                    }
                    if(invalid){
                        break;
                    }else{
                        k++;
                    }

                }

                if(!invalid){
                    //System.out.println("x : " + x_pos + " y : " + y_pos);
                    return new findImage_result(true,x_pos,y_pos); // If image is found
                }
            }
        }
        return new findImage_result(false); //If no image is found

    }


    public static findImage_result findImage(BufferedImage bi,int i) throws Exception {

        int x_pos = 0;
        int y_pos = 0;

        BufferedImage image = null;
        try {
            image = new java.awt.Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        for(int x = 0; x< image.getWidth()/i;x++){
            for(int y = 0; y< image.getHeight()/i;y++){

                boolean invalid = false;
                int k = x,l = y;
                for(int a = 0;a<bi.getWidth();a++){
                    l = y;
                    for(int b = 0;b<bi.getHeight();b++){

                        int red_image;
                        int green_image;
                        int blue_image;


                        //int argb = bi.getRGB(a, b);
                        //int alpha = (bi.getRGB(a, b) >> 24) & 0xff;
                        int red_bi = (bi.getRGB(a, b) >> 16) & 0xff;
                        int green_bi = (bi.getRGB(a, b) >>  8) & 0xff;
                        int blue_bi = (bi.getRGB(a, b) ) & 0xff;
                        //System.out.println(k+" "+l);
                        //System.out.println(image.getHeight()+" "+ image.getWidth());


                        int argb_image = image.getRGB(k, l);
                        red_image = (argb_image >> 16) & 0xff;
                        green_image = (argb_image >> 8) & 0xff;
                        blue_image = (argb_image) & 0xff;



                        if(red_bi-8 < red_image && red_image < red_bi+8 &&
                                green_bi-8 < green_image && green_image < green_bi+8 &&
                                blue_bi-8 < blue_image && blue_image < blue_bi+8
                        ){



                            //if(bi.getRGB(a, b) == image.getRGB(k, l)){


                            x_pos = k;
                            y_pos = l;

                            l++;

                        }
                        else{


                            invalid = true;
                            break;
                        }
                    }
                    if(invalid){
                        break;
                    }else{
                        k++;
                    }

                }

                if(!invalid){
                    //System.out.println("x : " + x_pos + " y : " + y_pos);
                    return new findImage_result(true,x_pos,y_pos); // If image is found
                }
            }
        }
        return new findImage_result(false); //If no image is found

    }
}
