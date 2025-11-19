package LLD.DESIGN_PRINCIPLES.SOLID.S;

class breadBakerClass{
    public void breadBaker(){
        System.out.println("Baking high quality breads...");
    }
}

class ManageInventoryClass {
    public void manageInventories(){
        System.out.println("Managing inventories...");
    }
}

class OrderSuppliesClass{
    public void orderSupplies(){
        System.out.println("Order supplies...");
    }
}

class ServerCustomerClass{
    public void serverCustomer(){
        System.out.println("Serve orders to customers...");
    }
}

class CleanBakesClass{
    public void cleanBakes(){
        System.out.println("Cleaning the bakes...");
    }
}


public class GoodCodeForSingleResponsibility {
    public static void main(String[] args) {
        breadBakerClass breadBakerClass = new breadBakerClass();
        breadBakerClass.breadBaker();

        ManageInventoryClass manageInventoryClass = new ManageInventoryClass();
        manageInventoryClass.manageInventories();

        OrderSuppliesClass orderSuppliesClass = new OrderSuppliesClass();
        orderSuppliesClass.orderSupplies();

        ServerCustomerClass serverCustomerClass = new ServerCustomerClass();
        serverCustomerClass.serverCustomer();

        CleanBakesClass cleanBakesClass = new CleanBakesClass();
        cleanBakesClass.cleanBakes();
    }
}
