public class review1 {

    public static void main(String[] args) {
        int price = 1500;

        int taxAmount = tax(price);
        int total = price + taxAmount;
        System.out.println(price + "円の商品の税込価格は" + total + "円（消費税は" + taxAmount + "円）です。");
    }

    static int tax(int price) {

        double rate = 0.1;
        int taxAmount = (int)(price * rate);

        return taxAmount;
    }





    public static int tax(int num1, int num2) {
        int num = num1 + num2 ;
        return num;
    }
}
