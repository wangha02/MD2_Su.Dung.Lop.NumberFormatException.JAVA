public class CalculationExample {
    void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tong x + y =  " + a);
            System.out.println("Hieu x - y =  " + b);
            System.out.println("TIch x * y =  " + c);
            System.out.println("Thuong x / y =  " + d);
        } catch (Exception e) {
            System.out.println("Xay ra ngoai le: " + e.getMessage());
        }
    }
}
