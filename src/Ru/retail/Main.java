package Ru.retail;

import Ru.retail.product.Product;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [] stock = new int[10]; //запас товара на складе
        for(int i=0; i<10; i++){
            stock[i] = i+1;
            System.out.println(stock[i]);
        }for (int i: stock){
            System.out.println(i);
        }
        String [] names = {"Order","Client","Product","Storage","Discounts"};
        int index=0;
        while (index < names.length){
            System.out.println(names[index]);
            index++;
        }
        Product milk =new Product("Молоко","В наличии",123,45);
        Client Vas = new Client("Вася",1,"Сбер");
        milk.getName();
    }
}
















  //      boolean productPaidFor = true;
 //       boolean productNotPaid = false;
  //      if(productPaidFor()) {
 //          System.out.println("При доставке товара отдаем кассовый чек");
 //       } else if(productNotPaid()) {
 //           System.out.println("При доставке товара принимаем оплату и отдаем кассовый чек");
 //       } else {
 //           System.out.println("Не отдаем товар покупателю");


  //  private static boolean productNotPaid() {
 //       return false;
 //   }
 //   private static boolean productPaidFor() {
  //      return true;
  //  }
