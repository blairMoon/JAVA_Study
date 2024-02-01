package Class;

public class ProductOrderMain {
    public static void main(String[] args) {

        ProductOrder ProductOrder1 = new ProductOrder();
        ProductOrder1.productName = "두부";
        ProductOrder1.price = 2000;
        ProductOrder1.quantity = 2;
        ProductOrder ProductOrder2 = new ProductOrder();
        ProductOrder2.productName = "김치";
        ProductOrder2.price = 5000;
        ProductOrder2.quantity = 1;
        ProductOrder ProductOrder3 = new ProductOrder();
        ProductOrder3.productName = "콜라";
        ProductOrder3.price = 1500;
        ProductOrder3.quantity = 2;

        ProductOrder[] productOrders = {ProductOrder1,ProductOrder2,ProductOrder3};

        int totalAmount = 0;
        for (ProductOrder p : productOrders) {
            totalAmount += p.price * p.quantity;
            System.out.println("상품명: " + p.productName + ", 가격: " + p.price + ", 수량: "+ p.quantity);
        }
        System.out.println("총 결제 금액: " + totalAmount);

    }
}
