package design.responsibility.design;

public class SchoolMasterApprover extends Approver {
    @Override
    public void approve(float price) {
        if(price>30000){
            System.out.println("校长审批");
        }else {
            approver.approve(price);
        }
    }
}
