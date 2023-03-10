class Invc {
    String name, product;
    int quantity;
    double price, totalPrice;

    Invc(String n, String p, double pi, int q) {
        name = n;
        product = p;
        quantity = q;
        price = pi;
    }
  void display() {
        System.out.println("name : " + name);
        System.out.println("product : " + product);
        System.out.println("quantity : " + quantity);
        System.out.println("price : " + price);
        System.out.println("totalPrice : " + (price*quantity));
    }
}
class Invoice {
    public static void main(String[] args) {
        Invc invoice = new Invc("XYZ", "Books", 550, 3);
        invoice.display();
    }
}