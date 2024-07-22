
/**
 * Write a description of class Debit_Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DebitCard extends BankCard 
{
    private int PINnumber;
    private double withdrawalAmount;
    private String DateofWithdrawal;
    private boolean haswithdrawn;
    
    public DebitCard(double BalanceAmount, int CardId, String bankaccount, String issuerbank, String clientname, int PINnumber)
    {
        super(BalanceAmount,CardId, bankaccount,issuerbank);
        this.PINnumber=PINnumber;
        this.haswithdrawn = false;
        super.setclientname(clientname);
    }
    public int getPINnumber()
    {
        return PINnumber;
    }
    public double getwithdrawalAmount()
    {
        return withdrawalAmount;
    }
    public String getDateofWithdrawal()
    {
        return DateofWithdrawal;
    }
    public boolean gethaswithdrawn()
    {
        return haswithdrawn;
    }
    public void setwithdrawalAmount (double withdrawalAmount)
    {
        this.withdrawalAmount=withdrawalAmount;
    }
    
    public void withdraw(double withdrawalAmount,String DateofWithdrawal,int PINnumber)
    {
        if(PINnumber == this.PINnumber){
        if(withdrawalAmount <= super.getBalanceAmount()){
            super.setBalanceAmount(super.getBalanceAmount()-withdrawalAmount);
            this.withdrawalAmount = withdrawalAmount ;
            this.DateofWithdrawal = DateofWithdrawal;
            
            
            this.haswithdrawn=true;
            System.out.println("withdrawal successful.your new Balance is "+super.getBalanceAmount());
        }else{
            System.out.println("insufficent funds");
            
        }
        
    }
    else{
        System.out.println("INVALID PIN ! PLEASE TRY AGAIN!");
    }
    
    }
    public void display()
    {
        super.display();
        System.out.println("PINnumber:"+PINnumber);
        
        
        if(haswithdrawn){
        System.out.println("withdrawalAmount:"+withdrawalAmount);
        System.out.println("DateofWithdrawal:"+DateofWithdrawal);
        }else{
            System.out.println("No withdrawal has been made yet");
        }
    }
}

    