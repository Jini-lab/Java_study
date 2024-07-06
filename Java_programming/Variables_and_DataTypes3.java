import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Main3 {
    public static void main(String[] args) {
        //리스트
        System.out.println("== 리스트 ==");
        ArrayList l1 = new ArrayList();

        //add
        l1.add(2);
        l1.add("hello");
        l1.add(3);
        l1.add(4);
        l1.add("world");
        System.out.println("l1 = " + l1);

        l1.add(0, 1);
        System.out.println("l1 = " + l1);

        //get
        System.out.println(l1.get(0));
        System.out.println(l1.get(1));

        //size
        System.out.println(l1.size());


        //remove
        //인덱스 값을 찾아, 삭제
        l1.remove(1);
        System.out.println("l1 = " + l1);

        //값을 찾아 삭제
        l1.remove(Integer.valueOf(1));
        System.out.println("l1 = " + l1);

        l1.remove("hello");
        System.out.println("l1 = " + l1);

        //clear
        l1.clear();
        System.out.println("l1 = " + l1);


        //sort
        ArrayList l2 = new ArrayList();
        l2.add(5);
        l2.add(3);
        l2.add(4);
        System.out.println("l2 = " + l2);

        //naturalOrder() 오름차순 정렬
        l2.sort(Comparator.naturalOrder());
        System.out.println("l2 = " + l2);

        //reverseOrder() 내림차순 정렬
        l2.sort(Comparator.reverseOrder());
        System.out.println("l2 = " + l2);


        // contains : 데이터가 리스트에 있는지 확인
        System.out.println(l2.contains(1));
        System.out.println(l2.contains(3));


        // Maps
        System.out.println("== Maps ==");
        HashMap map = new HashMap();

        //put : 순서대로 나오지 않는다 !
        map.put("kiwi", 9000);
        map.put("apple", 10000);
        map.put("mango", 12000);
        System.out.println("map = " + map);


        //get : value 값을 출력한다.
        System.out.println(map.get("mandarin"));
        System.out.println(map.get("apple"));

        //size
        System.out.println(map.size());

        //remove : 값을 출력한 다음, 삭제됨
        System.out.println(map.remove("hi"));
        System.out.println(map.remove("mango"));
        System.out.println("map = " + map);


        //containsKey: 키값이 맵에 있는지 확인
        System.out.println(map.containsKey("mango"));
        System.out.println(map.containsKey("kiwi"));


        // Generics
        System.out.println("== Generics ==");
        ArrayList l3 = new ArrayList();
        l3.add(1);
        l3.add("hello");
        System.out.println("l3 = " + l3);

        ArrayList<String> l4 = new ArrayList<String>();

        //l4.add(1);
        l4.add("hello");

        HashMap map2 = new HashMap();
        map2.put(123, "id");
        map2.put("apple", 10000);
        System.out.println("map2 = " + map2);

        HashMap<String, Integer> map3 = new HashMap<String, Integer>();

        //map3.put(123, "id");
        map3.put("apple", 10000);
        System.out.println("map3 = " + map3);
    }
}
