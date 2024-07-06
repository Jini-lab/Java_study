//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //정수
        System.out.println("== 숫자 ==");

        int intNum = 10;
        System.out.println("intNum = " + intNum);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        //실수
        float floatNum = 3.14f;
        double doubleNum = 3.14;
        System.out.println("floatNum = " + floatNum);
        System.out.println("doubleNum = " + doubleNum);

        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        //2진수, 8진수, 16진수
        int numBase2 = 0b1100;
        System.out.println("numBase2 = " + numBase2);
        int numBase8 = 014;
        System.out.println("numBase8 = " + numBase8);
        int numBase16 = 0xC;
        System.out.println("numBase16 = " + numBase16); //모두 심진수로 변환되어 출력된다.

        // 그대로 출력
        System.out.println("Ob"+Integer.toBinaryString(numBase2));
        System.out.println("0"+Integer.toOctalString(numBase8));
        System.out.println("0x"+Integer.toHexString(numBase16));

        //부울
        System.out.println("==부울==");
        boolean isPass = true;
        System.out.println("isPass = " + isPass);
        boolean isOk = true;
        System.out.println("isOk = " + isOk);

        //문자
        System.out.println("==문자==");
        char keyFirst = 'a';
        System.out.println("keyFirst = " + keyFirst);
        char keyLast = 'z';
        System.out.println("keyLast = " + keyLast);

        //아스키코드값 출력
        System.out.println((int)keyFirst);
        System.out.println((int)keyLast);



    }
}
