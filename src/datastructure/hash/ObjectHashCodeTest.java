package datastructure.hash;

public class ObjectHashCodeTest {
    public static void main(String[] args) {
        Member member1 = new Member("1번", 10);
        Member member2 = new Member("2번", 20);
        Member member3 = new Member("1번", 10);

        System.out.println(member1);
        System.out.println(member2);
        System.out.println(member3);

        System.out.println(member1.hashCode());
        System.out.println(member3.hashCode());
    }
}