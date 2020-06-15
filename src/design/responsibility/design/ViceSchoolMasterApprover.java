package design.responsibility.design;

public class ViceSchoolMasterApprover extends Approver {
    @Override
    public void approve(float price) {
        if(price>10000&&price<=30000){
            System.out.println("副校长审批");
        }else {
            approver.approve(price);
        }
    }
}
