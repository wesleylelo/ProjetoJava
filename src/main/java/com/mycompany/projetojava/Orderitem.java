package com.mycompany.mavenproject1;


public class Orderitem {
    private Integer quantity;
    Product pro = new Product();
    Double price = pro.getQuantity();
    public Orderitem(Integer quantity, Double price, Product pro){
        
    }
    public Double subTotal(){
        return quantity*price;
    }

    public String toString() {
		return pro.getProduto() 
				+ ", $" 
				+ String.format("%.2f", price) 
				+ ", Quantity: " 
				+ quantity + 
				", Subtotal: $" 
				+ String.format("%.2f", subTotal());
	}

   
}
