package controller;

import model.Store;
import viev.StoreViev;

public class StoreController {
    private Store model;
    private StoreViev viev;

    public StoreController(Store model,StoreViev viev){
        this.model = model;
        this.viev = viev;
    }
    public void setProductName(String name){
        model.setProduct(name);
    }
    public void setPrice(float price){
        model.setPrice(price);
    }
    public String getProductName(){
        return model.getProduct();
    }
    public float getPrice(){
        return model.getPrice();
    }
    public void UpdateViev(){
        viev.printShop(model.getProduct(), model.getPrice());
    }
}
