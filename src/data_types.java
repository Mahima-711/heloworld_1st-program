
public class data_types {
    public static void main(String[] args) {
        //food delivery
        String[] fooditems = {"pizza", "momos", "biriyani"};
        for (int i = 0; i < fooditems.length; i++){
            System.out.println("orderded items are :" +fooditems[i]);
        }
        int customerid = 101;
        double totalbill =250.75;
        boolean isdelivered = true;
        char ratings = 'A';
        long deliveryboynumber = 1111111111;
        float deliverytime = 30.5f;
        System.out.println("Customer ID: " + customerid);
        System.out.println("Total Bill: " + totalbill);
        System.out.println("Delivery Time: " + deliverytime + " minutes");
        System.out.println("Is Delivered: " + isdelivered);
        System.out.println("DeliveryboyNumber: " + deliveryboynumber);
        System.out.println("Ratings: " + ratings);
      

    }
}
