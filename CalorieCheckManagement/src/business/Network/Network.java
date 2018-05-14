/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Network;

import business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author kruts
 */
public class Network {
    private String networkName;
    private String nCity;
    private String nState;
    private String nCountry;
    private EnterpriseDirectory enterpriseDirectory;
    
    
    public Network(){
        enterpriseDirectory = new EnterpriseDirectory();
       
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }
    
    

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public String getnCity() {
        return nCity;
    }

    public void setnCity(String nCity) {
        this.nCity = nCity;
    }

    public String getnState() {
        return nState;
    }

    public void setnState(String nState) {
        this.nState = nState;
    }

    public String getnCountry() {
        return nCountry;
    }

    public void setnCountry(String nCountry) {
        this.nCountry = nCountry;
    }
    
    @Override
    public String toString(){
        return networkName;
    }
}
