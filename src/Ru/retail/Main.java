package Ru.retail;

import Ru.retail.discounts.AccumDiscount;
import Ru.retail.product.Product;
import Ru.retail.product.Uneatable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Client> clients = Client.getAll();
        List<Product> products = Product.getAll();
        products.get(0).acceptProduct("склад");
        products.get(0).setBarcode("8547");
        products.get(0).setPrice("3000");
        products.get(0).setState("В наличии");
        products.get(1).acceptProduct("склад");
        products.get(1).setBarcode("369874");
        products.get(1).setPrice("680");
        products.get(1).setState("в наличии");
        clients.get(4).putInBasket(products.get(0));
        clients.get(4).setOrder("первый");
        clients.get(4).payOrder("Одесса", "Сергей", "оплата по карте");
        clients.get(4).accumDiscount();
        List<Order> orders = Order.getAll();
        orders.get(0).transferDelivery();
        orders.get(0).delivery();
        clients.get(4).putInBasket(products.get(1));
        clients.get(4).setOrder("второй");
        clients.get(4).volumeDiscount();
        clients.get(4).payOrder("Одесса", "Сергей", "оплата по карте");
        orders.get(1).transferDelivery();
        orders.get(1).delivery();

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
