package design.responsibility.design;

public class DepartmentApprover extends Approver {

    @Override
    public void approve(float price) {
        if(price<=5000){
            System.out.println("学院审批");
        }else {
            approver.approve(price);
        }
    }
}
