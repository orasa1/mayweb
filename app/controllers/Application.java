package controllers;

import models.Shirts;
import play.api.templates.Html;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
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
    public  static  Result inputShirts(){
        return main (inputShirts.render());
    }
    public static Result postShirts() {
        Shirts jjj =new Shirts();
        DynamicForm show= Form.form().bindFromRequest();
        String id,name,logo,col;
        double num,price;
        if(show.hasErrors()){
            return main(inputShirts.render());

        }else {
            id = show.get("id");
            name = show.get("name");
            logo = show.get("logo");
            col = show.get("col");
            num = Double.parseDouble(show.get("num"));
            price = Double.parseDouble(show.get("price"));

        }
         jjj.setId(id);
        jjj.setName(name);
        jjj.setLogo(logo);
        jjj.setPrice(price);
        jjj.setNum(num);
        jjj.setCol(col);
        return main(showOuputShirts.render(jjj));
    }

    public static Result home(){
        return main(home.render());
    }



}
