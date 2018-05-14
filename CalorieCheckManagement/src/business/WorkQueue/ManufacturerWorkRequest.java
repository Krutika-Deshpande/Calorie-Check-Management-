/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.WorkQueue;

import business.Market.ManufacturedProduct;
import java.util.ArrayList;

/**
 *
 * @author kruts
 */
public class ManufacturerWorkRequest extends WorkRequest{
    private String manufacturerResult;
  
    
    public ManufacturerWorkRequest(){
       
        super();
    }
    public String getManufacturerResult() {
        return manufacturerResult;
    }

    public void setManufacturerResult(String manufacturerResult) {
        this.manufacturerResult = manufacturerResult;
    }

   
    

   

    
}
