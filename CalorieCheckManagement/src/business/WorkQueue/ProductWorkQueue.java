/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author kruts
 */
public class ProductWorkQueue {
    private ArrayList<ProductWorkRequest>  productworkRequestList;

    public ProductWorkQueue() {
        productworkRequestList = new ArrayList();
    }

    public ArrayList<ProductWorkRequest> getProductworkRequestList() {
        return productworkRequestList;
    }
    

}
