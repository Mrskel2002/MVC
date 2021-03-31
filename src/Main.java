import controller.StoreController;
import model.Store;
import viev.StoreViev;

public class Main {
    public static void main(String[] args) {
        Store model = retrieveProductFromStore();
        StoreViev viev = new StoreViev();
        StoreController c = new StoreController(model,viev);
        c.UpdateViev();
        c.setProductName("Potato");
        c.setPrice(1.1f);
        c.UpdateViev();

    }
    private static Store retrieveProductFromStore(){
        Store s = new Store();
        s.setProduct("Banana");
        s.setPrice(1.5f);
        return s;
    }
}
