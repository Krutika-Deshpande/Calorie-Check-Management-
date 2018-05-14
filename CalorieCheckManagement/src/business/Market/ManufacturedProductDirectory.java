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
public class ManufacturedProductDirectory {
    private ArrayList<ManufacturedProduct> manufacturedProductDirectory;
    
    
    public ManufacturedProductDirectory(){
        manufacturedProductDirectory= new ArrayList<>();
    }

    public ArrayList<ManufacturedProduct> getManufacturedProductDirectory() {
        return manufacturedProductDirectory;
    }

    public void setManufacturedProductDirectory(ArrayList<ManufacturedProduct> manufacturedProductDirectory) {
        this.manufacturedProductDirectory = manufacturedProductDirectory;
    }

    
    
     public ManufacturedProduct addManufacturedProduct(){
         ManufacturedProduct product = new ManufacturedProduct();
        manufacturedProductDirectory.add(product);
        return product;
    }
     
     public double calculateCalorie(double fats, double carbs, double proteins, ManufacturedProduct product){
        
         Double totalCalories = (9 * fats)+(4*carbs)+(4*proteins);
         product.setTotalCalories(totalCalories);
         return totalCalories;
        
     }
    
    
    
}
