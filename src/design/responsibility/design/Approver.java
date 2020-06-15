package design.responsibility.design;

public abstract class Approver {

    Approver approver;

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void approve(float price);
}
