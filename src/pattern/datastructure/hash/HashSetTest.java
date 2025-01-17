package pattern.datastructure.hash;

import java.util.*;

public class HashSetTest {
    public static void main(String[] args) {
        Set<Member> memberSet = new HashSet<>();

        Member member1 = new Member("1번", 10);
        Member member2 = new Member("2번", 20);
        Member member3 = new Member("1번", 10);
        memberSet.add(member1);
        memberSet.add(member2);
        memberSet.add(member3);

        Iterator<Member> iterator = memberSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}