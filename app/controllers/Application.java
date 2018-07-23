package controllers;

import models.Shirts;
import play.*;
import play.api.templates.Html;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result main(Html data){
        return ok(main.render(data));

    }
    public static Result showMyShirts() {
        Shirts j = new Shirts();
        j.setId("J001");
        j.setName("สายเดี่ยว");
        j.setLogo("MC");
        j.setPrice(250.00);
        j.setNum(10);
        j.setCol("ฟ้า");

        Shirts d = new Shirts("D002","เดรส","Lee","ขาว",500.00,20);
        Shirts jk = new Shirts("JK003","เสื้อแขนยาว","Nike","ดำ",1500.00,15);
        Shirts co = new Shirts("C004","เสื้อขนสัตวื","Allz","น้ำเงิน",11800.00,5);
        Shirts v = new Shirts("V005","เสื้อกล้าม","Uniqlo","ชมพู",300.00,10);
        Shirts b = new Shirts("B006","เสื้อทั่วไป","AA","ม่วง",100.00,20);

        return main(showMyShirts.render(j,d,jk,co,v,b));




    }




    public static Result home(){
        return main(home.render());
    }


    public static Result footer(){
        return main(footer.render());
    }
}
