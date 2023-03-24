import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("LCWD");
//        list.add(123); // error, allowed only string

        List anotherList = new ArrayList();
        anotherList.add("LCWD");
        anotherList.add(123);
        anotherList.add(2.32);

        System.out.println(list);
        System.out.println(anotherList);
    }
}
