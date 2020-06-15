package design.strategy.design;

public class Client {
    public static void main(String[] args) {
        MemberContext m = new MemberContext(new QingtongVIP());
        m.VIP();

        MemberContext m2 = new MemberContext();
        m2.setMember(new HuangjinVIP());
        m2.VIP();

        MemberContext m3 = new MemberContext(new ZuanshiVIP());
        m3.VIP();
    }
}
