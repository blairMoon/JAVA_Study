package ref;

public class ProductOrderRefacMain {
    public static void main(String[] args) {
        int totalAmount = 0;
        ProductOrder ProductOrder1 = createOrder("두부", 2000,2);
        ProductOrder ProductOrder2 = createOrder("김치", 5000,1);
        ProductOrder ProductOrder3 = createOrder("콜라", 1500,2);

        ProductOrder[] productOrders = {ProductOrder1,ProductOrder2,ProductOrder3};

        printOrders(productOrders);
        totalAmount = getTotalAmount(productOrders,totalAmount);
        System.out.println("총 결제 금액: " + totalAmount);

    }
    public  static  ProductOrder createOrder(String productName , int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;

        return  productOrder;

    }
    public  static  void printOrders(ProductOrder[] productOrders) {
        for (ProductOrder p : productOrders) {
            System.out.println("상품명: " + p.productName + ", 가격: " + p.price + ", 수량: "+ p.quantity);
        }


    }

    public  static  int getTotalAmount(ProductOrder[] productOrders, int totalAmount) {
        for (ProductOrder p : productOrders) {
            totalAmount += p.price * p.quantity;
        }
        return totalAmount;
    }
}
