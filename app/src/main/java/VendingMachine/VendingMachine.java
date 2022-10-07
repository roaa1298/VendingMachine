package VendingMachine;

import java.util.ArrayList;
import java.util.Objects;

public class VendingMachine {
    int money;
    ArrayList<Item> items;

    public VendingMachine() {
        this.money = 0;
        this.items = new ArrayList<Item>();
    }

    public boolean AddItem(String Name, ItemType ItemType , int Price, String ItemDesc){
        for (int i=0; i<items.size() ; i++)
        {
            if (Objects.equals(items.get(i).name.toLowerCase(), Name.toLowerCase()))
            {
                return false;
            }
        }
        items.add(new Item(Name,ItemType,Price,ItemDesc));
        return true;
    }

    public boolean addMoney(int value){
        if (value==1 || value==5 || value==10)
        {
            this.money=this.money+value;
            System.out.println(value+" is inserted ... Your current credit is "+this.money+" JD");
            return true;
        }
        return false;
    }

    public int GetCredit(){
        return this.money;
    }

    public boolean BuyItem(String name){
        for (int i=0; i<items.size() ; i++)
        {
            if (Objects.equals(items.get(i).name.toLowerCase(), name.toLowerCase()))
            {
                // if the price of the item equal to the credit
                if (items.get(i).price==this.money)
                {
                    System.out.println(items.get(i).name+" dropped");
                    this.money=0;
                    return true;
                }
                // if the credit greater than the price
                if (items.get(i).price<this.money)
                {
                    System.out.println(items.get(i).name+" dropped");
                    this.money=this.money-items.get(i).price;
                    System.out.println(ReturnChange()+" JD's returned");
                    return true;
                }
                // if the credit less than the price
                if (items.get(i).price>this.money)
                {
                    System.out.println("Sorry, Not enough credit");
                    return false;
                }
            }
        }
        // if the item not exist in the machine
        System.out.println("Sorry, Not exist");
        return false;

    }

    public int ReturnChange(){
        return this.money;
    }
}
