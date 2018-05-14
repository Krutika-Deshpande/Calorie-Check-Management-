/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Market;

/**
 *
 * @author kruts
 */
public class OrderItem {
  
    private int quantity;
    private ManufacturedProduct product;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ManufacturedProduct getProduct() {
        return product;
    }

    public void setProduct(ManufacturedProduct product) {
        this.product = product;
    }

   
    @Override
    public String toString()
    {
        return product.getProductName();
    }
    
}

    

