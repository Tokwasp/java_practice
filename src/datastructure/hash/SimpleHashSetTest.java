package datastructure.hash;

public class SimpleHashSetTest {
    public static void main(String[] args) {
        SimpleHashSet<Integer> hashSet = new SimpleHashSet<>();

        // add
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(1);
        System.out.print(hashSet);

        // contains
        boolean contains1 = hashSet.contains(4);
        System.out.println("4 포함 여부 : " + contains1);
        boolean contains2 = hashSet.contains(1);
        System.out.println("1 포함 여부 : " + contains2);

        // remove
        boolean removed1 = hashSet.remove(4);
        System.out.println("4 제거 여부 : " + removed1);
        boolean removed2 = hashSet.remove(1);
        System.out.println("1 제거 여부 : "  + removed2);
    }
}