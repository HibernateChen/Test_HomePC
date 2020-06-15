package design.strategy.normal;

public class Member {

    public void VIP(String vipLevel){
        switch (vipLevel) {
            case "青铜会员":
                System.out.println("执行青铜会员的打折逻辑，打9折");
                break;
            case "白银会员":
                System.out.println("执行白银会员的打折逻辑，打8折");
                break;
            case "黄金会员":
                System.out.println("执行黄金会员的打折逻辑，打7折");
                break;
            case "铂金会员":
                System.out.println("执行铂金会员的打折逻辑，打6折");
                break;
            default:
                System.out.println("不是会员，不打折");
                break;
        }
    }
}
