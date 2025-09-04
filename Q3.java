import java.util.*;

class doctor {
    
    int doctorid;
    String name;
    String Specialization;

    doctor(int doctorid,String name, String Specialization){
        this.name=name;
        this.doctorid=doctorid;
        this.Specialization=Specialization;
    }

    void showConsulation(){
        int fee;
        switch(Specialization){

            case "general physician":
             fee=300;
             break;
             
            case "surgeon":
             fee= 1000;
             break;
             
            case "gynecologist":
             fee=700;
             break;
            
             case "cardiologist":
             fee = 500;
             break;

             default:
             System.out.println("Invalid Specialization");
              return;
        }
    System.out.println("Consultation fee of your Specialization is: "+fee);
    }

}

class fee {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter DoctorID: ");
        int doctorid = sc.nextInt();

        System.out.println("Enter your Name: ");
        String name= sc.next();
        sc.nextLine();

        System.out.println("Enter your Specialization: ");
        String Specialization= sc.nextLine();

        doctor obj = new doctor(doctorid,name,Specialization);
        obj.showConsulation();





        
    }
}