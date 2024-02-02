package ref;

import java.util.Scanner;

public class ProductOrderRefacMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력할 주문의 개수를 입력하세요");
        int orderNum  = scanner.nextInt();

        int totalAmount = 0;
       ProductOrder[] productOrders = collectOrderDetails(orderNum);
        printOrders(productOrders);
        totalAmount = getTotalAmount(productOrders,totalAmount);
        System.out.println("총 결제 금액: " + totalAmount);

    }
    public  static  ProductOrder[] collectOrderDetails(int orderNum){
        ProductOrder[] productOrders = new ProductOrder[orderNum];
        for (int i = 0;i < orderNum;i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println((i+1) +"번째 주문 정보를 입력하세요.");
            System.out.println("상품명:");
            String productName  = scanner.nextLine();
            System.out.println("가격:");
            int productPrice  = scanner.nextInt();
            System.out.println("수량:");
            int productQuantity = scanner.nextInt();
            productOrders[i] = createOrder(productName,productPrice,productQuantity);
        }
        return productOrders;

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
