/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.Customer.Customer;
import business.Customer.CustomerDirectory;
import business.Market.ManufacturedProduct;
import business.Market.ManufacturedProductDirectory;
import business.Market.MasterOrderList;
import business.Network.Network;
import business.Organization.AdminOrganization;
import business.Organization.Organization;
import business.Role.SystemAdminRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kruts
 */
public class Ecosystem extends Organization {

    private ArrayList<Role.RoleType> roleType;
    private static Ecosystem business;
    private ArrayList<Network> networkList;
    private ManufacturedProductDirectory manufacturedProductDirectory;
    private MasterOrderList masterOrderList;

    public static Ecosystem getInstance() {
        if (business == null) {
            business = new Ecosystem();
        }
        return business;
    }

    public Ecosystem() {

        super(null);
        networkList = new ArrayList<Network>();
        manufacturedProductDirectory = new ManufacturedProductDirectory();
        masterOrderList = new MasterOrderList();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    public ArrayList<Role> getSupportedRole() {

        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole(Role.RoleType.Admin));
        return roleList;
    }

    public boolean CheckIfUserNameIsUnique(String userName) {
        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
            return false;
        }
        for (Network network : networkList) {

        }
        return true;
    }

    public ManufacturedProductDirectory getManufacturedProductDirectory() {
        return manufacturedProductDirectory;
    }

    public void setManufacturedProductDirectory(ManufacturedProductDirectory manufacturedProductDirectory) {
        this.manufacturedProductDirectory = manufacturedProductDirectory;
    }

    public MasterOrderList getMasterOrderList() {
        return masterOrderList;
    }

    public void setMasterOrderList(MasterOrderList masterOrderList) {
        this.masterOrderList = masterOrderList;
    }

}
