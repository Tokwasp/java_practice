package pattern.builder;

public class Member {
    private String name;
    private int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
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
            return new Member(this.name,this.age);
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