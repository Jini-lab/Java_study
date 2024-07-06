public class Main2 {
    public static void main(String[] args) {

        //문자열
        System.out.println("==문자열==");
        String s1 = "Hello world";
        String s2 = "01234";
        System.out.println("s1 = "+s1);
        System.out.println("s2 = "+s2);

        String s3 = "hi";
        String s4 = "hi";
        System.out.println(s3.equals(s4));
        System.out.println(s3==s4);
        String s5 = new String("hi");
        System.out.println(s3.equals(s5));
        System.out.println(s3==s5);


        //indexOf
        //indexOf 는 특정 문자열을 찾아준다.
        // !는 5번째 인덱스에 있다.
        String s6 = "Hello! World!";
        System.out.println(s6.indexOf("!"));

        //뒤에 있는 !를 찾고 싶을 때,
        System.out.println(s6.indexOf("!", s6.indexOf("!") + 1));

        //replace
        //기존의 문자열 사용
        String s7 = s6.replace("Hello", "Bye");
        System.out.println("s7 = "+s7);

        //substring
        //기존의 문자열에서 부분 문자열을 뽑아준다.
        //(시작, 끝);
        System.out.println(s7.substring(0, 3));
        System.out.println(s7.substring(0, s7.indexOf("!") + 1));


        //toUpperCase
        System.out.println(s7.toUpperCase());


        //StringBuffer : 문자열을 추가하거나 변경
        System.out.println("== StringBuffer ==");
        StringBuffer sb1 = new StringBuffer();
        sb1.append("01234");
        System.out.println("sb1 = " + sb1);
        sb1.append("56789");
        System.out.println("sb1 = " + sb1);

        String a = "01234";
        String b = "56789";
        String bak = a;
        System.out.println(a == bak);
        a += b;
        System.out.println(a == bak);

        StringBuffer sb2 = new StringBuffer("name is");
        sb2.insert(0, "My ");
        sb2.insert(sb2.length(), " JAVA");
        System.out.println("sb2 = " + sb2);
        System.out.println(sb2.substring(0, 2));


        //배열
        System.out.println("== 배열 ==");
        int[] myArray1 = {1, 2, 3, 4, 5};
        System.out.println(myArray1[0]);
        System.out.println(myArray1[1]);
        System.out.println(myArray1[2]);
        System.out.println(myArray1[3]);
        System.out.println(myArray1[4]);

        char[] myArray2 = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(myArray2[2]);

        String[] myArray3 = new String[3];
        myArray3[0] = "Hello";
        myArray3[1] = " ";
        myArray3[2] = "World!";
        System.out.println(myArray3[0] + myArray3[1] + myArray3[2]);



    }
}
