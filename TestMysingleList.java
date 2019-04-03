package InBit;

/**
 * Auther:vincent-Dou
 */
public class TestMysingleList {
    public static void main(String[] agrs) {
        MySingleList list = new MySingleList();
        list.addLast(1);
        list.addLast(22);
        list.display();
        System.out.println("\n===============");
        list.addFirst(35);
        list.display();
        System.out.println("\n==================");
        list.addindex(1,50);
        list.display();
        System.out.println("\n==================");
        list.addindex(5,79);
        list.display();
        System.out.println(list.contains(79));
        list.addLast(50);
        System.out.println(list.getLength());
        System.out.println("\n===========================");
        System.out.println(list.remove(79));
        list.display();
        System.out.println("\n=========================");
        list.removeAllKey(50);
        list.display();
        System.out.println("\n====================");
        list.clear();
        System.out.println("清除后：");
        list.display();
//        35->50->1->22->50-
    }
}
