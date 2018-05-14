/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Market;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kruts
 */
public class ManufacturedProduct {

    private String productName;
    private String productID;
    private int quantity;
    private CategoryType category;
    private SubCategoryType subCategory;
    private String fats;
    private String carbohydrates;
    private String proteins;
    private double totalCalories;
    private double price;
            
    
    private String ingredients;

    public enum CategoryType {

        Dairy("1.Dairy"),
        ProteinFoods("2.ProteinFoods"),
        Grains("3.Grains"),
        SnacksSweets("4.Snacks & Sweets"),
        Fruits("5.Fruits"),
        Vegetables("6.Vegetables"),
        Beverages("7.Beverages");

        private String value;

        private CategoryType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

    }

    public enum SubCategoryType {
        Milk("a. Milk"),
        Yogurt("b. Yogurt"),
        Cheese("c.Cheese"),
        DietBeverages("a.Sugar-Sweetened and Diet Beverages"),
        CoffeeTea("b. Coffee and Tea"),
        Alcoholic("c. Alcoholic Beverages"),
        Waters("d.Waters"),
        Meat("a.Meat"),
        DeliProducts("b.Deli/Cured Products"),
        Poultry("c.Poultry"),
        Seafood("d.Seafood"),
        Eggs("e.Eggs"),
        NutsSeeds("f.Nuts, Seed and Soy"),
         RicePasta("a. Rice and Pasta"),
        QuickBreads("b. Quick Breads"),
        BreakfastCereals("c.Breakfast, Cereals and Bars"),
        ChipsCrackers("a. Chips,Crackers and Savory Snacks"),
        Desserts("b.Desserts and SweetSnacks"),
        Candies("c.Candies and Sugars"),
        Fruits("a. Fruits(Non-juice"),
        FruitJuice("b.100% Fruit Juice"),
        Vegetables("a. Vegetables"),
        Starchy("b.Starchy Vegetables");

        private String value;

        private SubCategoryType(String value) {
            this.value = value;
        }

        public static SubCategoryType[] getValues(CategoryType type) {
            SubCategoryType[] result = new SubCategoryType[0];
            if (type == CategoryType.Dairy) {
                result = new SubCategoryType[3];
                result[0] = SubCategoryType.Milk;
                result[1] = SubCategoryType.Yogurt;
                result[2] = SubCategoryType.Cheese;
//{SubCategoryType.Milk};
            } else if (type == CategoryType.Beverages) {
                result = new SubCategoryType[4];
                result[0] = SubCategoryType.DietBeverages;
                result[1] = SubCategoryType.CoffeeTea;
                result[2] = SubCategoryType.Alcoholic;
                result[3] = SubCategoryType.Milk;
            }
            else if (type == CategoryType.ProteinFoods) {
                result = new SubCategoryType[6];
                result[0] = SubCategoryType.Meat;
                result[1] = SubCategoryType.Eggs;
                result[2] = SubCategoryType.Poultry;
                result[3] = SubCategoryType.Seafood;
                result[4] = SubCategoryType.NutsSeeds;
                result[5] = SubCategoryType.DeliProducts;
                        
            }
            else if (type == CategoryType.Grains) {
                result = new SubCategoryType[3];
                result[0] = SubCategoryType.RicePasta;
                result[1] = SubCategoryType.BreakfastCereals;
                result[2] = SubCategoryType.QuickBreads;
                
            }
            else if (type == CategoryType.SnacksSweets) {
                result = new SubCategoryType[3];
                result[0] = SubCategoryType.Candies;
                result[1] = SubCategoryType.ChipsCrackers;
                result[2] = SubCategoryType.Desserts;
                
            }
            else if (type == CategoryType.Fruits) {
                result = new SubCategoryType[2];
                result[0] = SubCategoryType.Fruits;
                result[1] = SubCategoryType.FruitJuice;
 
            }
            else if (type == CategoryType.Vegetables) {
                result = new SubCategoryType[2];
                result[0] = SubCategoryType.Vegetables;
                result[1] = SubCategoryType.Starchy;
               
            }
            return result;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public CategoryType getCategory() {
        return category;
    }

    public void setCategory(CategoryType category) {
        this.category = category;
    }

    public SubCategoryType getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(SubCategoryType subCategory) {
        this.subCategory = subCategory;
    }

   

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getFats() {
        return fats;
    }

    public void setFats(String fats) {
        this.fats = fats;
    }

    public String getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(String carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public String getProteins() {
        return proteins;
    }

    public void setProteins(String proteins) {
        this.proteins = proteins;
    }

    public double getTotalCalories() {
        return totalCalories;
    }

    public void setTotalCalories(double totalCalories) {
        this.totalCalories = totalCalories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

   
    
    
    @Override
    public String toString() {
        return this.productName;
    }

}
