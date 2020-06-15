package design.responsibility.design;

public class CollegeApprover extends Approver {
    @Override
    public void approve(float price) {
        if(price>5000&&price<=10000){
            System.out.println("院长审批");
        }else {
            approver.approve(price);
        }
    }
}
