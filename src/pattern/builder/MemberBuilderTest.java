package pattern.builder;

public class MemberBuilderTest {
    public static void main(String[] args) {
        Member member = Member.builder()
                .name("테스트")
                .age(20)
                .build();
        System.out.print(member);
    }
}
