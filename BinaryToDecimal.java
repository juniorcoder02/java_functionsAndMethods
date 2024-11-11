public class BinaryToDecimal {
    public static void main(String[] args) {
        int BinNum = 1010;
        BinToDec(BinNum);
        int decimalNum = 12;
        DecToBin(decimalNum);

    }

    // BINARY TO DECIMAL
    public static void BinToDec(int BinNum) {
        int myNum = BinNum;
        int pow = 0;
        int decimalNum = 0;
        while (BinNum > 0) {
            int lastDigit = BinNum % 10;
            decimalNum = decimalNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            BinNum = BinNum / 10;

        }
        System.out.println("Decimal of " + myNum + " is : " + decimalNum);
    }

    // DECIMAL TO BINARY

    public static void DecToBin(int decNum) {
        int myNum = decNum;
        int pow = 0;
        int binNum = 0;
        while (decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            decNum = decNum / 2;

        }
        System.out.println("Binary form of " + myNum + " is : " + binNum);
    }

}
