package LLD.DESIGN_PRINCIPLES.SOLID;

public class BadCodeForSingleResponsibility {
    public static void main(String[] args) {
     BreadBaker baker = new BreadBaker();
     baker.breadBaker();
     baker.manageInventories();
     baker.orderSupplies();
     baker.serverCustomer();
     baker.cleanBakes();
    }
}



class BreadBaker{

    public void breadBaker(){
        System.out.println("Baking high quality breads...");
    }

    public void manageInventories(){
        System.out.println("Managing inventories...");
    }

    public void orderSupplies(){
        System.out.println("Order supplies...");
    }

    public void serverCustomer(){
        System.out.println("Serve orders to customers...");
    }

    public void cleanBakes(){
        System.out.println("Cleaning the bakes...");
    }

}
