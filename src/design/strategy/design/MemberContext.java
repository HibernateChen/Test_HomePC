package design.strategy.design;

public class MemberContext {
    private Member member;

    MemberContext(Member member) {
        this.member = member;
    }

    MemberContext() {
    }

    void VIP(){
        member.VIP();
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
