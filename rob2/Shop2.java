package lab.rob2;

import lab.rob1.Shop;

public class Shop2 {

    public Shop shop;

    public Shop2(Shop shop) {
        this.shop = shop;
    }

    public void temp(){
        if(shop.getSection().equals("м'ясний відділ")){
            System.out.println("Температруа зберігання < 5 °С");
        }else if(shop.getSection().equals("хлібо-булочний відділ")){
            System.out.println("Температруа зберігання > 15 °С");
        }
    }
}
