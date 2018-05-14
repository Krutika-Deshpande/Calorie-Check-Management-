/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Market;

import java.util.ArrayList;

/**
 *
 * @author kruts
 */
public class MasterOrderList {
     private ArrayList<Order> orderCatalog;

    public MasterOrderList() {
        orderCatalog = new ArrayList<>();
    }

    public ArrayList<Order> getOrderCatalog() {
        return orderCatalog;
    }

    public void setOrderCatalog(ArrayList<Order> orderCatalog) {
        this.orderCatalog = orderCatalog;
    }
    
    public Order addOrder(Order o){
        
        orderCatalog.add(o);
        return o;
        
    }
    
    
}
