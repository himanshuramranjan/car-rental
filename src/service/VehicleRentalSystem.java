package model;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {
    private List<User> users = new ArrayList<>();
    private List<Store> stores = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public void removeUser(User user) {
        this.users.remove(user);
    }

    public List<Store> getStores() {
        return stores;
    }

    public void addStore(Store store) {
        this.stores.add(store);
    }

    public void removeStore(Store store) {
        this.stores.remove(store);
    }

    public List<Store> findStores(Location location) {
        List<Store> nearByStores = new ArrayList<>();
        for(Store store : this.getStores()) {
            if(location.getPincode() == store.getLocation().getPincode()) {
                nearByStores.add(store);
            }
        }
        return nearByStores;
    }
}
