/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import business.Ecosystem;
import business.Network.Network;
import java.awt.Component;
import javax.swing.JPanel;
import business.WorkQueue.ProductWorkRequest;

/**
 *
 * @author kruts
 */
public abstract class Role {

  private RoleType roleType;

    public enum RoleType {
        Admin("Admim"),
        ProductManager("Product Manager"),
        ProductManufacturer("Product Manufacturer"),
        FoodLabAssistant("FoodLab Assistant"),
        FoodLabManager("FoodLab Manager"),
        SuperMareketManager("SuperMarket Manager"),
        SuperMarketDealer("SuperMarket Dealer"),
        Customer("Customer"),
        Registered("Registered Customer");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account,
            Organization organization,
            Enterprise enterprise,
            Ecosystem business,
            Network network);

   public Role(RoleType type){
       this.roleType = type;
   }
    
    @Override
    public String toString() {
        return this.roleType.getValue();
    }
}
