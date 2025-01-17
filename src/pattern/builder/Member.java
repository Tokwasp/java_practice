package pattern.builder;

public class Member {
    private final String name;
    private final int age;

    private Member(MemberBuilder memberBuilder) {
        this.name = memberBuilder.name;
        this.age = memberBuilder.age;
    }

    public static MemberBuilder builder(){
        return new MemberBuilder();
    }

    public static class MemberBuilder{
        private String name;
        private int age;

        public MemberBuilder name(String name){
            this.name = name;
            return this;
        }

        public MemberBuilder age(int age){
            this.age = age;
            return this;
        }

        public Member build(){
            return new Member(this);
        }
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}