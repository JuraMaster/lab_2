package lab.rob2;

import lab.rob1.Items;

public class Items2 {


    public Items items;

    public Items2(Items items) {
        this.items = items;
    }

    public void priceGram(int weight){
        double a = items.getPrice()/10;
        System.out.println("\uD83D\uDCB2Ціна за 100 грам: "+a+" - "+ items.getNameItem() + "\uD83D\uDCB2");
    }

    public void spoilt(){
        if(items.getDataItem()<2022){
            System.out.println("Товар "+items.getNameItem()+" - зіпсований!\uD83E\uDD22");
        }else{
            System.out.println("Товар "+items.getNameItem()+" - придатний для споживання!\uD83E\uDD17");
        }
    }
}
