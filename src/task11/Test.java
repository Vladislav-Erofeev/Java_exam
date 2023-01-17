package task11;

public class Test {
    public static void main(String[] args) {
        LinkedIntList list = new LinkedIntList();
        list.add(1);
        System.out.println(list);
        list.firstLast();
        list.add(2);
        list.add(2);
        System.out.println(list);
    }
}
