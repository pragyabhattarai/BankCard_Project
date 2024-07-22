
/**
 * Write a description of class Credit_Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CreditCard extends BankCard
{
    private int CVCnumber;
    private double CreditLimit;
    private double InterestRate;
    private String ExpirationDate;
    private int GracePeriod;
    private boolean IsGranted;
    
    public CreditCard(int cardId, String clientname, String issurebank, String bankaccount, double BalanceAmount, int CVCnumber, double InterestRate,String ExpirationDate)
    {
        super(BalanceAmount,cardId,bankaccount,issurebank);
        this.CVCnumber=CVCnumber;
        this.InterestRate=InterestRate;
        this.ExpirationDate=ExpirationDate;
        this.IsGranted=false;
    }
    public int getCVCnumber()
    {
        return CVCnumber;
    }
    public double getCreditLimit()
    {
        return CreditLimit;
    }
    public double getInterestRate()
    {
        return InterestRate;
    }
    public String getExpirationDate()
    {
        return ExpirationDate;
    }
    public int getGracePeriod()
    {
        return GracePeriod;
    }
    public boolean getIsGranted()
    {
        return IsGranted;
    }
    public void setCreditLimit(double CreditLimit,int GracePeriod){
        if(this.CreditLimit <= 2.5 * super.getBalanceAmount()){
            this.CreditLimit = CreditLimit;
            this.GracePeriod = GracePeriod;
            this.IsGranted = true;
        }else{
            System.out.println("Credit can be issued");
        }
    }
    public void cancelCreditCard(){
        if(IsGranted){
        this.CVCnumber=0;
        this.CreditLimit=0;
        this.GracePeriod=0;
        this.IsGranted= false;
        System.out.println("CreditCard cancelled");
    }else{
        System.out.println("CreditCard not yet granted");
    
    }
}
    
    public void display()
    {
         super.display();
        if (IsGranted){
            System.out.println("CVCnumbet: "+ CVCnumber);
            System.out.println("CreditLimit: "+ CreditLimit);
            System.out.println("InterestRate: "+ InterestRate);
            System.out.println("ExpirationDate: "+ExpirationDate);
            System.out.println("GracePeriod: "+GracePeriod);
             
        }
        else{
            System.out.println("CVCnumber: " + CVCnumber);
            System.out.println("InterestRate: " + InterestRate);
            System.out.println("ExpirationDate: " + ExpirationDate);
        }
    }
}