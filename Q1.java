
class Invoice{

    int InvoiceId;
    String CustomerName;
    double TotalAmount;
    double GST;
     
    Invoice(int InvoiceId , String CustomerName , double TotalAmount){
        
        

        this.InvoiceId = InvoiceId;
        this.CustomerName = CustomerName;
        this.TotalAmount = TotalAmount;
    }

    void CalculateGST(double GST){
        this.GST = GST;
    }

    void generateBill(){
        double gstAmount = (TotalAmount * GST)/100;
        double finalAmount = TotalAmount + gstAmount;
        System.out.println("Invoice Id: "+ InvoiceId);
        System.out.println("Customer Name: "+ CustomerName);
        System.out.println("Total Amount: "+ TotalAmount);
        System.out.println("GST "+ GST +" % on "+ TotalAmount + " is: "+ gstAmount);
        System.out.println("Final Amount: "+ finalAmount);

    }

    public static void main(String[] args) {
        Invoice obj = new Invoice(101,"Aastha",5000);
        obj.CalculateGST(17);
        obj.generateBill();
    }
}