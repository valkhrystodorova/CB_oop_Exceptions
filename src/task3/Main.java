package task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Price> stores = new ArrayList<>();
        stores.add(new Price("Cup", "Epicentr", 100));
        stores.add(new Price("Plate", "Butlers", 200));

        stores.sort(Comparator.comparing(Price::getStore));
        System.out.println(stores.toString());

        System.out.println("Enter store name:");
        Scanner sc = new Scanner(System.in);
        String storeName = sc.next();

        try { printStore(stores, storeName);
        }catch (NoSuchElementException ex){
            System.out.println(ex.getMessage());
        }
    }

    private static void printStore(List<Price> stores, String storeName) {
        Price foundStore = findStoreByName(stores, storeName);
        if (foundStore == null){
            throw new NoSuchElementException("Store not found");
        }
        else {
            System.out.println(foundStore);
        }
    }

    private static Price findStoreByName(List<Price> stores, String storeName) {
        for (Price store : stores) {
            if (storeName.equals(store.getStore())) {
                return store;
            }
        }
        return null;
    }
}
