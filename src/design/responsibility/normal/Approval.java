package design.responsibility.normal;

public class Approval {

    void approval(float price){
        if(price>=0&&price<=5000){
            System.out.println("教学主任审批");
        }else if(price>5000&&price<=10000){
            System.out.println("院长审批");
        }else if(price>10000&&price<=30000){
            System.out.println("副校长审批");
        }else{
            System.out.println("校长审批");
        }
    }

}
