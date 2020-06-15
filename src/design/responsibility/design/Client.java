package design.responsibility.design;

public class Client {

    public static void main(String[] args) {

        DepartmentApprover da = new DepartmentApprover();
        CollegeApprover ca = new CollegeApprover();
        ViceSchoolMasterApprover vs = new ViceSchoolMasterApprover();
        SchoolMasterApprover sm = new SchoolMasterApprover();

        da.setApprover(ca);
        ca.setApprover(vs);
        vs.setApprover(sm);
        sm.setApprover(da);

        ca.approve(25000f);
    }
}
