package Ru.retail.product;

public class Product {
     private String name;
     private String state;
     private int id;
     private double price;

     public  Product(String name, String state,int id, double price){
         this.name = name;
         this.state = state;
         this.id = id;
         this.price = price;
     }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setState(String state) {
        this.state = state;
    }
    //  int i//позиция в корзине
        //  int j//кол-во шт 1 позиции в корзине
   //     for(int i = 1; i <= 10; i++){
      //      for(int j = 1; j <= 5; j++){
      //          int multiplay = i*j;//-кол-во товара в корзине
      //          System.out.println(multiplay);
            }
      //  }
  //  }